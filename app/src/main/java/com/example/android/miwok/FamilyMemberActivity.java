package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_member);
        ArrayList<Word> families = new ArrayList<Word>();
        families.add(new Word("father","父亲",R.mipmap.family_father));
        families.add(new Word("mother","母亲",R.mipmap.family_mother));
        families.add(new Word("grandfather","爷爷/姥爷",R.mipmap.family_grandfather));
        families.add(new Word("grandmother","奶奶/姥姥",R.mipmap.family_grandmother));
        families.add(new Word("older brother","哥哥",R.mipmap.family_older_brother));
        families.add(new Word("older sister","姐姐",R.mipmap.family_older_sister));
        families.add(new Word("younger brother","弟弟",R.mipmap.family_younger_brother));
        families.add(new Word("younger sisiter","妹妹",R.mipmap.family_younger_sister));
        families.add(new Word("son","儿子",R.mipmap.family_son));
        families.add(new Word("daughter","女儿",R.mipmap.family_daughter));

        WordAdapter familiesAdapter = new WordAdapter(this,families,R.color.category_family);

        ListView familiesView = (ListView)findViewById(R.id.list_family);
        familiesView.setAdapter(familiesAdapter);
    }
}
