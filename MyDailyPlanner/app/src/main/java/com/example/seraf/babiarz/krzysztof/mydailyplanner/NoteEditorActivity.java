package com.example.seraf.babiarz.krzysztof.mydailyplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class NoteEditorActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);

        EditText edi = (EditText) findViewById(R.id.edi);
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);

        Intent intent = getIntent();
    }
}
