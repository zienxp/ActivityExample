package com.example.activityexample;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int message_request=01;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_display_message);
    }

    public void getMessage(View view) {
        Intent intent =new Intent(this,MessageActivity.class);
        startActivityForResult(intent,message_request);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (message_request == requestCode) {
            if (resultCode == RESULT_OK) {
                String message = data.getStringExtra("message");
                textView.setText(message);
            }
        }
    }
}
