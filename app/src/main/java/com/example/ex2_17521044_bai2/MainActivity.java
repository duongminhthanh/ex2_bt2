package com.example.ex2_17521044_bai2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Button btn_red= (Button)findViewById(R.id.btn_red);
        Button btn_blue= (Button)findViewById(R.id.btn_blue);
        Button btn_green= (Button)findViewById(R.id.btn_green);
        Button btn_gray= (Button)findViewById(R.id.btn_gray);
        RadioButton rd_red=(RadioButton)findViewById(R.id.rd_red);
        RadioButton rd_blue=(RadioButton)findViewById(R.id.rd_blue);
        RadioButton rd_green=(RadioButton)findViewById(R.id.rd_green);
        RadioButton rd_gray=(RadioButton)findViewById(R.id.rd_gray);
        ConstraintLayout l1=(ConstraintLayout)findViewById(R.id.ConstraintLayout);
        btn_red.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_red.setBackgroundColor(Color.RED);
            }
        } );
        btn_blue.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_blue.setBackgroundColor(Color.BLUE);
            }
        } );
        btn_gray.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_gray.setBackgroundColor( Color.GRAY);
            }
        } );
        btn_green.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_green.setBackgroundColor(Color.GREEN);
            }
        } );
        rd_red.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l1.setBackgroundColor(Color.RED);
            }
        } );
        rd_blue.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l1.setBackgroundColor(Color.BLUE);
            }
        } );
        rd_gray.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l1.setBackgroundColor(Color.GRAY);
            }
        } );
        rd_green.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l1.setBackgroundColor(Color.GREEN);
            }
        } );
    }
}