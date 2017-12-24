package com.jacksonw765.familyguysfx;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private AdView adview;
    private RelativeLayout layout;
    private ImageView themeSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = new RelativeLayout(this);
        themeSong = this.findViewById(R.id.familyGuyImage);
        adview = this.findViewById(R.id.adView);
        AdRequest request = new AdRequest.Builder()
                .setGender(AdRequest.GENDER_MALE)
                .setIsDesignedForFamilies(false)
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adview.loadAd(request);

        themeSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.themesong);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

    }
}
