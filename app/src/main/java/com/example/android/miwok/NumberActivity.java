package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","一",R.mipmap.number_one));
        words.add(new Word("two","二",R.mipmap.number_two));
        words.add(new Word("three","三",R.mipmap.number_three));
        words.add(new Word("four","四",R.mipmap.number_four));
        words.add(new Word("five","五",R.mipmap.number_five));
        words.add(new Word("six","六",R.mipmap.number_six));
        words.add(new Word("seven","七",R.mipmap.number_seven));
        words.add(new Word("eight","八",R.mipmap.number_eight));
        words.add(new Word("nine","九",R.mipmap.number_nine));
        words.add(new Word("ten","十",R.mipmap.number_ten));

        WordAdapter itemAdapter = new WordAdapter(this,words,R.color.category_numbers);

        ListView listView = (ListView)findViewById(R.id.list_number);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mMediaPlayer = MediaPlayer.create(NumberActivity.this,R.raw.number_one);
                mMediaPlayer.start();
            }
        });


        listView.setAdapter(itemAdapter);
    }
}


