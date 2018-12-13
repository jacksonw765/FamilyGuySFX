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
public class Brian extends Fragment {

    private Button buttonBrianAsshoy;
    private Button buttonBrianBarKeep;
    private Button buttonMonkeyMonkey;
    private Button buttonBrianChicken;
    private Button buttonBrianAss;
    private Button buttonBrianDryMartini;
    private Button buttonBrianCherreo;


    public Brian() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_brian2, container, false);

        buttonBrianAsshoy = view.findViewById(R.id.button_brian_asshoy);
        buttonBrianBarKeep = view.findViewById(R.id.button_brian_barkeep);
        buttonMonkeyMonkey = view.findViewById(R.id.button_brian_money);
        buttonBrianChicken = view.findViewById(R.id.button_brian_chicken);
        buttonBrianAss = view.findViewById(R.id.button_brian_ass);
        buttonBrianDryMartini = view.findViewById(R.id.button_brian_drymartini);
        buttonBrianCherreo = view.findViewById(R.id.button_brian_cheerio);


        buttonBrianAsshoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.brian_assahoy);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBrianAss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.brian_ass);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBrianBarKeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.brian_heybarkeep);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBrianCherreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.brian_cheerios);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBrianChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.brian_chickenfajitas);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBrianDryMartini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.brian_drymartini);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonMonkeyMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.brian_moneymoney);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });



        return view;
    }

}
