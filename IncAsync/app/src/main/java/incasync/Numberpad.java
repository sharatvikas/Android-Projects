package k00364744.helloworld.tamuk.edu.incasync;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Numberpad extends AppCompatActivity {
    EditText scoreText;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,done;
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numberpad);
        scoreText = (EditText) findViewById(R.id.editText);
        btn1 = (Button) findViewById(R.id.bt1);
        btn2 = (Button) findViewById(R.id.bt2);
        btn3 = (Button) findViewById(R.id.bt3);
        btn4 = (Button) findViewById(R.id.bt4);
        btn5 = (Button) findViewById(R.id.bt5);
        btn6 = (Button) findViewById(R.id.bt6);
        btn7 = (Button) findViewById(R.id.bt7);
        btn8 = (Button) findViewById(R.id.bt8);
        btn9 = (Button) findViewById(R.id.bt9);
        btn0 = (Button) findViewById(R.id.bt0);
        done = (Button) findViewById(R.id.done);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (v == btn1) {
                    x=1;
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
                    x=2;
                    scoreText.setText(Integer.toString(x));
                    scoreText.setBackgroundColor(Color.CYAN);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (v == btn3) {
                    x=3;
                    scoreText.setText(Integer.toString(x));
                    scoreText.setBackgroundColor(Color.CYAN);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (v == btn4) {
                    x=4;
                    scoreText.setText(Integer.toString(x));
                    scoreText.setBackgroundColor(Color.CYAN);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (v == btn5) {
                    x=5;
                    scoreText.setText(Integer.toString(x));
                    scoreText.setBackgroundColor(Color.CYAN);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (v == btn6) {
                    x=6;
                    scoreText.setText(Integer.toString(x));
                    scoreText.setBackgroundColor(Color.CYAN);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (v == btn7) {
                    x=7;
                    scoreText.setText(Integer.toString(x));
                    scoreText.setBackgroundColor(Color.CYAN);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (v == btn8) {
                    x=8;
                    scoreText.setText(Integer.toString(x));
                    scoreText.setBackgroundColor(Color.CYAN);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (v == btn9) {
                    x=9;
                    scoreText.setText(Integer.toString(x));
                    scoreText.setBackgroundColor(Color.CYAN);
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (v == btn0) {
                    x=0;
                    scoreText.setText(Integer.toString(x));
                    scoreText.setBackgroundColor(Color.CYAN);
                }
            }
        });
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = scoreText.getText().toString();
                x = Integer.valueOf(message);
                if (v == done) {
                    x=;
                    scoreText.setText(Integer.toString(x));
                    scoreText.setBackgroundColor(Color.CYAN);
                }
            }
        });btn1.setOnClickListener(new View.OnClickListener() {
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
        });btn1.setOnClickListener(new View.OnClickListener() {
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
    }
}
