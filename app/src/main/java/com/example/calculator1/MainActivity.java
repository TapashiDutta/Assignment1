package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static Button b1,b2;
    EditText e1,e2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editText3);
        e2=findViewById(R.id.editText4);
        t1=findViewById(R.id.textView2);
        b1=findViewById(R.id.button3);
        b2=findViewById(R.id.button4);

        b1.setText("Addition");

    }

    public void onMode(View v) {
        String txt=b1.getText().toString();
        if(txt.equals("Addition")) b1.setText("Subtraction");
        else if(txt.equals("Subtraction")) b1.setText("Multiplication");
        else if(txt.equals("Multiplication")) b1.setText("Division");
        else if(txt.equals("Division")) b1.setText("Addition");
    }

    public void onClicked(View v){
        double num1,num2;
        num1=Double.parseDouble(e1.getText().toString());
        num2=Double.parseDouble(e2.getText().toString());
        String txt=b1.getText().toString();
        if(txt.equals("Addition")) t1.setText(String.valueOf(num1+num2));
        else if(txt.equals("Subtraction")) t1.setText(String.valueOf(num1-num2));
        else if(txt.equals("Multiplication")) t1.setText(String.valueOf(num1*num2));
        else if(txt.equals("Division")) t1.setText(String.valueOf(num1/num2));

    }
}
