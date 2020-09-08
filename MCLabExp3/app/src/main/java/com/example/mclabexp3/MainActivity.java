package com.example.mclabexp3;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton photo = (ImageButton) findViewById(R.id.photo);
        ImageButton sun = (ImageButton) findViewById(R.id.sun);
        ImageButton calendar = (ImageButton) findViewById(R.id.calendar);
        ImageButton bookmark = (ImageButton) findViewById(R.id.bookmark);
        LinearLayout ll1 = (LinearLayout) findViewById(R.id.LL1);
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Camera on single Click",Toast.LENGTH_SHORT).show();
            }
        });
        sun.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(),"Weather App on Long Click Event",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        calendar.setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() > 0) {
                        Toast.makeText(getApplicationContext(),"Calendar",Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        ll1.addOnLayoutChangeListener(new View.OnLayoutChangeListener(){
            @Override
            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Toast.makeText(getApplicationContext(),"Change in Layout",Toast.LENGTH_SHORT).show();
            }
        });
    }
}