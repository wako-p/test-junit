package com.example;

public class HelloX {

    private final String language;

    public HelloX(String language) {
        this.language = language;
    }

    public String toString() {
        return "Hello" + " " + this.language;
    }
}
