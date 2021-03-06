package seraf.babiarz.krzysztof.javainterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Layout
        RelativeLayout rl = new RelativeLayout(this);
        rl.setBackgroundColor(Color.CYAN);

        // Button
        Button redButton = new Button(this);
        redButton.setText("Log In");
        redButton.setBackgroundColor(Color.MAGENTA);

        //Username input
        EditText username = new EditText(this);

        // Set Id to object
        redButton.setId(1);
        username.setId(2);

        // Give rules to position widgets
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        usernameDetails.addRule(RelativeLayout.ABOVE, redButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);

        // getting device app resources
        Resources r = getResources();
        // convert pixels in to intiger
        // px will change from device to device but size will stay the same
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
                r.getDisplayMetrics());

        // set widht only take int pixels
        username.setWidth(px);

        // Add widget to layout (button is now child of layout)
        rl.addView(redButton, buttonDetails);

        rl.addView(username, usernameDetails);

        //Set this activities content/display ti this view
        setContentView(rl);

    }
}
