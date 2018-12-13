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
public class Lois extends Fragment {

    private Button buttonLoisCracker;
    private Button buttonLoisChoice;
    private Button buttonLoisBadChoice;
    private Button buttonLoisXmas;
    private Button buttonLoisHello;
    private Button buttonLoisSanta;
    private Button buttonLoisShower;
    private Button buttonLoisSweater;
    private Button buttonLoisToys;
    private Button buttonLoisTree;


    public Lois() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lois, container, false);

        buttonLoisCracker = view.findViewById(R.id.button_lois_cracker);
        buttonLoisChoice = view.findViewById(R.id.button_lois_choice);
        buttonLoisBadChoice = view.findViewById(R.id.button_lois_badchoice);
        buttonLoisXmas = view.findViewById(R.id.button_lois_xmas);
        buttonLoisHello = view.findViewById(R.id.button_lois_hello);
        buttonLoisSanta = view.findViewById(R.id.button_lois_santa);
        buttonLoisShower = view.findViewById(R.id.button_lois_shower);
        buttonLoisSweater = view.findViewById(R.id.button_lois_sweater);
        buttonLoisToys = view.findViewById(R.id.button_lois_toys);
        buttonLoisTree = view.findViewById(R.id.button_lois_tree);

        buttonLoisCracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.loius_crackerjacks);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonLoisChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.louis_choice);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonLoisBadChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.louis_badchoice);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonLoisXmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.louis_complicatedxmas);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonLoisHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.louis_hello);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonLoisSanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.louis_santa);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonLoisShower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.louis_shower);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonLoisSweater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.louis_sweater);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonLoisToys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.louis_toys);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonLoisTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.louis_tree);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });


        return view;
    }

}
