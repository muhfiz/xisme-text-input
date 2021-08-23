package com.xisme.inputtexteditor

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout

class XismeTextInputLayout: ConstraintLayout {

    constructor(context: Context): super(context)

    constructor(context: Context, attrs: AttributeSet): super(context, attrs){
        Log.d(TAG, "created: ")
    }

    override fun onFinishInflate() {
        Log.d(TAG, "onFinishInflate: onFinish")
        if (childCount > 1)
            throw IllegalArgumentException("Only 1 child allowed");
        
        if (getChildAt(0) !is XismeTextInputEditText)
            throw IllegalArgumentException("Child must be a XismeTextInputEditText");

        addingTheToolsView()
        super.onFinishInflate()
    }

    private fun addingTheToolsView(){
        var view = AppCompatImageView(context).apply {
            id = View.generateViewId()
        }

        view
    }
}

private const val TAG = "InputTextLayout"