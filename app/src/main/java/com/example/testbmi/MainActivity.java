package com.example.testbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private TextView showBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = findViewById(R.id.edHeight);
        weight = findViewById(R.id.edWeight);
        showBMI = findViewById(R.id.tvShowBMI);
    }

    public void calBMI(View view)
    {
        if(height.getText().toString().isEmpty() || weight.getText().toString().isEmpty())
        {
            showBMI.setText("請輸入身高或體重的數值");
        }
        else
            {
        double h = Double.parseDouble(height.getText().toString());
        double w = Double.parseDouble(weight.getText().toString());
        double bmi = w / ((h/100.0)*(h/100.0));
        String txt= "";
        if(bmi<18.5){
            txt= "體重過輕";
        } else if (bmi>25){
            txt= "體重過重";
        } else {
            txt= "體重正常";
        }
        showBMI.setText(String.valueOf(bmi));
            }
    }
}