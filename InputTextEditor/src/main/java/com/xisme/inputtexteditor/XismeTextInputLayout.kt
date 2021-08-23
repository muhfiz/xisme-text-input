package com.xisme.inputtexteditor

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.constraintlayout.widget.ConstraintLayout

class XismeTextInputLayout: ConstraintLayout {

    constructor(context: Context): super(context)

    constructor(context: Context, attrs: AttributeSet): super(context, attrs){
        Log.d(TAG, ": ${getChildAt(0)}")
    }
}

private const val TAG = "InputTextLayout"