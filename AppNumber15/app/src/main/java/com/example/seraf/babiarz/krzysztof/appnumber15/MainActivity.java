package com.example.seraf.babiarz.krzysztof.appnumber15;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int fiveStarsReview = 0;
    int fourStarsReview = 0;
    int threeStarsReview = 0;
    int twoStarsReview = 0;
    int oneStarsReview = 0;

    boolean firstTime = true;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // That is to show message to user
        Toast.makeText(this, "OnCreate Method is called", Toast.LENGTH_LONG).show();


        final TextView txtFiveStarStudent = (TextView) findViewById(R.id.txtFiveStarStudent);
        final TextView txtFourStarStudent = (TextView) findViewById(R.id.txtFourStarsStudent);
        final TextView txtThreeStarStudent = (TextView) findViewById(R.id.txtThreeStarStucent);
        final TextView txtTwoStarStudent = (TextView) findViewById(R.id.txtTwoStarStudent);
        final TextView txtOneStarStudent = (TextView) findViewById(R.id.txtOneStarStudent);

        RatingBar rtbFiveStarStudent = (RatingBar) findViewById(R.id.rtbFiveStarStudent);
        RatingBar rtbFourStarStudent = (RatingBar) findViewById(R.id.rtbFourStarStudent);
        RatingBar rtbThreeStarStudent = (RatingBar) findViewById(R.id.rtbThreeStarStudent);
        RatingBar rtbTwoStarStudent = (RatingBar) findViewById(R.id.rtbTwoStarStudent);
        RatingBar rtbOneStarStudent = (RatingBar) findViewById(R.id.rtbOneStarStudent);

        final Button btnResult = (Button) findViewById(R.id.btnResult);

        /*
        * rtbFiveStarStudent.setIsIndicator(true);
        * rtbFourStarStudent.setIsIndicator(true);
        * rtbThreeStarStudent.setIsIndicator(true);
        * rtbTwoStarStudent.setIsIndicator(true);
        * rtbOneStarStudent.setIsIndicator(true);
        */

        makeThisRatingBarIndicator(rtbFiveStarStudent);
        makeThisRatingBarIndicator(rtbFourStarStudent);
        makeThisRatingBarIndicator(rtbThreeStarStudent);
        makeThisRatingBarIndicator(rtbTwoStarStudent);
        makeThisRatingBarIndicator(rtbOneStarStudent);

        /*
        This create error it need to be in main class otherwise complain to do it as final
        and still have problem because final cannot be changed

        int fiveStarsReview = 0;
        int fourStarsReview = 0;
        int threeStarsReview = 0;
        int twoStarsReview = 0;
        int oneStarsReview = 0;
        */

        final int[] studentReviews = {5, 3, 4, 2, 4, 5, 1, 3, 2, 5, 5, 3, 2, 3 };

        /*
        Third puthing for loop out side onClick method so it is performed only once
        */


        /*for (int index = 0; index < studentReviews.length; index++) {

            if (studentReviews[index] == 5) {
                ++fiveStarsReview;
            } else if (studentReviews[index] == 4) {
                ++fourStarsReview;
            } else if (studentReviews[index] == 3) {
                ++threeStarsReview;
            } else if (studentReviews[index] == 2) {
                ++twoStarsReview;
            } else if (studentReviews[index] == 1) {
                ++oneStarsReview;
            }

        }
        */


        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* Second solution to incrementation bug with button
                *  button stay and do not desapire sompare to
                *  option with removing button after for loop
                *
                */



                if (firstTime) {

                    for (int index = 0; index < studentReviews.length; index++) {

                        /*
                        if (studentReviews[index] == 5) {
                            ++fiveStarsReview;
                        } else if (studentReviews[index] == 4) {
                            ++fourStarsReview;
                        } else if (studentReviews[index] == 3) {
                            ++threeStarsReview;
                        } else if (studentReviews[index] == 2) {
                            ++twoStarsReview;
                        } else if (studentReviews[index] == 1) {
                            ++oneStarsReview;
                        }
                        */

                        switch (studentReviews[index]){
                            case 5:
                                ++fiveStarsReview;
                                break;
                            case 4:
                                ++fourStarsReview;
                                break;
                            case 3:
                                ++threeStarsReview;
                                break;
                            case 2:
                                ++twoStarsReview;
                                break;
                            case 1:
                                ++oneStarsReview;
                                break;
                        }

                    }

                    firstTime = false;

                }


                // if firstTime variable is false after first time only output this

                // this will output value of StarReview to coresponding txt on screen
                txtFiveStarStudent.setText(fiveStarsReview + "");
                txtFourStarStudent.setText(fourStarsReview + "");
                txtThreeStarStudent.setText(threeStarsReview + "");
                txtTwoStarStudent.setText(twoStarsReview + "");
                txtOneStarStudent.setText(oneStarsReview + "");

                // first solution to problem that array was added after clicking button
                // btnResult.setVisibility(View.INVISIBLE);
            }

        });

    }

    /* ratingBar <- paramether/argument to with we can refer */
    public void makeThisRatingBarIndicator(RatingBar ratingBar){

        ratingBar.setIsIndicator(true);

    }


}
