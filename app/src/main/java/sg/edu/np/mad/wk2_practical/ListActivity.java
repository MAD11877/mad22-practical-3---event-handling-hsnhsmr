package sg.edu.np.mad.wk2_practical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ab = new AlertDialog.Builder(ListActivity.this);
                ab.setTitle("Profile");
                ab.setMessage("MADness");
                ab.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       Random r = new Random();
                        int randomNo = r.nextInt(1000-1) + 1000;
                        Intent in = new Intent(ListActivity.this, MainActivity.class);
                        in.putExtra("MAD", randomNo);
                        startActivity(in);
                    }
                });
                ab.show();

            }
        });


    }
}