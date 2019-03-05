package com.example.jokeslib;

import java.util.ArrayList;
import java.util.Random;

public class Joke {

    private static ArrayList<String> jokes;

    public static String getJoke() {
        if (jokes == null)
            initJokes();
        return jokes.get(new Random().nextInt(jokes.size()));
    }

    private static void initJokes() {
        jokes = new ArrayList<>();
        for (int i = 0; i<=10; i++) {
            jokes.add("joke: " + i);
            System.out.println(jokes.get(i));
        }
    }

}
