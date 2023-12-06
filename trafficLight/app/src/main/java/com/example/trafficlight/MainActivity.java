package com.example.trafficlight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private LinearLayout mLinearLayout;
private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinearLayout = findViewById(R.id.linearLayout);
        mTextView = findViewById(R.id.text);
    }
    public void onClick(View v){

        switch (v.getId()){
            case R.id.buttonRed:
            {
                mTextView.setText(R.string.red);
                mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
                break;
            }
            case R.id.buttonGreen:{
                mTextView.setText(R.string.green);
                mLinearLayout.setBackgroundColor(ContextCompat.getColor( this, R.color.greenColor));
                break;
            }
            case R.id.buttonYellow:{
                mTextView.setText(R.string.yellow);
                mLinearLayout.setBackgroundColor(ContextCompat.getColor( this, R.color.yellowColor));
                break;
            }
        }
    }
}