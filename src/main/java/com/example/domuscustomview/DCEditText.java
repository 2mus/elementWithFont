package com.example.domuscustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

/**
 * Created by osati.m on 12/25/2017.
 */

public class DCEditText extends LinearLayoutCompat {
    private EditText editText;
    private TextInputLayout textInputLayout;

    public DCEditText(Context context) {
        super(context);
        setupView(context, null);
    }


    public DCEditText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setupView(context, attrs);
    }

    public DCEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setupView(context, attrs);
    }

    private void setupView(Context context, AttributeSet attrs) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.edit_text_layout, this, true);
        editText = (EditText) view.findViewById(R.id.editText);
        textInputLayout = (TextInputLayout) view.findViewById(R.id.text_input_layout);
        if (attrs != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.DCEditTextView);
            try {
//                setFont(context, typedArray.getString(R.styleable.DCEditTextView_font));
                setText(context, typedArray.getString(R.styleable.DCEditTextView_text));
                setColor(context, typedArray.getColor(R.styleable.DCEditTextView_text_color, getContext().getColor(R.color.white)));
                setColorHint(context, typedArray.getColor(R.styleable.DCEditTextView_color_hint, getContext().getColor(R.color.white)));
                setHint(context, typedArray.getString(R.styleable.DCEditTextView_hint));
                setColorLine(context, typedArray.getColor(
                        R.styleable.DCEditTextView_color_line, getContext().getColor(R.color.white)));
                setFontSize(context, typedArray.getDimension(
                        R.styleable.DCEditTextView_font_size, getContext().getResources().getDimension(R.dimen.default_font_size)));
            } finally {
                invalidate();
                requestLayout();
                typedArray.recycle();

            }
        }

    }

    private void setFontSize(Context context, float dimension) {

    }

    private void setColorLine(Context context, int color) {

    }

    private void setHint(Context context, String text) {
//        editText.setHint(text);
        textInputLayout.setHint(text);
    }

    private void setColorHint(Context context, int color) {

    }

    private void setColor(Context context, int color) {

    }

    private void setText(Context context, String text) {

    }

    private void setFont(Context context, String path) {

    }

}
