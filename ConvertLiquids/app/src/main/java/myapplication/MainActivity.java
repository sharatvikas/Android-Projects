package k00364744.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private Spinner spinner1, spinner2;
        private EditText textField1;
        private TextView textView;
        private Double number;

       @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            AdapterView.OnItemSelectedListener onSpinner = new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            };

            setContentView(R.layout.activity_main);

            setSpinnerItems();
            spinner1.setOnItemSelectedListener(onSpinner);

        }


        public void convertvolume(View view) {

            InputMethodManager inputManager = (InputMethodManager)
                    getSystemService(Context.INPUT_METHOD_SERVICE);

            inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                    InputMethodManager.HIDE_NOT_ALWAYS);

            Converter converter = new Converter();
            textField1 = (EditText) findViewById(R.id.volume_input);

            String numStr = textField1.getText().toString();

            if (numStr.equals("")) {
                number = 0.0;
            } else if (numStr.equals(".")) {
                number = 0.0;
            } else if (numStr.contains("..")) {
                number = 0.0;
            } else {
                number = new Double(numStr);
            }


            textView = (TextView) findViewById(R.id.volume_textView2);


            String originalUnits = spinner1.getSelectedItem().toString();
            String newUnits = spinner2.getSelectedItem().toString();

             Double finalNumber = converter.volumeConvert(number, originalUnits, newUnits);
            String finalString = Double.toString(finalNumber);
            textView.setText(finalString);
        }


        public void setSpinnerItems() {
            spinner1 = (Spinner) findViewById(R.id.volume_unit_spinner1);
            spinner2 = (Spinner) findViewById(R.id.volume_unit_spinner2);

            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                    R.array.volume_units, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner1.setAdapter(adapter);
            spinner2.setAdapter(adapter);
        }
    }