package k00364744.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void selectFrag(View v){
        Fragment fr;

        if(v == findViewById(R.id.button2)){
            fr = new FragmentTwo();
        }else if (v == findViewById(R.id.button1)){
            fr = new FragmentOne();
        } else if(v == findViewById(R.id.button3)){
            fr = new FragmentThree();
        } else {
            fr = new FragmentFour();
        }

        getFragmentManager().beginTransaction().replace(R.id.fragment_place,fr).commit();
        /*FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place,fr).commit();*/
    }
}