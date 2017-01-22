package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lenovo on 2017/1/20.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mIdColor;
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param words   A list of Word objects to diaplay in a list
     * @param idColor the ID of the TextView's color
     **/
    public WordAdapter(Activity context, ArrayList<Word> words,int idColor) {
        super(context, 0, words);//表示调用父类的构造方法，只是调用方法，不构造对象
        mIdColor = idColor;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item1, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        defaultTextView.setText(currentWord.getDeafultTranslation());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getMidImage());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resourse ID maps to
        int color = ContextCompat.getColor(getContext(),mIdColor);
        //Set the background color of the text container view
        textContainer.setBackgroundColor(color);
        return listItemView;
    }


}
