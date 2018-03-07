package com.example.howest.gametest;

import java.util.List;

/**
 * Created by mathi on 28/02/2018.
 */

public class Game {
    private String name;
    private List<Tag> tags;
    private float rating;
    private String notes;

    public Game(String name, List<Tag> tags, float rating, String notes) {
        this.name = name;
        this.tags = tags;
        this.rating = rating;
        this.notes = notes;
    }
}
