package com.example.domuscustomview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;

/**
 * Created by osati.m on 12/25/2017.
 */

public class DCEditText extends LinearLayoutCompat {
    public DCEditText(Context context) {
        super(context);
        setupView();
    }



    public DCEditText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setupView();
    }

    public DCEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setupView();
    }

    private void setupView() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutInflater.inflate(R.layout.edit_text_layout,this,true);

    }

}
