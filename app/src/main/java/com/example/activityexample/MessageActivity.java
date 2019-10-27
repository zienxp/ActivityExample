package com.example.activityexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity {
    EditText Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Message = findViewById(R.id.text_message);
    }

    public void sendMessage(View view) {

        String message = Message.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("message",message);
        setResult(RESULT_OK,intent);
        finish();

    }
}
