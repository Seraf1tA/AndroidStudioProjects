package com.example.seraf.babiarz.krzysztof.planer;

import android.accessibilityservice.AccessibilityService;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends Activity {



    Button btnRight;

    TextView txtDate, txtVie, row1_1, row1_2, row1_3, row1_4, row1_5, row1_6, row1_7, row2_1, row2_2,
            row2_3, row2_4, row2_5, row2_6, row2_7, row3_1, row3_2, row3_3, row3_4, row3_5, row3_6,
            row3_7, row4_1, row4_2, row4_3, row4_4, row4_5, row4_6, row4_7, row5_1, row5_2, row5_3,
            row5_4, row5_5, row5_6, row5_7, row6_1, row6_2, row6_3, row6_4, row6_5, row6_6, row6_7,
            row7_1, row7_2, row7_3, row7_4, row7_5, row7_6, row7_7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        txtDate.setText(currentDate);



    }



    private void initialize() {

        // Add Button

        btnRight = (Button) findViewById(R.id.btnRight);


        // Show current date
        txtDate = (TextView) findViewById(R.id.txtDate);


        // row 1
        row1_1 = (TextView) findViewById(R.id.row1_1);
        row1_2 = (TextView) findViewById(R.id.row1_2);
        row1_3 = (TextView) findViewById(R.id.row1_3);
        row1_4 = (TextView) findViewById(R.id.row1_4);
        row1_5 = (TextView) findViewById(R.id.row1_5);
        row1_6 = (TextView) findViewById(R.id.row1_6);
        row1_7 = (TextView) findViewById(R.id.row1_7);

        // row 2
        row2_1 = (TextView) findViewById(R.id.row2_1);
        row2_2 = (TextView) findViewById(R.id.row2_2);
        row2_3 = (TextView) findViewById(R.id.row2_3);
        row2_4 = (TextView) findViewById(R.id.row2_4);
        row2_5 = (TextView) findViewById(R.id.row2_5);
        row2_6 = (TextView) findViewById(R.id.row2_6);
        row2_7 = (TextView) findViewById(R.id.row2_7);

        // row 3
        row3_1 = (TextView) findViewById(R.id.row3_1);
        row3_2 = (TextView) findViewById(R.id.row3_2);
        row3_3 = (TextView) findViewById(R.id.row3_3);
        row3_4 = (TextView) findViewById(R.id.row3_4);
        row3_5 = (TextView) findViewById(R.id.row3_5);
        row3_6 = (TextView) findViewById(R.id.row3_6);
        row3_7 = (TextView) findViewById(R.id.row3_7);

        // row 4
        row4_1 = (TextView) findViewById(R.id.row4_1);
        row4_2 = (TextView) findViewById(R.id.row4_2);
        row4_3 = (TextView) findViewById(R.id.row4_3);
        row4_4 = (TextView) findViewById(R.id.row4_4);
        row4_5 = (TextView) findViewById(R.id.row4_5);
        row4_6 = (TextView) findViewById(R.id.row4_6);
        row4_7 = (TextView) findViewById(R.id.row4_7);

        // row 5
        row5_1 = (TextView) findViewById(R.id.row5_1);
        row5_2 = (TextView) findViewById(R.id.row5_2);
        row5_3 = (TextView) findViewById(R.id.row5_3);
        row5_4 = (TextView) findViewById(R.id.row5_4);
        row5_5 = (TextView) findViewById(R.id.row5_5);
        row5_6 = (TextView) findViewById(R.id.row5_6);
        row5_7 = (TextView) findViewById(R.id.row5_7);

        // row 6
        row6_1 = (TextView) findViewById(R.id.row6_1);
        row6_2 = (TextView) findViewById(R.id.row6_2);
        row6_3 = (TextView) findViewById(R.id.row6_3);
        row6_4 = (TextView) findViewById(R.id.row6_4);
        row6_5 = (TextView) findViewById(R.id.row6_5);
        row6_6 = (TextView) findViewById(R.id.row6_6);
        row6_7 = (TextView) findViewById(R.id.row6_7);

        // row 7
        row7_1 = (TextView) findViewById(R.id.row7_1);
        row7_2 = (TextView) findViewById(R.id.row7_2);
        row7_3 = (TextView) findViewById(R.id.row7_3);
        row7_4 = (TextView) findViewById(R.id.row7_4);
        row7_5 = (TextView) findViewById(R.id.row7_5);
        row7_6 = (TextView) findViewById(R.id.row7_6);
        row7_7 = (TextView) findViewById(R.id.row7_7);

    }


}

