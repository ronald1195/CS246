package com.example.ronaldmunoz.favoritescripture;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private static final String TAG = "MainActivity personalized log";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("LongLogTag")
    public void createEntry(View view){


        EditText book = findViewById(R.id.book_input);
        EditText chapter = findViewById(R.id.chapter_input);
        EditText verse = findViewById(R.id.verses_in);
        String message = book.getText().toString() + " " + chapter.getText().toString()
                            + ": " + verse.getText().toString();
        //Debugging Log
        Log.d(TAG, "About to create intent with " + message);

        //Creating Intent
        Intent intent = new Intent(this, DisplayScriptureActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
