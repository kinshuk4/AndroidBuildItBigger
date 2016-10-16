package com.example.kchandra.myapplication.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class JokeModel {

    public JokeModel(String joke) {
        this.joke = joke;
    }

    private String joke;

    public String getData() {
        return joke;
    }

    public void setData(String data) {
        joke = data;
    }
}