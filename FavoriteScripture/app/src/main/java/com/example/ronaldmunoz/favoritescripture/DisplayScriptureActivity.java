package com.example.ronaldmunoz.favoritescripture;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayScriptureActivity extends AppCompatActivity {

    private static final String TAG = "DisplayScriptureActivity personalized log";

    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_scripture);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Debugging Log
        Log.d(TAG, "Reciving intent with " + message);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.scripture_display);
        textView.setText(message);
    }
}
