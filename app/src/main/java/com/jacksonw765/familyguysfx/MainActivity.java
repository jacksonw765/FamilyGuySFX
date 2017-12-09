package com.jacksonw765.familyguysfx;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button buttonTada;
    public Button buttonCares;
    public Button buttonOhNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTada = this.findViewById(R.id.TaDa);
        buttonCares = this.findViewById(R.id.Cares);
        buttonOhNo = this.findViewById(R.id.OhNo);




        buttonTada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.tada);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

    }
}
