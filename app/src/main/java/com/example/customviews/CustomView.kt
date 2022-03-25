package com.example.customviews

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout

class CustomView(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {

    private var attributes: TypedArray? = null

    init {
        inflate(context, R.layout.custom_text_view, null)
        attributes = context.obtainStyledAttributes(attrs, R.styleable.CustomView)
    }




}