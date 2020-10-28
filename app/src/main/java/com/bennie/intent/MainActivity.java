package com.bennie.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mFirstName;
    private EditText mLastName;
    private EditText mAge;
    private EditText mGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting reference to the views in our layout files
        mFirstName = findViewById(R.id.first_name);
        mLastName = findViewById(R.id.last_name);
        mAge = findViewById(R.id.age);
        mGender = findViewById(R.id.gender);
    }

    //onClick event handler for the button
    public void send(View view) {

        //getting the texts from each edit text view and converting them to string
        String stringFirstName = mFirstName.getText().toString();
        String stringLastName = mLastName.getText().toString();
        int intAge = Integer.parseInt(mAge.getText().toString());
        String stringGender = mGender.getText().toString();

        //creating the intent and putting the values from the edith text views as
        //extra information to the next activity
        Intent intent = new Intent(this, ReceiveActivity.class);
        intent.putExtra("FIRST_NAME", stringFirstName);
        intent.putExtra("LAST_NAME", stringLastName);
        intent.putExtra("AGE", intAge);
        intent.putExtra("GENDER", stringGender);

        startActivity(intent); //starting the activity with the intent created
    }
}