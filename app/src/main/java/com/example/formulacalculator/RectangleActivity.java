package com.example.formulacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RectangleActivity extends AppCompatActivity {
EditText length,breadth;
Button generate;
TextView result,formula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        setTitle("RECTANGLE");


        length = (EditText) findViewById(R.id.length);
        breadth = (EditText) findViewById(R.id.breadth);
        result = (TextView) findViewById(R.id.result);
        formula = (TextView) findViewById(R.id.formula);
        generate = (Button) findViewById(R.id.generate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double l= Double.parseDouble(length.getText().toString());
                double b= Double.parseDouble(breadth.getText().toString());
                double p =2*(l+b);
                result.setText("The perimeter of the rectangle is "+ p);
                formula.setText("Perimeter of a rectangle is 2(L+B)");
            }
        });




    }
}