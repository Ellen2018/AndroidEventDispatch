package com.ellen.androideventdispatch;

import android.view.MotionEvent;

public class MotionEventUtils {

    public static String logMotionEvent(MotionEvent motionEvent){
        if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
            return "down";
        }else if(motionEvent.getAction() == MotionEvent.ACTION_UP){
            return "up";
        }else if(motionEvent.getAction() == MotionEvent.ACTION_MOVE){
            return "move";
        }else if(motionEvent.getAction() == MotionEvent.ACTION_CANCEL){
            return "cancel";
        }else {
            return "未知行为";
        }
    }

}
