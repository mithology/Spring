package com.example.restapi;

/**
 * Created by mitesh on 14/10/20.
 */

public class Greetings {

    private final long id;
    private final String content;

    public Greetings(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}


