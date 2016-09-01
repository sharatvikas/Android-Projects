package k00364744.helloworld.tamuk.edu.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    String total = "";
    double x1, x2;
    String sign = "";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Button b = (Button) v;
        String s = b.getText().toString();
        total = total + s;
        EditText val = (EditText) findViewById(R.id.output);
        val.setText(total);
    }

    public void onClickClear(View v) {
        EditText val = (EditText) findViewById(R.id.output);
        val.setText("0");
        total = "";
        Toast.makeText(getApplicationContext(),"Clear Content",Toast.LENGTH_SHORT).show();
    }

    public void onOperate(View v) {
        x1 = Double.parseDouble(total);
        total = "";
        Button b = (Button) v;
        String s1 = b.getText().toString();
        sign = s1;
        EditText edit = (EditText) findViewById(R.id.output);
        edit.setText("");
        if (s1 .equals("+")){
            edit.setText("+");
            Toast.makeText(getApplicationContext(),"Addition Operation (+)",Toast.LENGTH_SHORT).show();
        } else if (s1.equals("-")){
            edit.setText("-");
            Toast.makeText(getApplicationContext(),"Subtraction Operation (-)",Toast.LENGTH_SHORT).show();
        }else if (s1.equals("*")){
            edit.setText("*");
            Toast.makeText(getApplicationContext(),"Multiplication Operation (*)",Toast.LENGTH_SHORT).show();
        }else if (s1.equals("/")){
            edit.setText("/");
            Toast.makeText(getApplicationContext(),"Division Operation (/)",Toast.LENGTH_SHORT).show();
        } else if(s1.equals("cube")){
            edit.setText("x3");
            edit.setText(x1*x1*x1+"");
            Toast.makeText(getApplicationContext(),"Cube Value: x3",Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(getApplicationContext(),"Invalid Operation!",Toast.LENGTH_SHORT).show();
    }

    public void onCalculate(View v) {
        EditText edit = (EditText) findViewById(R.id.output);
        String s2 = edit.getText().toString();
        x2 = Double.parseDouble(s2);

        double Final = 0;
        if (sign.equals("+")) {
            Final = x1 + x2;
        } else if (sign.equals("-")) {
            Final = x1 - x2;
        } else if (sign.equals("*")) {
            Final = x1 * x2;
        } else if (sign.equals("/")) {
            Final = x1 / x2;
        }
        if (sign.equals("cube"))  {
            Final= x1*x1*x1;
            edit.setText(Final+ "");
        }
        try {
            edit.setText(Final + "");
            Toast.makeText(getApplicationContext(),"Result Equals (=)",Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Log.d("Calculator", e.getMessage());
        }
    }
}