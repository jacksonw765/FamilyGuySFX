package com.jacksonw765.familyguysfx;


import android.content.DialogInterface;
import android.net.MailTo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Info extends Fragment {

    private Button legal;
    private Button email;
    private Button rate;


    public Info() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        legal = view.findViewById(R.id.legal);
        email = view.findViewById(R.id.email);
        rate = view.findViewById(R.id.rate);

        legal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(getContext());
                builder1.setMessage("Thanks for downloading Family Guy Soundboard! " +
                        "All the money this app generates from ads goes to cancer research. Together we have raised $2.71! \n" +
                        "All rights to the sound effects belong to Fox. No copyright intended. ");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Okay",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mail to here
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //google play store link here
            }
        });

        return view;
    }

}
