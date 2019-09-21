package com.requiso.lab2requisodaniel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText course1, course2, course3, course4, course5, course6, course7, course8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        course1 = findViewById(R.id.editText9);
        course2 = findViewById(R.id.editText9);
        course3 = findViewById(R.id.editText9);
        course4 = findViewById(R.id.editText9);
        course5 = findViewById(R.id.editText9);
        course6 = findViewById(R.id.editText9);
        course7 = findViewById(R.id.editText9);
        course8 = findViewById(R.id.editText9);
    }

    public void check(View v) {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        String ustcSP1 = sp.getString("course1", null);
        String ustcSP2 = sp.getString("course2", null);
        String ustcSP3 = sp.getString("course3", null);
        String ustcSP4 = sp.getString("course4", null);
        String ustcSP5 = sp.getString("course5", null);
        String ustcSP6 = sp.getString("course6", null);
        String ustcSP7 = sp.getString("course7", null);
        String ustcSP8 = sp.getString("course8", null);

        String ustc1 = course1.getText().toString();
        String ustc2 = course2.getText().toString();
        String ustc3 = course3.getText().toString();
        String ustc4 = course4.getText().toString();
        String ustc5 = course5.getText().toString();
        String ustc6 = course6.getText().toString();
        String ustc7 = course7.getText().toString();
        String ustc8 = course8.getText().toString();

        if(ustc1.equals(ustcSP1)) {
            Toast.makeText(this, "Course is in UST...", Toast.LENGTH_LONG).show();
        }

        else if(ustc2.equals(ustcSP2)) {
            Toast.makeText(this, "Course is in UST...", Toast.LENGTH_LONG).show();
        }
        else if(ustc3.equals(ustcSP3)) {
            Toast.makeText(this, "Course is in UST...", Toast.LENGTH_LONG).show();
        }
        else if(ustc4.equals(ustcSP4)) {
            Toast.makeText(this, "Course is in UST...", Toast.LENGTH_LONG).show();
        }
        else if(ustc5.equals(ustcSP5)) {
            Toast.makeText(this, "Course is in UST...", Toast.LENGTH_LONG).show();
        }
        else if(ustc6.equals(ustcSP6)) {
            Toast.makeText(this, "Course is in UST...", Toast.LENGTH_LONG).show();
        }
        else if(ustc7.equals(ustcSP7)) {
            Toast.makeText(this, "Course is in UST...", Toast.LENGTH_LONG).show();
        }
        else if(ustc8.equals(ustcSP8)) {
            Toast.makeText(this, "Course is in UST...", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "invalid user. Check spelling and capitalization...", Toast.LENGTH_LONG).show();
        }

    }

    public void previous(View v) {
        Intent i  = new Intent (this, MainActivity.class);
        startActivity(i);

    }
}
