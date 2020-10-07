package com.example.p_task_model.Task;

import android.widget.RelativeLayout;

public class RookieActivityEvent {
    RookieActivityData rookieActivityData;

    public RookieActivityEvent(RookieActivityData rookieActivityData){
        this.rookieActivityData = rookieActivityData;
    }

    public RookieActivityData getRookieActivityData() {
        return rookieActivityData;
    }

    public void setRookieActivityData(RookieActivityData rookieActivityData) {
        this.rookieActivityData = rookieActivityData;
    }
}
