package com.example.SWAPNIL.myapplication.backend;

import com.example.JokeGenerator;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    private JokeGenerator jokeGenerator;

    public JokeBean(){
    jokeGenerator = new JokeGenerator();
    }

    public String getJoke(){
        return jokeGenerator.getRandomJoke();
    }
}