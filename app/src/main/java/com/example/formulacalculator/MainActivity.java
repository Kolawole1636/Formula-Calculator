package com.example.formulacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button rectangle,circle,cylinder,cone,equation,arc,sector,frustum,sasphere,vsphere,hemisphere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rectangle =(Button) findViewById(R.id.rectangle);
        circle =(Button) findViewById(R.id.circle);
        cylinder =(Button) findViewById(R.id.cylinder);
        cone =(Button) findViewById(R.id.cone);
        arc =(Button) findViewById(R.id.arc);
        sector =(Button) findViewById(R.id.sector);
        frustum =(Button) findViewById(R.id.frustum);
        sasphere =(Button) findViewById(R.id.sasphere);
        vsphere =(Button) findViewById(R.id.vsphere);
        hemisphere = (Button) findViewById(R.id.vhem);
        equation =(Button) findViewById(R.id.equation);

        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RectangleActivity.class);
                startActivity(intent);
            }
        });

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CircleActivity.class);
                startActivity(intent);
            }
        });
        cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CylinderActivity.class);
                startActivity(intent);
            }
        });
        cone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ConeActivity.class);
                startActivity(intent);
            }
        });
        equation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,QuadraticActivity.class);
                startActivity(intent);
            }
        });
        arc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ArcActivity.class);
                startActivity(intent);
            }
        });
        sector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SectorActivity.class);
                startActivity(intent);
            }
        });
        frustum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FrustumActivity.class);
                startActivity(intent);
            }
        });
        sasphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SphereAreaActivity.class);
                startActivity(intent);
            }
        });
        vsphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SphereVolumeActivity.class);
                startActivity(intent);
            }
        });

        hemisphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HemisphereActivity.class);
                startActivity(intent);
            }
        });








    }
}