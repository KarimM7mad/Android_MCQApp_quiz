package com.example.karimm7mad.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public TextView questiontxt;
    public String answer = "";
    public Button submitBtn;

    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//for test
        questiontxt = findViewById(R.id.mm);


        intent = new Intent(this, AnswerActivity.class);
        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer.equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Choose an Answer", Toast.LENGTH_SHORT).show();
                } else {
                    intent.putExtra("answer", answer);
                    startActivity(intent);
                }
            }
        });


    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.canadaBox:
                if (checked)
                    answer = "Canada";
                break;
            case R.id.usBox:
                if (checked)
                    answer = "United States";
                break;
            case R.id.chinaBox:
                if (checked)
                    answer = "China";
                break;
            case R.id.russiaBox:
                if (checked)
                    answer = "Russia";
                break;
        }
    }


}
