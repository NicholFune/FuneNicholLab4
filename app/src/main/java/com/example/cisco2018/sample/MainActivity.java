package com.example.cisco2018.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.Snackbar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.snackbarButton);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                View view = findViewById(R.id.constraintlayout);
                String message = "Snackbar message";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });

        Toast toast = Toast.makeText(getApplicationContext(),
                "This is a message displayed in a Toast",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    public void showSnackbar(View view, String message, int duration)
    {
        final Snackbar snackbar = Snackbar.make(view, message, duration);

        snackbar.setAction("DISMISS", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });

        snackbar.show();
    }
}
