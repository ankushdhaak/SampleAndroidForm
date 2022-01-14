package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name, date, number;
    private CheckBox box;
    private Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        date = findViewById(R.id.Date);
        number = findViewById(R.id.editTextNumber);
        box = findViewById(R.id.checkBox);
        sub = findViewById(R.id.checkBox);

        String[] data = new String[4];
        data[0] = name.getText().toString();
        data[1] = date.getText().toString();
        data[2] = number.getText().toString();
//        data[3]=name.getText().toString();
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Final.class);
                intent.putExtra("data", data);
                startActivity(intent);
                finish();
            }
        });


    }
}
