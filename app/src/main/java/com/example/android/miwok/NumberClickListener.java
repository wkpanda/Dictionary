package com.example.android.miwok;

/**
 * Created by Lenovo on 2017/1/18.
 */

import android.view.View;
import android.widget.Toast;

public class NumberClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"open the list of numbers",Toast.LENGTH_SHORT).show();
    }
}
