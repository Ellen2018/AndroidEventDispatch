package com.ellen.androideventdispatch;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

import com.ellen.baselibrary.util.BaseLog;

public class MyTextView  extends android.support.v7.widget.AppCompatTextView{


    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        BaseLog.e("MyTextView",MotionEventUtils.logMotionEvent(event)+"回调了dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        BaseLog.e("MyTextView",MotionEventUtils.logMotionEvent(event)+"回调了onTouchEvent");
        return true;
    }
}
