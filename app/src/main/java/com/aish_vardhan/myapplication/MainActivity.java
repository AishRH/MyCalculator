package com.aish_vardhan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4;
    EditText e1,e2;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        textview=findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Integer i1=Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);

                Integer i3=i1/i2;
                String s3=Integer.toString(i3);
                textview.setText(s3);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Integer i1=Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);

                Integer i3=i1+i2;
                String s3=Integer.toString(i3);
                textview.setText(s3);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Integer i1=Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);
                Integer i3=i1*i2;
                String s3=Integer.toString(i3);
                textview.setText(s3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Integer i1=Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);
                Integer i3=i1-i2;
                String s3=Integer.toString(i3);
                textview.setText(s3);
            }
        });

    }
}