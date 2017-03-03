package mybrowser.lab5.mybrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Save the String passed with the intent
        String url = getIntent().getDataString();

        if (null == url)
            url = "No Data Provided";

        // Get a reference to the TextView and set the text it to the String
        TextView textView = (TextView) findViewById(R.id.url);
        textView.setText(url);
    }
}
