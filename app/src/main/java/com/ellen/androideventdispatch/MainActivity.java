package com.ellen.androideventdispatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.ellen.baselibrary.base.BaseActivity;
import com.ellen.baselibrary.util.BaseLog;

/**
 * Activity是不会去拦截事件的，所以它没有onInter
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void setStatus() {

    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        BaseLog.setIsLog(true);
    }

    @Override
    protected void destory() {

    }

    @Override
    protected Boolean isSetVerticalScreen() {
        return null;
    }

    //这是事件分发调用的第一个方法
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        BaseLog.e(getTag(), MotionEventUtils.logMotionEvent(ev)+"回调分发方法:dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    //什么时候调用它呢？只有当要分发的ViewGroup和View不处理事件的时候
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        BaseLog.e(getTag(), MotionEventUtils.logMotionEvent(event)+"回调分发方法:onTouchEvent");
        return super.onTouchEvent(event);
    }

}
