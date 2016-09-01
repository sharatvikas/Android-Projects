package k00364744.helloworld.tamuk.edu.lifecycledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    String msg = "Alert:";
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.textView);
        text.append("In the onCreate() Method Overide \n");
        System.getProperty("line.separator");
        Log.d(msg,"In the onCreate() Overide Method");
    }
        @Override
        public void onStart() {
        super.onStart();
            text = (TextView)findViewById(R.id.textView);
            text.append("In the onStart() Method Overide \n");
            System.getProperty("line.separator");
            Log.d(msg,"In the onStart() Method Overide");

        }

    @Override
    public void onResume () {
        super.onResume();
        text = (TextView)findViewById(R.id.textView);
        text.append("In the onResume() Method Overide \n");
        System.getProperty("line.separator");
        Log.d(msg,"In the onResume() Method Overide");

    }
    @Override
    public void onPause() {
        super.onPause();
        text = (TextView)findViewById(R.id.textView);
        text.append("In the onPause() Method Overide \n");
        System.getProperty("line.separator");
        Log.d(msg,"In the onPause() Method Overide");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        text = (TextView)findViewById(R.id.textView);
        text.append("In the onRestart() Method Overide \n");
        System.getProperty("line.separator");
        Log.d(msg,"In the onStart() Method Overide");
    }
}