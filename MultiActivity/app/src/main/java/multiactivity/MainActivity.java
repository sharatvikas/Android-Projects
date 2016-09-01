package k00364744.helloworld.tamuk.edu.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "k00364744.helloworld.tamuk.edu.multiactivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void sendMessageFromIntent1(View view)  {
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
    public  void sendMessageFromIntent2(View view)  {
        Intent intent1 = new Intent(this,DisplayNameActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.edit_message);
        String message1 = editText1.getText().toString();
        intent1.putExtra(EXTRA_MESSAGE,message1);
        startActivity(intent1);
    }
}
