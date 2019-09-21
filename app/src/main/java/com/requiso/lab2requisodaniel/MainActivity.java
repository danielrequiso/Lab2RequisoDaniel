package com.requiso.lab2requisodaniel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText course1, course2, course3, course4, course5, course6, course7, course8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        course1 = findViewById(R.id.editText);
        course2 = findViewById(R.id.editText2);
        course3 = findViewById(R.id.editText3);
        course4 = findViewById(R.id.editText4);
        course5 = findViewById(R.id.editText5);
        course6 = findViewById(R.id.editText6);
        course7 = findViewById(R.id.editText7);
        course8 = findViewById(R.id.editText8);
    }

    public void save(View v) {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String ustc1 = course1.getText().toString();
        String ustc2 = course2.getText().toString();
        String ustc3 = course3.getText().toString();
        String ustc4 = course4.getText().toString();
        String ustc5 = course5.getText().toString();
        String ustc6 = course6.getText().toString();
        String ustc7 = course7.getText().toString();
        String ustc8 = course8.getText().toString();
        editor.putString("course1", ustc1);
        editor.putString("course2", ustc2);
        editor.putString("course3", ustc3);
        editor.putString("course4", ustc4);
        editor.putString("course5", ustc5);
        editor.putString("course6", ustc6);
        editor.putString("course7", ustc7);
        editor.putString("course8", ustc8);
        editor.commit();
        Toast.makeText(this, "Courses Saved...", Toast.LENGTH_LONG).show();

    }

    public void next(View v) {
        Intent i  = new Intent (this, Main2Activity.class);
        startActivity(i);

    }
}
