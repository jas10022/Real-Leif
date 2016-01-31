package com.jas10022jbgmail.stress_reliever;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainMenu extends AppCompatActivity {

    private ImageView colorButton1;
    private ImageView colorButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        colorButton1 = (ImageView)findViewById(R.id.color_button1);
        colorButton2 = (ImageView)findViewById(R.id.color_button2);

        colorButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainMenu.this, Vibrators.class);
                startActivity(i);
            }
        });
        colorButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
