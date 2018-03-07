package com.example.howest.gametest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mathi on 28/02/2018.
 */

public class TagList {
    private List<Tag> tagList;

    public TagList() {
        tagList = new ArrayList<>();
        tagList.add(new Tag("Action"));
        tagList.add(new Tag("RPG"));
    }

    public List<Tag> getTagList() {
        return tagList;
    }
}
