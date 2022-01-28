package com.nexis.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
            Intent intent = getIntent();
            Bundle b = new Bundle();
            b = getIntent().getExtras();
            String messageText = b.getString(EXTRA_MESSAGE);
            TextView messageView = findViewById(R.id.message);
            messageView.setText(messageText);
    }
}