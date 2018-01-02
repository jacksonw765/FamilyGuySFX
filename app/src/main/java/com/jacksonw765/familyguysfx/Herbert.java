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
public class Herbert extends Fragment {

    //If you are reading this I changed the style of my variables for some unknown reason


    private Button button_herbert_comehere;
    private Button button_herbert_fish;
    private Button button_herbert_hikyle;
    private Button button_herbert_longface;
    private Button button_herbert_musily;
    private Button button_herbert_newspaper;
    private Button button_herbert_popcicle;
    private Button button_herbert_silent;
    private Button button_herbert_sonofbit;
    private Button button_herbert_spread;
    private Button button_herbert_sweaty;
    private Button button_herbert_tylonal;
    private Button button_herbert_whereareyou;

    public Herbert() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_herbert, container, false);

        button_herbert_comehere = view.findViewById(R.id.button_herbert_comehere);
        button_herbert_fish = view.findViewById(R.id.button_herbert_fishitout);
        button_herbert_hikyle = view.findViewById(R.id.button_herbert_hikyle);
        button_herbert_longface = view.findViewById(R.id.button_herbert_longface);
        button_herbert_newspaper = view.findViewById(R.id.button_herbert_newspaper);
        button_herbert_musily = view.findViewById(R.id.button_herbert_musily);
        button_herbert_popcicle = view.findViewById(R.id.button_herbert_popsicle);
        button_herbert_silent = view.findViewById(R.id.button_herbert_silentnight);
        button_herbert_sonofbit = view.findViewById(R.id.button_herbert_sonofbit);
        button_herbert_spread = view.findViewById(R.id.button_herbert_spreadbutter);
        button_herbert_sweaty = view.findViewById(R.id.button_herbert_sweaty);
        button_herbert_tylonal = view.findViewById(R.id.button_herbert_tylonal);
        button_herbert_whereareyou = view.findViewById(R.id.button_herbert_whereyaat);

        button_herbert_comehere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_comehere);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_herbert_fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_fishitout);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_herbert_hikyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_hikyle);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_herbert_longface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_longface);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_herbert_musily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_musily);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_herbert_newspaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_newspaper);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_herbert_popcicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_popcicles);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_herbert_silent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_silentnitght);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_herbert_sonofbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_sonofbit);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_herbert_spread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_spreadbutter);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_herbert_sweaty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_sweaty);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_herbert_tylonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_tylonal);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        button_herbert_whereareyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.herbert_whereareya);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        return view;
    }

}
