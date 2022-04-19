package com.example.formulacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HemisphereActivity extends AppCompatActivity {
    EditText radius;
    Button generate;
    TextView result,formula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hemisphere);

        setTitle("HEMISPHERE");

        radius = (EditText) findViewById(R.id.radius);
        formula = (TextView) findViewById(R.id.formula);
        result = (TextView) findViewById(R.id.result);
        generate = (Button) findViewById(R.id.generate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double pi = 3.142857;
                double r = Double.parseDouble(radius.getText().toString());
                double v = ((4/3)*pi*(Math.pow(r,3)))/2;
                result.setText("The volume of the hemisphere is "+ v);
                formula.setText("The volume of an hemisphere is (2/3)πr^3");
            }
        });

    }
}