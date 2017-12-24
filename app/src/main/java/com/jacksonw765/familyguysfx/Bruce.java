package com.jacksonw765.familyguysfx;


import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Bruce extends Fragment {

    private Button buttonBruceOhNo;
    private Button buttonBruceAnus;
    private Button buttonBruceDoThat;
    private Button buttonBruceLetsTalk;
    private Button buttonBruceLiveAlone;
    private Button buttonBrucePullingLegs;
    private Button buttonBruceThatsAlright;
    private Button buttonBruceOhHey;


    public Bruce() {
        // Required empty public constructor
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bruce, container, false);

        buttonBruceOhNo = view.findViewById(R.id.OhNo);
        buttonBruceOhHey = view.findViewById(R.id.button_bruce_ohHey);
        buttonBruceThatsAlright = view.findViewById(R.id.button_bruce_thatsalright);
        buttonBrucePullingLegs = view.findViewById(R.id.button_bruce_pullinglegs);
        buttonBruceLiveAlone = view.findViewById(R.id.button_bruce_livealone);
        buttonBruceLetsTalk = view.findViewById(R.id.button_bruce_letstalk);
        buttonBruceAnus = view.findViewById(R.id.button_bruce_anus);
        buttonBruceDoThat = view.findViewById(R.id.button_bruce_dothat);

        buttonBruceOhNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.bruce_ohno);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBruceAnus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.bruce_anus);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBruceDoThat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.bruce_candothat);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBruceLetsTalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.bruce_letstalk);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBruceLiveAlone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.bruce_livealone);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBrucePullingLegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.bruce_pullinglegs);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBruceThatsAlright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.bruce_thatsalright);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });

        buttonBruceOhHey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.bruce_ohhey);
                if(!mp.isPlaying()) {
                    mp.start();
                }
            }
        });


        return view;
    }



}
