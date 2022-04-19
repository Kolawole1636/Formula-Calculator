package com.example.formulacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CylinderActivity extends AppCompatActivity {
    EditText radius,height;
    Button generate;
    TextView result,formula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        setTitle("CYLINDER");

        radius = (EditText) findViewById(R.id.radius);
        height = (EditText) findViewById(R.id.height);
        formula = (TextView) findViewById(R.id.formula);
        result = (TextView) findViewById(R.id.result);
        generate = (Button) findViewById(R.id.generate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double pi = 3.142857;
                double h = Double.parseDouble(height.getText().toString());
                double r = Double.parseDouble(radius.getText().toString());
                double v = pi*(Math.pow(r,2))*h;
                result.setText("The volume of the cylinder is "+ v);
                formula.setText("The volume of a cylinder is πr^2h");
            }
        });

    }
}