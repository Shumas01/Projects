package com.example.quizappradiobtn;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup Group1, Group2, Group3, Group4;
    Button btnsubmit;
    TextView txtResult; // Added TextView for result display

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Group1 = findViewById(R.id.radioGroup1);
        Group2 = findViewById(R.id.radioGroup2);
        Group3 = findViewById(R.id.radioGroup3);
        Group4 = findViewById(R.id.radioGroup4);
        btnsubmit = findViewById(R.id.btnSubmit);
        txtResult = findViewById(R.id.txtResult); // link with XML

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = 0;
                StringBuilder result = new StringBuilder();

                // Question 1
                int selectedId1 = Group1.getCheckedRadioButtonId();
                if (selectedId1 != -1) {
                    RadioButton selected1 = findViewById(selectedId1);
                    if (selected1.getId() == R.id.radioIslamabad) {
                        score++;
                        result.append("\nQ1: ✅ Correct");
                    } else {
                        result.append("\nQ1: ❌ Wrong (Answer: Islamabad)");
                    }
                } else {
                    result.append("\nQ1: ⚠️ Not Answered");
                }

                // Question 2
                int selectedId2 = Group2.getCheckedRadioButtonId();
                if (selectedId2 != -1) {
                    RadioButton selected2 = findViewById(selectedId2);
                    if (selected2.getId() == R.id.Quaid) {
                        score++;
                        result.append("\nQ2: ✅ Correct");
                    } else {
                        result.append("\nQ2: ❌ Wrong (Answer: Quaid e Azam)");
                    }
                } else {
                    result.append("\nQ2: ⚠️ Not Answered");
                }

                // Question 3
                int selectedId3 = Group3.getCheckedRadioButtonId();
                if (selectedId3 != -1) {
                    RadioButton selected3 = findViewById(selectedId3);
                    if (selected3.getId() == R.id.four) {
                        score++;
                        result.append("\nQ3: ✅ Correct");
                    } else {
                        result.append("\nQ3: ❌ Wrong (Answer: 4)");
                    }
                } else {
                    result.append("\nQ3: ⚠️ Not Answered");
                }

                // Question 4
                int selectedId4 = Group4.getCheckedRadioButtonId();
                if (selectedId4 != -1) {
                    RadioButton selected4 = findViewById(selectedId4);
                    if (selected4.getId() == R.id.markhor) {
                        score++;
                        result.append("\nQ4: ✅ Correct");
                    } else {
                        result.append("\nQ4: ❌ Wrong (Answer: Markhor)");
                    }
                } else {
                    result.append("\nQ4: ⚠️ Not Answered");
                }

                // Show final score
                result.append("\n\nYour Total Score: ").append(score).append("/4");

                // Display result on screen and also show a Toast
                txtResult.setText(result.toString());
                Toast.makeText(getApplicationContext(),
                        "Your Score: " + score + "/4",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
