package com.example.aoyler.pawarisaclinicapp;

/**
 * Created by aoyler on 19/4/2559.
 */
import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.imanoweb.calendarview.CustomCalendarView;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by aoyler on 1/4/2559.
 */

public class SelectDate extends Activity {
    int x = 1;
    int y = 2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.selectdate);
        final Button btn1 = (Button) findViewById(R.id.button);
            btn1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent1 = new Intent(getApplicationContext(), CalendarSelect.class);
                    intent1.putExtra("x", x);
                    startActivity(intent1);

                }


            });

    }

}


