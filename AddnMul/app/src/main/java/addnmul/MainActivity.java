package k00364744.helloworld.tamuk.edu.addnmul;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etNum1;
    EditText etNum2;
    Button btnMul;
    Button btnAdd;
    TextView tvResult;
    String oper="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNum1);
            etNum2 = (EditText) findViewById(R.id.etNum2);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btnMul.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        float num1=0;
        float num2=0;
        float result=0;

        if(TextUtils.isEmpty(etNum1.getText().toString()) || TextUtils.isEmpty(etNum2.getText().toString()))
        {
            return;
        }
        num1=Float.parseFloat(etNum1.getText().toString());
        num2=Float.parseFloat(etNum2.getText().toString());

        switch (view.getId())   {
            case R.id.btnMul:
                oper="*";
                result=num1*num2;
                break;
            case R.id.btnAdd:
                oper="+";
                result=num1+num2;
                break;
            default:
                break;
        }
        tvResult.setText("Result ="+result);
    }
}
