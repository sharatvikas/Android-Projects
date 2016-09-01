package k00364744.helloworld.tamuk.edu.sharedpreferences;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    CheckBox checkbox1,checkbox2,checkbox3,checkbox4;
    EditText editText1;
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkbox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkbox4 = (CheckBox) findViewById(R.id.checkbox4);
        editText1 = (EditText) findViewById(R.id.editText1);
        button1 = (Button) findViewById(R.id.saveButton);
        button2 = (Button) findViewById(R.id.exitButton);
        loadSavedPreferences();
    }
    private void loadSavedPreferences() {
        SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
        boolean checkboxvalue1 = sharedpref.getBoolean("GraphicsCoProc",false);
        boolean checkboxvalue2 = sharedpref.getBoolean("ExtendedMemory",false);
        boolean checkboxvalue3 = sharedpref.getBoolean("TouchScreen",false);
        boolean checkboxvalue4 = sharedpref.getBoolean("HighSpeedNet",false);
        String memSize =sharedpref.getString("RAMCapacity","2");

        if(checkboxvalue1) {
            checkbox1.setChecked((true));
        }else   checkbox1.setChecked(false);
        if(checkboxvalue2) {
            checkbox2.setChecked((true));
        }else checkbox2.setChecked(false);
        if(checkboxvalue3) {
            checkbox3.setChecked((true));
        }else checkbox3.setChecked((false));
        if(checkboxvalue4) {
            checkbox4.setChecked((true));
        } else checkbox4.setChecked(false);

        editText1.setText(memSize);
    }

    private void savePreferences(String key,boolean value)  {
        SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedpref.edit();
        editor.putBoolean(key,value);
        editor.apply();
    }
    private void savePreferences(String key,String value)  {
        SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedpref.edit();
        editor.putString(key,value);
        editor.apply();
    }
    public void saveValue(View view)   {
        savePreferences("GraphicsCoProc",checkbox1.isChecked());
        savePreferences("ExtendedMemory",checkbox2.isChecked());
        savePreferences("TouchScreen",checkbox3.isChecked());
        savePreferences("HighSpeedNet",checkbox4.isChecked());
        savePreferences("RAMCapacity",editText1.getText().toString());
    }
    public void exitApp(View view)  {
        finish();
    }
}
