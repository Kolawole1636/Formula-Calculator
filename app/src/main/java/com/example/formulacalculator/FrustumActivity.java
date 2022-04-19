package com.example.formulacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FrustumActivity extends AppCompatActivity {
    EditText radius,bradius,height;
    Button generate;
    TextView result,formula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frustum);

        setTitle("FRUSTUM");

        radius = (EditText) findViewById(R.id.radius);
        bradius = (EditText) findViewById(R.id.bradius);
        height = (EditText) findViewById(R.id.height);
        formula = (TextView) findViewById(R.id.formula);
        result = (TextView) findViewById(R.id.result);
        generate = (Button) findViewById(R.id.generate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double pi = 3.142857;
                double r = Double.parseDouble(radius.getText().toString());
                double R = Double.parseDouble(bradius.getText().toString());
                double h = Double.parseDouble(height.getText().toString());
                double c = Math.pow(R,2) + R*r + Math.pow(r,2);
                double v = (pi*h*c)/3;
                result.setText("The volume of the frustum is "+ v);
                formula.setText("The volume of a frustum is 1/3πh(R^2 + Rr + r^2)");
            }
        });





    }
}