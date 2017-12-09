package com.jacksonw765.familyguysfx;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //peter buttons
    public Button buttonPeterTada;
    public Button buttonPeterCares;
    public Button buttonPeterMeg;
    public Button buttonPeterRoadhouse;

    //bruce buttons
    public Button buttonBruceOhNo;
    public Button buttonBruceAnus;
    public Button buttonBruceDoThat;
    public Button buttonBruceLetsTalk;
    public Button buttonBruceLiveAlone;
    public Button buttonBrucePullingLegs;
    public Button buttonBruceThatsAlright;
    public Button buttonBruceOhHey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //peter init
        buttonPeterTada = this.findViewById(R.id.TaDa);
        buttonPeterCares = this.findViewById(R.id.Cares);
        buttonPeterRoadhouse = this.findViewById(R.id.button_peter_roadhouse);
        buttonPeterMeg = this.findViewById(R.id.button_peter_shutupmeg);

        //bruce init
        buttonBruceOhNo = this.findViewById(R.id.OhNo);
        buttonBruceOhHey = this.findViewById(R.id.button_bruce_ohHey);
        buttonBruceThatsAlright = this.findViewById(R.id.button_bruce_thatsalright);
        buttonBrucePullingLegs = this.findViewById(R.id.button_bruce_pullinglegs);
        buttonBruceLiveAlone = this.findViewById(R.id.button_bruce_livealone);
        buttonBruceLetsTalk = this.findViewById(R.id.button_bruce_letstalk);
        buttonBruceAnus = this.findViewById(R.id.button_bruce_anus);
        buttonBruceDoThat = this.findViewById(R.id.button_bruce_dothat);

        //peter listeners
        buttonPeterTada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.peter_tada);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonPeterCares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.peter_whocares);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonPeterMeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.peter_shutupmeg);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonPeterRoadhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.peter_roadhouse);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        //bruce listeners


        buttonBruceOhNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.bruce_ohno);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBruceAnus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.bruce_anus);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBruceDoThat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.bruce_candothat);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBruceLetsTalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.bruce_letstalk);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBruceLiveAlone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.bruce_livealone);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBrucePullingLegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.bruce_pullinglegs);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBruceThatsAlright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.bruce_thatsalright);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBruceOhHey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.bruce_ohhey);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

    }
}
