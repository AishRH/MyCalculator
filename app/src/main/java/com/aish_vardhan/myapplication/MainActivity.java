package com.aish_vardhan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4;
    EditText e1,e2;
    TextView textview;
    TextToSpeech ts;

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
        ts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.7f);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                float i1=Float.parseFloat(s1);
                float i2=Float.parseFloat(s2);

                Float i3=i1/i2;
                String s3=Float.toString(i3);
                textview.setText(s3);
                ts.speak("The result is"+s3,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float i1=Float.parseFloat(s1);
                Float i2=Float.parseFloat(s2);
                Float i3=i1+i2;
                String s3=Float.toString(i3);
                textview.setText(s3);
                ts.speak("The result is"+s3,TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float i1=Float.parseFloat(s1);
                Float i2=Float.parseFloat(s2);
                Float i3=i1*i2;
                String s3=Float.toString(i3);
                textview.setText(s3);
                ts.speak("The result is"+s3,TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float i1=Float.parseFloat(s1);
                Float i2=Float.parseFloat(s2);
                Float i3=i1-i2;
                String s3=Float.toString(i3);
                textview.setText(s3);
                if (i3<0)
                ts.speak("The result is minus"+s3,TextToSpeech.QUEUE_FLUSH,null);
                else ts.speak("The result is minus"+s3,TextToSpeech.QUEUE_FLUSH,null);


            }
        });

    }
}