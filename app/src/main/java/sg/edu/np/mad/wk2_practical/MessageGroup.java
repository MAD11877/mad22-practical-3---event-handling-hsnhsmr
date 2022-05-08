package sg.edu.np.mad.wk2_practical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        Button fragment1 = findViewById(R.id.button3);
        Button fragment2 = findViewById(R.id.button4);

        fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FirstFragment());
            }
        });
        fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new SecondFragment());
            }
        });
    }
    private void loadFragment(Fragment fragment) {
    // create a FragmentManager
        FragmentManager fm = getFragmentManager();
    // create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
    // replace the FrameLayout with new Fragment
        /*fragmentTransaction.replace(R.id.frame, fragment); */
        fragmentTransaction.commit(); // save the changes
    }

}