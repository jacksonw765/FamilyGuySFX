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
public class HiddenFragment extends Fragment {

    private Button buttonThemeSong;
    private Button buttonFalcoPunch;



    public HiddenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hidden, container, false);

        buttonFalcoPunch = view.findViewById(R.id.button_falco);
        buttonThemeSong = view.findViewById(R.id.button_themesong);

        buttonFalcoPunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.falcopunch);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonThemeSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.themesong);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        return view;
    }

}
