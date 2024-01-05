package com.example.viewsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bttn;
    EditText txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttn = (Button)findViewById(R.id.btn01);
        txt1 = (EditText)findViewById(R.id.userId);
        txt2 = (EditText) findViewById(R.id.pass);
        bttn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(txt1.getText().toString().isEmpty() && txt2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter All The Fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}