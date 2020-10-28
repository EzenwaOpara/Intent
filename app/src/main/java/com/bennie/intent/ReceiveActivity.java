package com.bennie.intent;

/*
 * Created by OPARA BENJAMIN
 * On 10/28/2020 - 10:50 AM
 */

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ReceiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        //getting reference to the views in our layout files
        TextView firstNameTV = findViewById(R.id.first_name);
        TextView lastNameTV = findViewById(R.id.last_name);
        TextView ageTV = findViewById(R.id.age);
        TextView genderTV = findViewById(R.id.gender);

        //getting extra information from the intent that
        //started this activity
        Intent intent = getIntent();
        String firstName = intent.getStringExtra("FIRST_NAME");
        String lastName = intent.getStringExtra("LAST_NAME");
        int age = intent.getIntExtra("AGE", 0);
        String gender = intent.getStringExtra("GENDER");

        //using the extra information (string) to populate the text views
        firstNameTV.setText(firstName);
        lastNameTV.setText(lastName);
        ageTV.setText(String.valueOf(age));
        genderTV.setText(gender);
    }
}
