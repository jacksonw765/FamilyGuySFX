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
public class Mort extends Fragment {

    Button buttonMortAddicted;
    Button buttonMortAwful;
    Button buttonMortFlush;
    Button buttonMortGoldamn;
    Button buttonMortMucus;
    Button buttonMortPeanut;
    Button buttonMortTakethat;
    Button buttonMortTastyCakes;
    Button buttonMortThankYou;
    Button buttonMortVeryNice;
    Button buttonMortFool;
    Button buttonMortMatter;



    public Mort() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mort, container, false);

        buttonMortAddicted = view.findViewById(R.id.button_mort_addicted);
        buttonMortAwful = view.findViewById(R.id.button_mort_awful);
        buttonMortFlush = view.findViewById(R.id.button_mort_flush);
        buttonMortGoldamn = view.findViewById(R.id.button_mort_goldman);
        buttonMortPeanut = view.findViewById(R.id.button_mort_peanut);
        buttonMortMucus = view.findViewById(R.id.button_mort_mucus);
        buttonMortTakethat = view.findViewById(R.id.button_mort_takethat);
        buttonMortTastyCakes = view.findViewById(R.id.button_mort_tastycakes);
        buttonMortVeryNice = view.findViewById(R.id.button_mort_verynice);
        buttonMortFool = view.findViewById(R.id.button_mort_fool);
        buttonMortThankYou = view.findViewById(R.id.button_mort_thankyou);
        buttonMortMatter = view.findViewById(R.id.button_mort_matter);


        buttonMortAddicted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.mort_addicted);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonMortAwful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.mort_awful);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonMortFlush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.mort_flush);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonMortGoldamn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.mort_goldman);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonMortPeanut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.mort_penut);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonMortMucus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.mort_mucus);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonMortTakethat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.mort_takethat);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonMortTastyCakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.mort_tastycakes);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonMortVeryNice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.mort_verynice);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonMortFool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.morth_fool);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonMortThankYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.mort_thankyou);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonMortMatter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.morth_matter);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });


        return view;
    }

}
