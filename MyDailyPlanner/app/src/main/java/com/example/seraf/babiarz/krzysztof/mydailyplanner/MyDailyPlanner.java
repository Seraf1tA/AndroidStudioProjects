package com.example.seraf.babiarz.krzysztof.mydailyplanner;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.ClipData;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DateFormat;
import java.util.Calendar;

public class MyDailyPlanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_daily_planner);
    }
}
