package com.example;

import java.util.Random;

public class JokeGenerator {


    public String getRandomJoke(){
    String [] arr = {
            "What do you get when you cross a cow and an octopus?  A reprimand from the Scientific Ethics and Integrity Committee and an immediate withdrawal of your grant funding.",
            "To whoever stole my copy of Microsoft Office: I will find you.. you have my Word!",
            "Did you hear what happened to the guy whose left arm and left leg got chopped off? He's dead.",
            "Why do midgets laugh when they run? Because the grass tickles their balls!",
            "What did the duck do after he lost his wife, his job, and his house? He became a Quackhead."
    };

    Random random = new Random();
    int select = random.nextInt(arr.length);
    return arr[select];
}}
