package com.example.formulacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class QuadraticActivity extends AppCompatActivity {
    EditText square,linear,constant;
    Button generate;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic);

        setTitle("QUADRATIC EQUATION");

        square = (EditText) findViewById(R.id.square);
        linear = (EditText) findViewById(R.id.linear);
        constant = (EditText) findViewById(R.id.constant);
        result = (TextView) findViewById(R.id.result);
        generate = (Button) findViewById(R.id.generate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double pi = 3.142;
                double a = Double.parseDouble(square.getText().toString());
                double b = Double.parseDouble(linear.getText().toString());
                double c = Double.parseDouble(constant.getText().toString());
                double d = (Math.pow(b,2)) - 4*a*c;
                double sqr =Math.sqrt(d);
                double x1 = (-b + sqr)/(2*a);
                double x2 = (-b - sqr)/(2*a);
                result.setText("The two values are "+ "x1 = "+ x1 +" and x2 = "+x2);
            }
        });




    }
}