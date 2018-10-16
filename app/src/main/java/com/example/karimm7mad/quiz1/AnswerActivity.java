package com.example.karimm7mad.quiz1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {


    public Button backBtn;
    public TextView m;
    public Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        backBtn = findViewById(R.id.backBtn);
        m=findViewById(R.id.m);
        i = new Intent(this, MainActivity.class);
        String x= getIntent().getExtras().getString("answer");

        if(x.equalsIgnoreCase("russia")){
            m.setText("Correct");
        }
        else{
            m.setText("Wrong");
        }


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });


    }




}
