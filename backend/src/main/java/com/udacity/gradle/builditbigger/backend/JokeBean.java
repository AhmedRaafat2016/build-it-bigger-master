package com.udacity.gradle.builditbigger.backend;

import com.udacity.gradle.builditbigger.common.Joke;


public class JokeBean {

    private String joke;

    public String getJoke() {
        return joke;
    }

    public void setJoke(Joke joke) {
        this.joke = joke.content();
    }
}
