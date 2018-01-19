package com.example.seraf.babiarz.krzysztof.appnumber2xmlfiles;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txt1 = (TextView) findViewById(R.id.txt1);
        txt1.setText("My own text"); // Change text

        TextView txt2 = (TextView) findViewById(R.id.txt2);
        TextView txt3 = (TextView) findViewById(R.id.txt3);


        String str1 = "some Value";

        StringTokenizer strObj1 = new StringTokenizer(str1);// take part only till space or tab

        txt2.setText(strObj1.nextToken());  // show only "some" and skip "Vaule"
        //txt1.setText(strObj1.nextToken()); // with this he change txt1 and give it Value

        String str2 = "This is another text@this is your text@this is my text";

        StringTokenizer strObj2 = new StringTokenizer(str2, "@");

        txt1.setText(strObj2.nextToken());
        txt2.setText(strObj2.nextToken());
        txt3.setText(strObj2.nextToken() + " fine");



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
