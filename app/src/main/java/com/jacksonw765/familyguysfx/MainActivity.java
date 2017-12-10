package com.jacksonw765.familyguysfx;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    //peter buttons
    private Button buttonPeterTada;
    private Button buttonPeterCares;
    private Button buttonPeterMeg;
    private Button buttonPeterRoadhouse;

    //bruce buttons
    private Button buttonBruceOhNo;
    private Button buttonBruceAnus;
    private Button buttonBruceDoThat;
    private Button buttonBruceLetsTalk;
    private Button buttonBruceLiveAlone;
    private Button buttonBrucePullingLegs;
    private Button buttonBruceThatsAlright;
    private Button buttonBruceOhHey;

    //quagmire buttons
    private Button buttonQuagmireArousing;
    private Button buttonQuagmireAwful;
    private Button buttonQuagmireFatChicks;
    private Button buttonQuagmireGiggidi;
    private Button buttonQuagmireHeardBefore;
    private Button buttonQuagmireNeatIdea;
    private Button buttonQuagmireParkingTicket;
    private Button buttonQuagmireWaHey;

    //button Chris
    private Button buttonChrisPoo;
    private Button buttonChrisMonkey;
    private Button buttonChrisSoul;
    private Button buttonChrisPee;

    private AdView adview;
    private RelativeLayout layout;
    private Button legal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = new RelativeLayout(this);
        adview = this.findViewById(R.id.adView);
        AdRequest request = new AdRequest.Builder()
                .setGender(AdRequest.GENDER_MALE)
                .setIsDesignedForFamilies(false)
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adview.loadAd(request);

        legal = this.findViewById(R.id.legal);

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

        //quagmire init
        buttonQuagmireArousing = this.findViewById(R.id.button_quagmire_arousing);
        buttonQuagmireAwful = this.findViewById(R.id.button_quagmire_awful);
        buttonQuagmireFatChicks = this.findViewById(R.id.button_quagmire_fat);
        buttonQuagmireGiggidi = this.findViewById(R.id.button_quagmire_giggidi);
        buttonQuagmireHeardBefore = this.findViewById(R.id.button_quagmire_heardbefore);
        buttonQuagmireNeatIdea = this.findViewById(R.id.button_quagmire_neatidea);
        buttonQuagmireParkingTicket = this.findViewById(R.id.button_quagmire_parkingticket);
        buttonQuagmireWaHey = this.findViewById(R.id.button_quagmire_whaaahey);

        //chris init
        buttonChrisMonkey = this.findViewById(R.id.button_chris_monkey);
        buttonChrisPee = this.findViewById(R.id.button_chris_pee);
        buttonChrisPoo = this.findViewById(R.id.button_chris_poo);
        buttonChrisSoul = this.findViewById(R.id.button_chris_soul);

        legal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                builder1.setMessage("Thanks for downloading Family Guy Soundboard! " +
                        "All the money this app generates from ads goes to cancer research. Together we have raised $2.71! \n" +
                        "All rights to the sound effects belong to Fox. No copyright intended. ");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Okay",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

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

        //Quagmire Listeners
        buttonQuagmireWaHey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.quagmire_whaaaaheeehey);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireArousing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.quagmire_arousing);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireAwful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.quagmire_awful);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireFatChicks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.quagmire_fatchicks);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireGiggidi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.quagmire_giggidi);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireHeardBefore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.quagmire_heardbefore);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireNeatIdea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.quagmire_neatidea);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireParkingTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.quagmire_parkingticket);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        //chris listeners
        buttonChrisSoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.chris_nosoul);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonChrisPoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.chris_dontsaypoo);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonChrisPee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.chris_peeinpants);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonChrisMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.chris_evilmonkey);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

    }
}
