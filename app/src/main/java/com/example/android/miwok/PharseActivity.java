package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PharseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharse);
        ArrayList<Word> pharse = new ArrayList<Word>();
        pharse.add(new Word("Where are you going?","你要去哪？"));
        pharse.add(new Word("How are you?","最近怎么样"));
        pharse.add(new Word("Good morning!","早上好"));
        pharse.add(new Word(" a big headache","令人头痛的事"));
        pharse.add(new Word("all right","令人满意的；可以"));
        pharse.add(new Word("admit doing sth.","承认做某事"));
        pharse.add(new Word("allow doing sth.","允许做某事"));
        pharse.add(new Word("excuse doing sth.","原谅做某事"));
        pharse.add(new Word("mind doing sth.","建议做某事"));
        pharse.add(new Word("pardon doing sth.","原谅做某事"));

        WordAdapter pharseAdapter = new WordAdapter(this,pharse,R.color.category_phrases);

        ListView pharseView = (ListView)findViewById(R.id.list_pharse);

        pharseView.setAdapter(pharseAdapter);
    }
}
