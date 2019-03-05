package com.example.jokeslib;

import java.util.ArrayList;
import java.util.Random;

public class Joke {

    private static Joke mInstance;
    private ArrayList<String> jokes;

    public static Joke getInstance() {
        if (mInstance == null)
            mInstance = new Joke();
        return mInstance;
    }

    public String getJoke() {
        if (jokes == null)
            initJokes();
        return jokes.get(new Random().nextInt(jokes.size()));
    }

    private void initJokes() {
        jokes = new ArrayList<>();
        for (int i = 0; i<=10; i++) {
            jokes.add("joke: " + i);
        }
    }

}
