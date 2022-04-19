package com.example.formulacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SphereAreaActivity extends AppCompatActivity {
    EditText radius;
    Button generate;
    TextView result,formula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_area);

        setTitle("S.A SPHERE");

        radius = (EditText) findViewById(R.id.radius);
        formula = (TextView) findViewById(R.id.formula);
        result = (TextView) findViewById(R.id.result);
        generate = (Button) findViewById(R.id.generate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double pi = 3.142857;
                double r = Double.parseDouble(radius.getText().toString());
                double a = 4*pi*(Math.pow(r,2));
                result.setText("The surface area of the sphere is "+ a);
                formula.setText("The surface area of a sphere is 4πr^2");
            }
        });

    }
}