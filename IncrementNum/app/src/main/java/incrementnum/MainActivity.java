package k00364744.helloworld.tamuk.edu.incrementnum;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    Button btn2;
    Button btn3;
    Button num;
    TextView textTitle;
    EditText scoreText;
    int x;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Number Entered" + x);
        num = (Button) findViewById(R.id.num);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        scoreText = (EditText) findViewById(R.id.editText);
        textTitle = (TextView) findViewById(R.id.myTitle);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        textTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
    }
    @Override
    public void onClick(View v) {

        String message = scoreText.getText().toString();
        x = Integer.valueOf(message);
        if (v == btn1) {
            x++;
            scoreText.setText(Integer.toString(x));
            scoreText.setBackgroundColor(Color.CYAN);
        }
        if (v == btn2) {
            x--;
            scoreText.setText(Integer.toString(x));
            scoreText.setBackgroundColor(Color.YELLOW);
        }
        if (v == btn3) {
            x=0;
            scoreText.setText(Integer.toString(x));
            scoreText.setBackgroundColor(Color.BLUE);
        }

    }
}
