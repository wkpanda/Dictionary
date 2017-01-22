package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        ArrayList<Word> color= new ArrayList<Word>();
        color.add(new Word("red","红色",R.mipmap.color_red));
        color.add(new Word("green","绿色",R.mipmap.color_green));
        color.add(new Word("brown","棕色",R.mipmap.color_brown));
        color.add(new Word("gray","灰色",R.mipmap.color_gray));
        color.add(new Word("black","黑色",R.mipmap.color_black));
        color.add(new Word("white","白色",R.mipmap.color_white));
        color.add(new Word("dusyt yellow","深黄色",R.mipmap.color_dusty_yellow));
        color.add(new Word("mustard yellow","芥末黄色",R.mipmap.color_mustard_yellow));

        WordAdapter colorAdapter = new WordAdapter(this,color,R.color.category_colors);

        ListView colorView = (ListView)findViewById(R.id.list_colors);
        colorView.setAdapter(colorAdapter);

    }
}
