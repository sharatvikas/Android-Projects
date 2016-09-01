package k00364744.helloworld.tamuk.edu.incasync;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button num;
    TextView textTitle;
    EditText scoreText;
    int x;

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

        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (view == num) {
                    Intent intent = new Intent;
                    startActivity(intent);
            }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String message = scoreText.getText().toString();
            x = Integer.valueOf(message);
            if (v == btn1) {
                x++;
                scoreText.setText(Integer.toString(x));
                scoreText.setBackgroundColor(Color.CYAN);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (v == btn2) {
                    x--;
                    scoreText.setText(Integer.toString(x));
                    scoreText.setBackgroundColor(Color.BLUE);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (view == btn3) {
                    x=0;
                    scoreText.setText(Integer.toString(x));
                    scoreText.setBackgroundColor(Color.YELLOW);
                }
            }
        });
    }

}
