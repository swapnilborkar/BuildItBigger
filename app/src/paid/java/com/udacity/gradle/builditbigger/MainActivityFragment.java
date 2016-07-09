package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        final Button jokeButton = (Button) root.findViewById(R.id.btn_joke);


        jokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new EndpointsAsyncTask(getActivity().getApplicationContext()).execute();
//
            }
        });

        return root;
    }
}









