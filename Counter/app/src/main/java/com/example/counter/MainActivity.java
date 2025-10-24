 package com.example.counter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button Inc, Dec;
    int counter=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

            txt=findViewById(R.id.txt);
            Inc=findViewById(R.id.IncBtn);
            Dec=findViewById(R.id.DecBtn);

            Inc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txt.setText(""+counter++);
                }


            });
            Dec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txt.setText(""+counter--);
                }
            });


    }
}





