package com.example.seraf.babiarz.krzysztof.mydailyplanner;

import android.content.ClipData;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
    TableLayout tLay;

    TableRow tRow1, tRow2, tRow3, tRow4, tRow5, tRow6, tRow7;

    Button btnAdd;

    String task;

    EditText edtText;

    TextView txtDate, row1_1, row1_2, row1_3, row1_4, row1_5, row1_6, row1_7, row2_1, row2_2,
            row2_3, row2_4, row2_5, row2_6, row2_7, row3_1, row3_2, row3_3, row3_4, row3_5, row3_6,
            row3_7, row4_1, row4_2, row4_3, row4_4, row4_5, row4_6, row4_7, row5_1, row5_2, row5_3,
            row5_4, row5_5, row5_6, row5_7, row6_1, row6_2, row6_3, row6_4, row6_5, row6_6, row6_7,
            row7_1, row7_2, row7_3, row7_4, row7_5, row7_6, row7_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_daily_planner);

        /*getDate();*/
        initialize();
        ClickListeners();


    }

    View.OnClickListener ClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            task = edtText.getText().toString();
            if (row1_1.getText().toString().equals("")) {
                row1_1.setText(task);
            } else if (row2_1.getText().toString().equals("")) {
                row2_1.setText(task);
            } else if (row3_1.getText().toString().equals("")) {
                row3_1.setText(task);
            } else if (row4_1.getText().toString().equals("")) {
                row4_1.setText(task);
            } else if (row5_1.getText().toString().equals("")) {
                row5_1.setText(task);
            } else if (row6_1.getText().toString().equals("")) {
                row6_1.setText(task);
            } else if (row7_1.getText().toString().equals("")) {
                row7_1.setText(task);
            } else {
                Toast.makeText(getApplicationContext(), "You reach task limit, for now ;)", Toast.LENGTH_LONG).show();
            }
        }
    };

    View.OnDragListener DropListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();

            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.i("Drag Event", "Entered");
                    break;

                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("Drag Event", "Exited");
                    break;

                case DragEvent.ACTION_DROP:
                    TextView target = (TextView) v;
                    TextView dragged = (TextView) event.getLocalState();
                    target.setText(dragged.getText());
                    dragged.setText("");
                    break;

            }
            return true;
        }
    };

   public void ClickListeners() {

       findViewById(R.id.btnAdd).setOnClickListener(ClickListener);
       // row1
       findViewById(R.id.row1_1).setOnLongClickListener(longClickListener);
       findViewById(R.id.row1_1).setOnDragListener(DropListener);
       findViewById(R.id.row1_2).setOnLongClickListener(longClickListener);
       findViewById(R.id.row1_2).setOnDragListener(DropListener);
       findViewById(R.id.row1_3).setOnLongClickListener(longClickListener);
       findViewById(R.id.row1_3).setOnDragListener(DropListener);
       findViewById(R.id.row1_4).setOnLongClickListener(longClickListener);
       findViewById(R.id.row1_4).setOnDragListener(DropListener);
       findViewById(R.id.row1_5).setOnLongClickListener(longClickListener);
       findViewById(R.id.row1_5).setOnDragListener(DropListener);
       findViewById(R.id.row1_6).setOnLongClickListener(longClickListener);
       findViewById(R.id.row1_6).setOnDragListener(DropListener);
       findViewById(R.id.row1_7).setOnLongClickListener(longClickListener);
       findViewById(R.id.row1_7).setOnDragListener(DropListener);
       // row2
       findViewById(R.id.row2_1).setOnLongClickListener(longClickListener);
       findViewById(R.id.row2_1).setOnDragListener(DropListener);
       findViewById(R.id.row2_2).setOnLongClickListener(longClickListener);
       findViewById(R.id.row2_2).setOnDragListener(DropListener);
       findViewById(R.id.row2_3).setOnLongClickListener(longClickListener);
       findViewById(R.id.row2_3).setOnDragListener(DropListener);
       findViewById(R.id.row2_4).setOnLongClickListener(longClickListener);
       findViewById(R.id.row2_4).setOnDragListener(DropListener);
       findViewById(R.id.row2_5).setOnLongClickListener(longClickListener);
       findViewById(R.id.row2_5).setOnDragListener(DropListener);
       findViewById(R.id.row2_6).setOnLongClickListener(longClickListener);
       findViewById(R.id.row2_6).setOnDragListener(DropListener);
       findViewById(R.id.row2_7).setOnLongClickListener(longClickListener);
       findViewById(R.id.row2_7).setOnDragListener(DropListener);
       // row3
       findViewById(R.id.row3_1).setOnLongClickListener(longClickListener);
       findViewById(R.id.row3_1).setOnDragListener(DropListener);
       findViewById(R.id.row3_2).setOnLongClickListener(longClickListener);
       findViewById(R.id.row3_2).setOnDragListener(DropListener);
       findViewById(R.id.row3_3).setOnLongClickListener(longClickListener);
       findViewById(R.id.row3_3).setOnDragListener(DropListener);
       findViewById(R.id.row3_4).setOnLongClickListener(longClickListener);
       findViewById(R.id.row3_4).setOnDragListener(DropListener);
       findViewById(R.id.row3_5).setOnLongClickListener(longClickListener);
       findViewById(R.id.row3_5).setOnDragListener(DropListener);
       findViewById(R.id.row3_6).setOnLongClickListener(longClickListener);
       findViewById(R.id.row3_6).setOnDragListener(DropListener);
       findViewById(R.id.row3_7).setOnLongClickListener(longClickListener);
       findViewById(R.id.row3_7).setOnDragListener(DropListener);
       // row4
       findViewById(R.id.row4_1).setOnLongClickListener(longClickListener);
       findViewById(R.id.row4_1).setOnDragListener(DropListener);
       findViewById(R.id.row4_2).setOnLongClickListener(longClickListener);
       findViewById(R.id.row4_2).setOnDragListener(DropListener);
       findViewById(R.id.row4_3).setOnLongClickListener(longClickListener);
       findViewById(R.id.row4_3).setOnDragListener(DropListener);
       findViewById(R.id.row4_4).setOnLongClickListener(longClickListener);
       findViewById(R.id.row4_4).setOnDragListener(DropListener);
       findViewById(R.id.row4_5).setOnLongClickListener(longClickListener);
       findViewById(R.id.row4_5).setOnDragListener(DropListener);
       findViewById(R.id.row4_6).setOnLongClickListener(longClickListener);
       findViewById(R.id.row4_6).setOnDragListener(DropListener);
       findViewById(R.id.row4_7).setOnLongClickListener(longClickListener);
       findViewById(R.id.row4_7).setOnDragListener(DropListener);
       // row5
       findViewById(R.id.row5_1).setOnLongClickListener(longClickListener);
       findViewById(R.id.row5_1).setOnDragListener(DropListener);
       findViewById(R.id.row5_2).setOnLongClickListener(longClickListener);
       findViewById(R.id.row5_2).setOnDragListener(DropListener);
       findViewById(R.id.row5_3).setOnLongClickListener(longClickListener);
       findViewById(R.id.row5_3).setOnDragListener(DropListener);
       findViewById(R.id.row5_4).setOnLongClickListener(longClickListener);
       findViewById(R.id.row5_4).setOnDragListener(DropListener);
       findViewById(R.id.row5_5).setOnLongClickListener(longClickListener);
       findViewById(R.id.row5_5).setOnDragListener(DropListener);
       findViewById(R.id.row5_6).setOnLongClickListener(longClickListener);
       findViewById(R.id.row5_6).setOnDragListener(DropListener);
       findViewById(R.id.row5_7).setOnLongClickListener(longClickListener);
       findViewById(R.id.row5_7).setOnDragListener(DropListener);
       // row6
       findViewById(R.id.row6_1).setOnLongClickListener(longClickListener);
       findViewById(R.id.row6_1).setOnDragListener(DropListener);
       findViewById(R.id.row6_2).setOnLongClickListener(longClickListener);
       findViewById(R.id.row6_2).setOnDragListener(DropListener);
       findViewById(R.id.row6_3).setOnLongClickListener(longClickListener);
       findViewById(R.id.row6_3).setOnDragListener(DropListener);
       findViewById(R.id.row6_4).setOnLongClickListener(longClickListener);
       findViewById(R.id.row6_4).setOnDragListener(DropListener);
       findViewById(R.id.row6_5).setOnLongClickListener(longClickListener);
       findViewById(R.id.row6_5).setOnDragListener(DropListener);
       findViewById(R.id.row6_6).setOnLongClickListener(longClickListener);
       findViewById(R.id.row6_6).setOnDragListener(DropListener);
       findViewById(R.id.row6_7).setOnLongClickListener(longClickListener);
       findViewById(R.id.row6_7).setOnDragListener(DropListener);
       // row7
       findViewById(R.id.row7_1).setOnLongClickListener(longClickListener);
       findViewById(R.id.row7_1).setOnDragListener(DropListener);
       findViewById(R.id.row7_2).setOnLongClickListener(longClickListener);
       findViewById(R.id.row7_2).setOnDragListener(DropListener);
       findViewById(R.id.row7_3).setOnLongClickListener(longClickListener);
       findViewById(R.id.row7_3).setOnDragListener(DropListener);
       findViewById(R.id.row7_4).setOnLongClickListener(longClickListener);
       findViewById(R.id.row7_4).setOnDragListener(DropListener);
       findViewById(R.id.row7_5).setOnLongClickListener(longClickListener);
       findViewById(R.id.row7_5).setOnDragListener(DropListener);
       findViewById(R.id.row7_6).setOnLongClickListener(longClickListener);
       findViewById(R.id.row7_6).setOnDragListener(DropListener);
       findViewById(R.id.row7_7).setOnLongClickListener(longClickListener);
       findViewById(R.id.row7_7).setOnDragListener(DropListener);

   }

    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {

            ClipData data = ClipData.newPlainText("", "");
            DragShadow dragShadow = new DragShadow(v);

            v.startDrag(data, dragShadow, v, 0);
            return true;
        }
    };


    private class DragShadow extends View.DragShadowBuilder {

        ColorDrawable greyBox;

        DragShadow(View view) {
            super(view);
            greyBox = new ColorDrawable(Color.LTGRAY);
        }

        //canvas is area of the shadow  need to read more about it
        @Override
        public void onDrawShadow(Canvas canvas) {
            greyBox.draw(canvas);
        }

        @Override
        public void onProvideShadowMetrics(Point outShadowSize, Point outShadowTouchPoint) {
            View v = getView();

            //create how big shadow is and where is it center when touch
            int height = v.getHeight() / 2;
            int width = v.getWidth() / 2;

            greyBox.setBounds(0, 0, width, height);

            outShadowSize.set(width, height);
            outShadowTouchPoint.set(width / 2, height / 2);
        }

    }

    /*private void getDate() {

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        txtDate.setText(currentDate);

    }*/

    private void initialize() {

        /*// Show current date
        txtDate = findViewById(R.id.txtDate);*/

        // Table layout
        tLay = findViewById(R.id.tLay);

        // Button
        btnAdd = findViewById(R.id.btnAdd);

        // EditText
        edtText = findViewById(R.id.edtText);

        // row 1
        tRow1 = findViewById(R.id.tRow1);
        row1_1 = findViewById(R.id.row1_1);
        row1_2 = findViewById(R.id.row1_2);
        row1_3 = findViewById(R.id.row1_3);
        row1_4 = findViewById(R.id.row1_4);
        row1_5 = findViewById(R.id.row1_5);
        row1_6 = findViewById(R.id.row1_6);
        row1_7 = findViewById(R.id.row1_7);

        // row 2
        tRow2 = findViewById(R.id.tRow2);
        row2_1 = findViewById(R.id.row2_1);
        row2_2 = findViewById(R.id.row2_2);
        row2_3 = findViewById(R.id.row2_3);
        row2_4 = findViewById(R.id.row2_4);
        row2_5 = findViewById(R.id.row2_5);
        row2_6 = findViewById(R.id.row2_6);
        row2_7 = findViewById(R.id.row2_7);

        // row 3
        tRow3 = findViewById(R.id.tRow3);
        row3_1 = findViewById(R.id.row3_1);
        row3_2 = findViewById(R.id.row3_2);
        row3_3 = findViewById(R.id.row3_3);
        row3_4 = findViewById(R.id.row3_4);
        row3_5 = findViewById(R.id.row3_5);
        row3_6 = findViewById(R.id.row3_6);
        row3_7 = findViewById(R.id.row3_7);

        // row 4
        tRow4 = findViewById(R.id.tRow4);
        row4_1 = findViewById(R.id.row4_1);
        row4_2 = findViewById(R.id.row4_2);
        row4_3 = findViewById(R.id.row4_3);
        row4_4 = findViewById(R.id.row4_4);
        row4_5 = findViewById(R.id.row4_5);
        row4_6 = findViewById(R.id.row4_6);
        row4_7 = findViewById(R.id.row4_7);

        // row 5
        tRow5 = findViewById(R.id.tRow5);
        row5_1 = findViewById(R.id.row5_1);
        row5_2 = findViewById(R.id.row5_2);
        row5_3 = findViewById(R.id.row5_3);
        row5_4 = findViewById(R.id.row5_4);
        row5_5 = findViewById(R.id.row5_5);
        row5_6 = findViewById(R.id.row5_6);
        row5_7 = findViewById(R.id.row5_7);

        // row 6
        tRow6 = findViewById(R.id.tRow6);
        row6_1 = findViewById(R.id.row6_1);
        row6_2 = findViewById(R.id.row6_2);
        row6_3 = findViewById(R.id.row6_3);
        row6_4 = findViewById(R.id.row6_4);
        row6_5 = findViewById(R.id.row6_5);
        row6_6 = findViewById(R.id.row6_6);
        row6_7 = findViewById(R.id.row6_7);

        // row 7
        tRow7 = findViewById(R.id.tRow7);
        row7_1 = findViewById(R.id.row7_1);
        row7_2 = findViewById(R.id.row7_2);
        row7_3 = findViewById(R.id.row7_3);
        row7_4 = findViewById(R.id.row7_4);
        row7_5 = findViewById(R.id.row7_5);
        row7_6 = findViewById(R.id.row7_6);
        row7_7 = findViewById(R.id.row7_7);

    }
}