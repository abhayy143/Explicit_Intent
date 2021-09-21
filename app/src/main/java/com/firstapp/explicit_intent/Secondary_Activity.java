package com.firstapp.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secondary_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        Intent abc= getIntent();
        String str= abc.getStringExtra("username");
        int no= abc.getIntExtra("password",0);
        TextView txt1=findViewById(R.id.uname);
        TextView txt2=findViewById(R.id.pwd);
        txt1.setText(str);
        txt2.setText(String.valueOf(no));
    }
}