package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.pm.ActivityInfo;

public class MainActivity extends AppCompatActivity {

    EditText edittext;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPoint,btnAdd,btnSub,btnMul,btnDiv, btnEq;
    Button btnScientific;

    float value1, value2;
    Boolean Add, Sub, Mul, Div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edittext=findViewById(R.id.edttxt);
        btn0=findViewById(R.id.Btn0);
        btn1=findViewById(R.id.Btn1);
        btn2=findViewById(R.id.Btn2);
        btn3=findViewById(R.id.Btn3);
        btn4=findViewById(R.id.Btn4);
        btn5=findViewById(R.id.Btn5);
        btn6=findViewById(R.id.Btn6);
        btn7=findViewById(R.id.Btn7);
        btn8=findViewById(R.id.Btn8);
        btn9=findViewById(R.id.Btn9);
        btnPoint=findViewById(R.id.Btndot);
        btnAdd=findViewById(R.id.BtnPlus);
        btnSub=findViewById(R.id.BtnMinus);
        btnMul=findViewById(R.id.BtnMul);
        btnDiv=findViewById(R.id.BtnDiv);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText()+"9");
            }
        });


        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText()+".");
            }
        });
        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value2= Float.parseFloat(edittext.getText()+"");
                    if (Add==true){
                        edittext.setText(value1 + value2+ "");
                        Add=false;
                    }
                    if(Sub==true){
                        edittext.setText(value1 - value2+"");
                        Sub=false;

                    }
                    if(Mul==true){
                        edittext.setText(value1 *value2+"");
                        Mul=false;

                    }
                    if(Div==true){
                        edittext.setText(value1/value2+"");
                        Div=false;

                    }



            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            value1= Float.parseFloat(edittext.getText()+"");
            Add= true;
            edittext.setText("");


            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1= Float.parseFloat(edittext.getText()+"");
                Sub= true;
                edittext.setText("");

            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1= Float.parseFloat(edittext.getText()+"");
                Mul= true;
                edittext.setText("");

            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1= Float.parseFloat(edittext.getText()+"");
                Div= true;
                edittext.setText("");
            }
        });


    }
}