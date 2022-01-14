package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Final extends AppCompatActivity {

    private
    TextView name,date,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        name=findViewById(R.id.name1);
        date=findViewById(R.id.date1);
        number=findViewById(R.id.number1);

        String [] data=getIntent().getStringArrayExtra("data");

        name.setText(data[0]);
        date.setText(data[1]);
        number.setText(data[2]);

    }
}

