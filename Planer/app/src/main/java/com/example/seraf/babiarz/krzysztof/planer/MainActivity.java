package com.example.seraf.babiarz.krzysztof.planer;

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
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends Activity {

    TableLayout tLay;

    TableRow tRow1, tRow2, tRow3, tRow4, tRow5, tRow6, tRow7;

    TextView txtDate, row1_1, row1_2, row1_3, row1_4, row1_5, row1_6, row1_7, row2_1, row2_2,
            row2_3, row2_4, row2_5, row2_6, row2_7, row3_1, row3_2, row3_3, row3_4, row3_5, row3_6,
            row3_7, row4_1, row4_2, row4_3, row4_4, row4_5, row4_6, row4_7, row5_1, row5_2, row5_3,
            row5_4, row5_5, row5_6, row5_7, row6_1, row6_2, row6_3, row6_4, row6_5, row6_6, row6_7,
            row7_1, row7_2, row7_3, row7_4, row7_5, row7_6, row7_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        getDate();


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



    }

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
                    target.setText((CharSequence) dragged.getText());
                    dragged.setText("");
                    break;

            }
            return true;
        }
    };

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

        public DragShadow(View view) {
            super(view);
            greyBox = new ColorDrawable(Color.LTGRAY);
        }

        /*canvas is area of the shadow  need to read more about it*/
        @Override
        public void onDrawShadow(Canvas canvas) {
            greyBox.draw(canvas);
        }

        @Override
        public void onProvideShadowMetrics(Point outShadowSize, Point outShadowTouchPoint) {
            View v = getView();

            /*create how big shadow is and where is it center when touch*/
            int height = (int) v.getHeight() / 2;
            int width = (int) v.getWidth() / 2;

            greyBox.setBounds(0, 0, width, height);

            outShadowSize.set(width, height);
            outShadowTouchPoint.set(width / 2, height / 2);
        }

    }

    private void getDate() {

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        txtDate.setText(currentDate);

    }

    private void initialize() {

        // Table layout
        tLay = (TableLayout) findViewById(R.id.tLay);


        // Show current date
        txtDate = (TextView) findViewById(R.id.txtDate);


        // row 1
        tRow1 = (TableRow) findViewById(R.id.tRow1);
        row1_1 = (TextView) findViewById(R.id.row1_1);
        row1_2 = (TextView) findViewById(R.id.row1_2);
        row1_3 = (TextView) findViewById(R.id.row1_3);
        row1_4 = (TextView) findViewById(R.id.row1_4);
        row1_5 = (TextView) findViewById(R.id.row1_5);
        row1_6 = (TextView) findViewById(R.id.row1_6);
        row1_7 = (TextView) findViewById(R.id.row1_7);

        // row 2
        tRow2 = (TableRow) findViewById(R.id.tRow2);
        row2_1 = (TextView) findViewById(R.id.row2_1);
        row2_2 = (TextView) findViewById(R.id.row2_2);
        row2_3 = (TextView) findViewById(R.id.row2_3);
        row2_4 = (TextView) findViewById(R.id.row2_4);
        row2_5 = (TextView) findViewById(R.id.row2_5);
        row2_6 = (TextView) findViewById(R.id.row2_6);
        row2_7 = (TextView) findViewById(R.id.row2_7);

        // row 3
        tRow3 = (TableRow) findViewById(R.id.tRow3);
        row3_1 = (TextView) findViewById(R.id.row3_1);
        row3_2 = (TextView) findViewById(R.id.row3_2);
        row3_3 = (TextView) findViewById(R.id.row3_3);
        row3_4 = (TextView) findViewById(R.id.row3_4);
        row3_5 = (TextView) findViewById(R.id.row3_5);
        row3_6 = (TextView) findViewById(R.id.row3_6);
        row3_7 = (TextView) findViewById(R.id.row3_7);

        // row 4
        tRow4 = (TableRow) findViewById(R.id.tRow4);
        row4_1 = (TextView) findViewById(R.id.row4_1);
        row4_2 = (TextView) findViewById(R.id.row4_2);
        row4_3 = (TextView) findViewById(R.id.row4_3);
        row4_4 = (TextView) findViewById(R.id.row4_4);
        row4_5 = (TextView) findViewById(R.id.row4_5);
        row4_6 = (TextView) findViewById(R.id.row4_6);
        row4_7 = (TextView) findViewById(R.id.row4_7);

        // row 5
        tRow5 = (TableRow) findViewById(R.id.tRow5);
        row5_1 = (TextView) findViewById(R.id.row5_1);
        row5_2 = (TextView) findViewById(R.id.row5_2);
        row5_3 = (TextView) findViewById(R.id.row5_3);
        row5_4 = (TextView) findViewById(R.id.row5_4);
        row5_5 = (TextView) findViewById(R.id.row5_5);
        row5_6 = (TextView) findViewById(R.id.row5_6);
        row5_7 = (TextView) findViewById(R.id.row5_7);

        // row 6
        tRow6 = (TableRow) findViewById(R.id.tRow6);
        row6_1 = (TextView) findViewById(R.id.row6_1);
        row6_2 = (TextView) findViewById(R.id.row6_2);
        row6_3 = (TextView) findViewById(R.id.row6_3);
        row6_4 = (TextView) findViewById(R.id.row6_4);
        row6_5 = (TextView) findViewById(R.id.row6_5);
        row6_6 = (TextView) findViewById(R.id.row6_6);
        row6_7 = (TextView) findViewById(R.id.row6_7);

        // row 7
        tRow7 = (TableRow) findViewById(R.id.tRow7);
        row7_1 = (TextView) findViewById(R.id.row7_1);
        row7_2 = (TextView) findViewById(R.id.row7_2);
        row7_3 = (TextView) findViewById(R.id.row7_3);
        row7_4 = (TextView) findViewById(R.id.row7_4);
        row7_5 = (TextView) findViewById(R.id.row7_5);
        row7_6 = (TextView) findViewById(R.id.row7_6);
        row7_7 = (TextView) findViewById(R.id.row7_7);

    }

}






