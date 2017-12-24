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
public class Peter extends Fragment {

    private Button buttonPeterTada;
    private Button buttonPeterCares;
    private Button buttonPeterMeg;
    private Button buttonPeterRoadhouse;


    public Peter() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_peter, container, false);

        buttonPeterTada = view.findViewById(R.id.TaDa);
        buttonPeterCares = view.findViewById(R.id.Cares);
        buttonPeterRoadhouse = view.findViewById(R.id.button_peter_roadhouse);
        buttonPeterMeg = view.findViewById(R.id.button_peter_shutupmeg);

        buttonPeterTada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.peter_tada);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonPeterCares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.peter_whocares);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonPeterMeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.peter_shutupmeg);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonPeterRoadhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.peter_roadhouse);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        return view;
    }

}
