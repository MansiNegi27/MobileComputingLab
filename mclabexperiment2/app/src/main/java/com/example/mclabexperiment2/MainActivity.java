package com.example.mclabexperiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import android.view.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Boolean toggle = true;
    public void changeFont(View v)
    {
        TextView fontText = (TextView) findViewById(R.id.fontTextView);
        if(toggle) {
            fontText.setTypeface(Typeface.create("arial", Typeface.BOLD_ITALIC));
        }
        else{
            fontText.setTypeface(Typeface.create("serif", Typeface.NORMAL));
        }
        toggle = !toggle;
    }
    public void changeColor(View v)
    {
        TextView fontColor = (TextView) findViewById(R.id.colorTextView);
        switch (v.getId())
        {
            case R.id.blueColor:
                fontColor.setTextColor(getResources().getColor(R.color.blue));
                break;
            case R.id.greenColor:
                fontColor.setTextColor(getResources().getColor(R.color.green));
                break;
            case R.id.redColor:
                fontColor.setTextColor(getResources().getColor(R.color.red));
                break;
            default:
                break;
        }
    }
}