package com.example.seraf.babiarz.krzysztof.appnumber7;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView txtStart = (TextView) findViewById(R.id.txtStart);
        Button btnLoop = (Button) findViewById(R.id.btnLoop);
        final TextView txtI = (TextView) findViewById(R.id.txtI);
        final TextView txtSwitch = (TextView) findViewById(R.id.txtswitch);
        Button btnSwitch = (Button) findViewById(R.id.btnSwitch);

        btnLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                for (int i = 0; i <= 10; i++){
                    txtStart.setText(i + "");
                }
                */

                /*
                int i = 0;

                while (i <= 10 ){
                    txtStart.setText(i + "");
                    i++;
                }

                txtI.setText(i + "");
                */


                /*
                int y = 40;

                do {
                    txtStart.setText(y + "");
                    y++;
                }while (y <= 15);
                */

                for(int x = 0; x < 30; x++){

                    // but if i use break; insted of continue; it will stop at 5
                    if (x==5){
                        continue;
                    }

                    Log.i("LOG", x + "");

                }



            }
        });

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                 value of name string need to be the same in case or it will not work
                 or it will use default if none of case match String
                  */

                /*
                String nameString = "Li";

                switch (nameString) {

                    case "Animal1":
                        txtSwitch.setText("Our Animal Name is Animal1 ");

                    case "Lion":
                        txtSwitch.setText("The name of Our animal is Lion");
                        break;

                    default:
                        txtSwitch.setText("Name of our animal is something else");
                }
                */
            }
        });

    }
}

