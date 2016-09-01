package k00364744.helloworld.tamuk.edu.printname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private EditText editText;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText)findViewById(R.id.et_text);
        result= (TextView)findViewById(R.id.result);
    }

    public void setResult(View view) {
        result.setText("Welcome "+editText.getText().toString()+", "+getText(R.id.kid));
    }
}
