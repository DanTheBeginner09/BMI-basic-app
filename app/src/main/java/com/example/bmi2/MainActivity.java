package com.example.bmi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weight, height;
    Button bntSubmit;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        bntSubmit =findViewById(R.id.btnSubmit);
        result = findViewById(R.id.result);

       bntSubmit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               float fheight = Float.parseFloat(String.valueOf(height.getText())) / 100;
               float fweight = Float.parseFloat(String.valueOf(weight.getText()));
               float bmi = fweight / (fheight * fheight);

               result.setText(String.valueOf(bmi));




           }
       });

    }
}