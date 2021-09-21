package com.firstapp.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button_start;
    EditText editTxt, editTxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_start=(Button)findViewById(R.id.button1);
        editTxt=(EditText)findViewById(R.id.username);
        editTxt2=(EditText)findViewById(R.id.password);



        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String guwahati=editTxt.getText().toString();
                int str = Integer.parseInt(editTxt2.getText().toString());
                Intent hi=new Intent(MainActivity.this,Secondary_Activity.class);

                hi.putExtra("username",guwahati);
                hi.putExtra("password",str);
                startActivity(hi);


            }
        });
    }
}