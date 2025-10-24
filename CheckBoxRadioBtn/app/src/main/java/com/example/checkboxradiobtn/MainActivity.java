package com.example.checkboxradiobtn;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox Pizza, Coffee, Burger;
    Button btnCheck;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // ✅ Always call this first
        setContentView(R.layout.activity_main); // ✅ Attach your layout file

        // ✅ Initialize UI elements after setting content view
        Pizza = findViewById(R.id.checkBx);
        Coffee = findViewById(R.id.checkBx2);
        Burger = findViewById(R.id.checkBx3);
        btnCheck = findViewById(R.id.BtnCheckOut);
        txt = findViewById(R.id.textViewResult); // make sure this ID exists in XML

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalAmount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items:");

                if (Pizza.isChecked()) {
                    result.append("\nPizza 1000Rs");
                    totalAmount += 1000;
                }
                if (Coffee.isChecked()) {
                    result.append("\nCoffee 500Rs");
                    totalAmount += 500;
                }
                if (Burger.isChecked()) {
                    result.append("\nBurger 1200Rs");
                    totalAmount += 1200;
                }

                result.append("\nTotal: " + totalAmount + "Rs");
                txt.setText(result.toString());

                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
