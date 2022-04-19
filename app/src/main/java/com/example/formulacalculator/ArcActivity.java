package com.example.formulacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ArcActivity extends AppCompatActivity {
    EditText radius,theta;
    Button generate;
    TextView result,formula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc);

        setTitle("ARC");

        radius = (EditText) findViewById(R.id.radius);
        theta = (EditText) findViewById(R.id.theta);
        formula = (TextView) findViewById(R.id.formula);
        result = (TextView) findViewById(R.id.result);
        generate = (Button) findViewById(R.id.generate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double pi = 3.142;
                double t = Double.parseDouble(theta.getText().toString());
                double r = Double.parseDouble(radius.getText().toString());
                double l = (t/360)*2*pi*r;
                result.setText("The length of the arc is "+ l);
                formula.setText("The length of an arc is (ϴ/360)x2πr");
            }
        });

    }
}