package com.jacksonw765.familyguysfx;


import android.hardware.camera2.TotalCaptureResult;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.ohoussein.playpause.PlayPauseView;

import java.io.IOException;


/**
 * A simple {@link Fragment} subclass.
 */
public class Songs extends Fragment {

    private PlayPauseView floatingPlayPause;

    private Button buttonSongAlyssaMilano;
    private Button buttonSongAsian;
    private Button buttonSongBrokenRubber;
    private Button buttonSongBrushTeeth;
    private Button buttonSongCreditCardDebt;
    private Button buttonSongDownGirl;
    private Button buttonSongFamily;
    private Button buttonSongFCC;
    private Button buttonSongFlorida;
    private Button buttonSongHomeBowl;
    private Button buttonSongMeltedCheese;
    private Button buttonSongMrBooze;
    private Button buttonSongParents;
    private Button buttonSongPoptart;
    private Button buttonSongRepublicanTown;
    private Button buttonSongThankTheWhites;
    private Button buttonSongTrainBoat;
    private MediaPlayer mediaPlayer;


    public Songs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_songs, container, false);


        floatingPlayPause = view.findViewById(R.id.play_pause_view);


        buttonSongAlyssaMilano = view.findViewById(R.id.button_song_alyssamilano);
        buttonSongAsian = view.findViewById(R.id.button_song_asian);
        buttonSongBrokenRubber = view.findViewById(R.id.button_song_brokenrubber);
        buttonSongBrushTeeth = view.findViewById(R.id.button_song_brushteeth);
        buttonSongCreditCardDebt = view.findViewById(R.id.button_song_creditcard);
        buttonSongDownGirl = view.findViewById(R.id.button_song_downgirl);
        buttonSongFamily = view.findViewById(R.id.button_song_family);
        buttonSongFCC = view.findViewById(R.id.button_song_fcc);
        buttonSongFlorida = view.findViewById(R.id.button_song_florida);
        buttonSongHomeBowl = view.findViewById(R.id.button_song_homebowl);
        buttonSongMeltedCheese = view.findViewById(R.id.button_song_meltedcheese);
        buttonSongMrBooze = view.findViewById(R.id.button_song_mrbooze);
        buttonSongParents = view.findViewById(R.id.button_song_parentsgros);
        buttonSongPoptart = view.findViewById(R.id.button_song_poptart);
        buttonSongRepublicanTown = view.findViewById(R.id.button_song_republican);
        buttonSongThankTheWhites = view.findViewById(R.id.button_song_whites);
        buttonSongTrainBoat = view.findViewById(R.id.button_song_trainboat);

        mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_alyssamilano);

        //MediaPlayer currentMedia = mediaPlayer;

        buttonSongAlyssaMilano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                        mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_alyssamilano);
                        mediaPlayer.start();
                    //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                    //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongAsian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_asian);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongBrokenRubber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_brokenrubber);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongBrushTeeth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_brushteeth);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongCreditCardDebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_creditcarddebt);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongDownGirl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_downgirl);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_family);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongFCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_fcc);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongFlorida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_florida);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongHomeBowl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_homebowl);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongMeltedCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_meltedcheese);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongMrBooze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_mrbooze);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongParents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_parentsgross);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongPoptart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_poptart);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongRepublicanTown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_republicantown);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongThankTheWhites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_thankthewhites);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });

        buttonSongTrainBoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.song_trainboat);
                mediaPlayer.start();
                //changes state of play/pause
                if(floatingPlayPause.isPlay())
                    floatingPlayPause.change(false);
                //called when song finishes
                onMediaCompletion(mediaPlayer);
            }
        });


        floatingPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mediaPlayer.isPlaying() && !floatingPlayPause.isPlay()) {
                    floatingPlayPause.change(true);
                    mediaPlayer.pause();
                    return;
                }

                if (!mediaPlayer.isPlaying() && floatingPlayPause.isPlay()) {
                    floatingPlayPause.change(false);
                    mediaPlayer.start();
                    return;
                }
            }
        });


        return view;
    }

    private void onMediaCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                floatingPlayPause.change(true);
            }
        });
    }

}
