package com.example.timepicker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TimePicker timePicker;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.showTime);
        timePicker = findViewById(R.id.selecttime) ;
        button = findViewById(R.id.showclockTime);
        timePicker.setIs24HourView(true);
        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {

                try{
                    int hour = timePicker.getHour() ;
                int min = timePicker.getMinute() ;
//                    int value = timePicker.getCurrentHour() + timePicker.getCurrentMinute();


                textView.setText("time is:"+hour +":" + min);
                }catch (Exception e){
                    Log.d("error", String.valueOf(e));
                }
            }
        });

    }
}