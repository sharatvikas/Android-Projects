package k00364744.basefrag;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }
    public void selectFrag(View view) {
        Fragment frag;

        if (view == findViewById(R.id.button)) {
            frag = new FragmentThree();
        } else if (view == findViewById(R.id.button1)) {
            frag = new FragmentOne();
        } else {
            frag = new FragmentOne();
        }

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragTransaction = fragmentManager.beginTransaction();
        fragTransaction.replace(R.id.fragment_place, frag);
        fragTransaction.commit();
    }
}
