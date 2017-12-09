package com.jacksonw765.familyguysfx;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button button_peter_tada;
    public Button button_peter_cares;


    public Button button_bruce_OhNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_peter_tada = this.findViewById(R.id.TaDa);
        button_peter_cares = this.findViewById(R.id.Cares);
        button_bruce_OhNo = this.findViewById(R.id.OhNo);




        button_peter_tada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.peter_tada);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_peter_cares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.peter_whocares);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_bruce_OhNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.bruce_ohno);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

    }
}
