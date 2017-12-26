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
public class Cleveland extends Fragment {

    Button buttonClevelandAdmin;
    Button buttonClevelandCrazy;
    Button buttonClevelandleastFav;
    Button buttonClevelandLongRide;
    Button buttonClevelandMenthols;
    Button buttonClevelandParty;
    Button buttonClevelandPoorBastard;
    Button buttonClevelandSlapme;
    Button buttonClevelandSomethingCrazy;
    Button buttonClevelandTrouble;
    Button buttonClevelandWindow;




    public Cleveland() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cleveland, container, false);

        buttonClevelandAdmin = view.findViewById(R.id.button_cleveland_admin);
        buttonClevelandleastFav = view.findViewById(R.id.button_cleveland_leastfav);
        buttonClevelandCrazy = view.findViewById(R.id.button_cleveland_crazy);
        buttonClevelandLongRide = view.findViewById(R.id.button_cleveland_longride);
        buttonClevelandMenthols = view.findViewById(R.id.button_cleveland_menthols);
        buttonClevelandParty = view.findViewById(R.id.button_cleveland_party);
        buttonClevelandPoorBastard = view.findViewById(R.id.button_cleveland_poorbas);
        buttonClevelandSlapme = view.findViewById(R.id.button_cleveland_slapme);
        buttonClevelandSomethingCrazy = view.findViewById(R.id.button_cleveland_somethingcrazy);
        buttonClevelandTrouble = view.findViewById(R.id.button_cleveland_trouble);
        buttonClevelandWindow = view.findViewById(R.id.button_cleveland_window);

        buttonClevelandAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.cleveland_administrator);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonClevelandCrazy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.cleveland_crazy);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonClevelandleastFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.cleveland_leastfavorite);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonClevelandLongRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.cleveland_longride);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonClevelandMenthols.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.cleveland_menthols);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonClevelandParty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.cleveland_party);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonClevelandPoorBastard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.cleveland_poorbastard);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonClevelandSlapme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.cleveland_slapme);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonClevelandSomethingCrazy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.cleveland_somethingcrazy);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonClevelandTrouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.cleveland_trouble);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonClevelandWindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.cleveland_window);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        return view;
    }

}
