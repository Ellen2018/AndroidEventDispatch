package com.ellen.androideventdispatch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import com.ellen.baselibrary.util.BaseLog;

public class MyRe extends RelativeLayout {

    public MyRe(Context context) {
        super(context);
    }

    public MyRe(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        BaseLog.e("MyRe",MotionEventUtils.logMotionEvent(ev)+"回调了dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        BaseLog.e("MyRe",MotionEventUtils.logMotionEvent(ev)+"回调了onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        BaseLog.e("MyRe",MotionEventUtils.logMotionEvent(event)+"回调了onTouchEvent");
        return super.onTouchEvent(event);
    }
}
