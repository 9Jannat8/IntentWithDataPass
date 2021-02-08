package com.example.intentwithdatapass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        textView = findViewById(R.id.tvId1);

        Bundle bundle = getIntent().getExtras();//data receive korar jonno
        if(bundle != null) {//checking if here have any data..
            String value = bundle.getString("tag");//data ta ki seta neya
            textView.setText(value);
        }
    }
}