package com.jas10022jbgmail.stress_reliever;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Vibrators extends AppCompatActivity {

    public static int vibratorPushed;

    private ImageView colorButton;
    private Vibrator vibrator;
    private int value;
    private ImageView back;
    AnimatorSet movement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrator);

        colorButton = (ImageView)findViewById(R.id.color_button);
        back = (ImageView)findViewById(R.id.back);
        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        movement =(AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.animation);
        movement.setTarget(colorButton);

        value = 0;

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vibrators.this, MainMenu.class);
                startActivity(i);
            }
        });

        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value == 0) {
                    movement.start();
                    vibrator.vibrate(300000000);
                    value += 1;
                }else if(value == 1){
                    movement.end();
                    vibrator.cancel();
                    value -= 1 ;
                }
                vibratorPushed += 1;
            }
        });
    }
}
