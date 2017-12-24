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
public class Chris extends Fragment {

    private Button buttonChrisPoo;
    private Button buttonChrisMonkey;
    private Button buttonChrisSoul;
    private Button buttonChrisPee;


    public Chris() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chris, container, false);

        buttonChrisMonkey = view.findViewById(R.id.button_chris_monkey);
        buttonChrisPee = view.findViewById(R.id.button_chris_pee);
        buttonChrisPoo = view.findViewById(R.id.button_chris_poo);
        buttonChrisSoul = view.findViewById(R.id.button_chris_soul);

        buttonChrisSoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.chris_nosoul);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonChrisPoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.chris_dontsaypoo);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonChrisPee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.chris_peeinpants);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonChrisMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.chris_evilmonkey);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        return view;
    }

}
