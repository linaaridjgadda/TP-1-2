package com.example.tp12;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.salutations_text_view);
    }

    public void montrerSalutations(View view) {
        String message = "Bienvenue à ma première application";
        textView.setText(message);
    }
}
