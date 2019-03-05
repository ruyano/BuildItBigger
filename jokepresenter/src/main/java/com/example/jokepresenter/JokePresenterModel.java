package com.example.jokepresenter;

import org.parceler.Parcel;

@Parcel
public class JokePresenterModel {

    String joke;

    public JokePresenterModel() {
    }

    public JokePresenterModel(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

}
