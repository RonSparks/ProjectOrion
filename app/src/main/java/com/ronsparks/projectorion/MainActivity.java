package com.ronsparks.projectorion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText myEdit = findViewById(R.id.textEnter);

        String myString = getString(R.string.default_Text);
        myEdit.setHint("This is test");
    }
}
