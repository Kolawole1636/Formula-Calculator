package com.example.formulacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CircleActivity extends AppCompatActivity {
    EditText radius;
    Button generate;
    TextView result,formula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        setTitle("CIRCLE");

        radius = (EditText) findViewById(R.id.radius);
        formula = (TextView) findViewById(R.id.formula);
        result = (TextView) findViewById(R.id.result);
        generate = (Button) findViewById(R.id.generate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double pi = 3.142857;
                double r = Double.parseDouble(radius.getText().toString());
                double a = pi*(Math.pow(r,2));
                result.setText("The area of the circle is "+ a);
                formula.setText("The area of a circle is πr^2");
            }
        });

    }
}