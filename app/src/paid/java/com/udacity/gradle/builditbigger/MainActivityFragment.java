package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;


public class MainActivityFragment extends Fragment {

    private ProgressBar progressBar;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        final Button jokeButton = (Button) root.findViewById(R.id.btn_joke);
        progressBar = (ProgressBar) root.findViewById(R.id.progressBar);


        jokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressBar.setVisibility(View.VISIBLE);
                new EndpointsAsyncTask(getActivity().getApplicationContext(), progressBar).execute();
//
            }
        });

        return root;
    }
}









