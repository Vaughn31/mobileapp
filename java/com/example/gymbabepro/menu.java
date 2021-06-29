package com.example.gymbabepro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    Button chestbutton, armsbutton, shoulderbutton, ubbutton, lbbutton, absbutton, atbutton, btbutton, calfbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        chestbutton = (Button) findViewById(R.id.chestbutton);
        armsbutton = (Button) findViewById(R.id.armsbutton);
        shoulderbutton = (Button) findViewById(R.id.shoulderbutton);
        ubbutton = (Button) findViewById(R.id.ubbutton);
        lbbutton = (Button) findViewById(R.id.lbbutton);
        absbutton = (Button) findViewById(R.id.absbutton);
        atbutton = (Button) findViewById(R.id.atbutton);
        btbutton = (Button) findViewById(R.id.btbutton);
       calfbutton = (Button) findViewById(R.id.calfbutton);


        chestbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Create();
            }
        });

        armsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Create1();
            }
        });
        shoulderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Create2();
            }
        });

        ubbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Create3();
            }
        });

        lbbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Create4();
            }
        });

        absbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Create5();
            }
        });

        atbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Create6();
            }
        });

        btbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Create7();
            }
        });

        calfbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Create8();
            }
        });
    }

    public void Create(){
        Intent intent = new Intent(this, chest.class);
        startActivity(intent);
    }

    public void  Create1(){
        Intent intent = new Intent(this, arms.class);
        startActivity(intent);
    }

    public void  Create2(){
        Intent intent = new Intent(this, shoulder.class);
        startActivity(intent);
    }

    public void  Create3(){
        Intent intent = new Intent(this, ub.class);
        startActivity(intent);
    }

    public void  Create4(){
        Intent intent = new Intent(this, lb.class);
        startActivity(intent);
    }

    public void  Create5(){
        Intent intent = new Intent(this, abs.class);
        startActivity(intent);
    }

    public void  Create6(){
        Intent intent = new Intent(this, at.class);
        startActivity(intent);
    }

    public void  Create7(){
        Intent intent = new Intent(this, bt.class);
        startActivity(intent);
    }

    public void  Create8(){
        Intent intent = new Intent(this, calf.class);
        startActivity(intent);
    }


}