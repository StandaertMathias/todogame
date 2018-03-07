package com.example.howest.gametest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class GameDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);

        Spinner tagSpinner = (Spinner) findViewById(R.id.list_tags);
        TagList tagList = new TagList();
        ArrayAdapter<Tag> adapterTags = new ArrayAdapter<Tag>(this,android.R.layout.simple_spinner_item,tagList.getTagList());
        adapterTags.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tagSpinner.setAdapter(adapterTags);
    }
}
