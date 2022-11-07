package com.example.practical11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Notification extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        textView.findViewById(R.id.textView);
//        String message = getIntent().getStringExtra("message");
//        textView.setText(message);

        //  textView.setText();
    }
}