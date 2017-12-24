package com.jacksonw765.familyguysfx;


import android.media.MediaPlayer;
import android.os.Bundle;


import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Stewie extends Fragment {


    public Stewie() {
        // Required empty public constructor
    }

    private Button buttonStewieBall;
    private Button buttonStewieCoolWhip;
    private Button buttonStewieDick;
    private Button buttonStewieFunlouis;
    private Button buttonStewiegoaway;
    private Button buttonStewieHa;
    private Button buttonStewieKickAss;
    private Button buttonStewiePoopinMouth;
    private Button buttonStewieTasteCoolWhip;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stewie, container, false);

        buttonStewieBall = view.findViewById(R.id.button_stewie_ball);
        buttonStewieCoolWhip = view.findViewById(R.id.button_stewie_coolwhip);
        buttonStewieFunlouis = view.findViewById(R.id.button_stewie_funlouis);
        buttonStewieDick = view.findViewById(R.id.button_stewie_dick);
        buttonStewiegoaway = view.findViewById(R.id.button_stewie_goaway);
        buttonStewiePoopinMouth = view.findViewById(R.id.button_stewie_poopinmouth);
        buttonStewieTasteCoolWhip = view.findViewById(R.id.button_stewie_tastecoolwhip);
        buttonStewieHa = view.findViewById(R.id.button_stewie_ha);
        buttonStewieKickAss = view.findViewById(R.id.button_stewie_kickass);

        buttonStewieBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.stuwie_ballcup);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonStewieCoolWhip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.stuwie_coolwhip);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonStewieDick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.stuwie_dick);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonStewieFunlouis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.stuwie_funoflouis);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonStewiegoaway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.stuwie_goaway);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonStewieKickAss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.stuwie_kickass);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonStewiePoopinMouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.stuwie_poopinmouth);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonStewieTasteCoolWhip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.stuwie_tastebettercoolwhip);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonStewieHa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.stuwie_ha);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        return view;
    }

}
