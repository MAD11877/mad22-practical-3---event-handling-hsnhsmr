package sg.edu.np.mad.wk2_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    User u = new User();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.button) {
                    if (u.followed == false) {
                        u.followed = true;
                        b.setText("Unfollow");
                        Toast.makeText(MainActivity.this, "followed", Toast.LENGTH_LONG)
                                .show();
                    } else {
                        u.followed = false;
                        b.setText("Follow");
                        Toast.makeText(MainActivity.this, "unfollowed", Toast.LENGTH_LONG)
                                .show();
                    }
                }
            }
        });

        Intent intent = getIntent();
        Integer rand = intent.getIntExtra("MAD", 0);
        TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.setText("MAD " + rand.toString());

        Button b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(in);
            }
        });
    }


   /* public void onClick(View v) {

        /*b.setText("Unfollow");
        boolean status = u.getFollowed();
        if (v.getId() == R.id.button) {
            if (status == false) {
                status = true;
                b.setText("Unfollow");
            } else {
                status = false;
                b.setText("Follow");
            }
        }

    } */
}