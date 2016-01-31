package com.jas10022jbgmail.stress_reliever;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ResourceBundle;


public class MainActivity extends ActionBarActivity {

    public static int colorPushed;

    ImageView mColorButton;
    AnimationDrawable x;
    public int colorValue;
    private View view;
    private int r;
    private int g;
    private int b;
    private ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        back = (ImageView)findViewById(R.id.back);
        view = this.getWindow().getDecorView();
        mColorButton = (ImageView)findViewById(R.id.color_button);
        colorValue = 0;




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainMenu.class);
                startActivity(i);
            }
        });


        mColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                r = (int)(Math.random()*256);
                g = (int)(Math.random()*256);
                b = (int)(Math.random()*256);

                view.setBackgroundColor(Color.rgb(r,g,b));

                colorPushed += 1;
                Log.d("MainActivity", "working");
            }
        });
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
