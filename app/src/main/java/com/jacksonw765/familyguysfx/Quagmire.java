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
public class Quagmire extends Fragment {

    private Button buttonQuagmireArousing;
    private Button buttonQuagmireAwful;
    private Button buttonQuagmireFatChicks;
    private Button buttonQuagmireGiggidi;
    private Button buttonQuagmireHeardBefore;
    private Button buttonQuagmireNeatIdea;
    private Button buttonQuagmireParkingTicket;
    private Button buttonQuagmireWaHey;


    public Quagmire() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quagmire, container, false);

        buttonQuagmireArousing = view.findViewById(R.id.button_quagmire_arousing);
        buttonQuagmireAwful = view.findViewById(R.id.button_quagmire_awful);
        buttonQuagmireFatChicks = view.findViewById(R.id.button_quagmire_fat);
        buttonQuagmireGiggidi = view.findViewById(R.id.button_quagmire_giggidi);
        buttonQuagmireHeardBefore = view.findViewById(R.id.button_quagmire_heardbefore);
        buttonQuagmireNeatIdea = view.findViewById(R.id.button_quagmire_neatidea);
        buttonQuagmireParkingTicket = view.findViewById(R.id.button_quagmire_parkingticket);
        buttonQuagmireWaHey = view.findViewById(R.id.button_quagmire_whaaahey);

        buttonQuagmireWaHey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.quagmire_whaaaaheeehey);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireArousing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.quagmire_arousing);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireAwful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.quagmire_awful);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireFatChicks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.quagmire_fatchicks);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireGiggidi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.quagmire_giggidi);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireHeardBefore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.quagmire_heardbefore);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireNeatIdea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.quagmire_neatidea);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonQuagmireParkingTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.quagmire_parkingticket);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        return view;
    }

}
