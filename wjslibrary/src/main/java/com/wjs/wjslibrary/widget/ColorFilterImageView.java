package com.wjs.wjslibrary.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by ${wangjishan} on 2017/3/20.
 *
 * @version V1.0
 * @Description:加入触摸效果(背景色变化)
 */

@SuppressLint("AppCompatCustomView")
public class ColorFilterImageView extends ImageView implements View.OnTouchListener{

//    public ColorFilterImageView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public ColorFilterImageView(Context context) {
//        super(context);
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                Drawable drawable = getDrawable();
//                if (drawable != null) {
//                    drawable.mutate().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
//                }
//                break;
//            case MotionEvent.ACTION_MOVE:
//                break;
//            case MotionEvent.ACTION_CANCEL:
//            case MotionEvent.ACTION_UP:
//                Drawable drawableUp = getDrawable();
//                if (drawableUp != null) {
//                    drawableUp.mutate().clearColorFilter();
//                }
//                break;
//        }
//
//        return super.onTouchEvent(event);
//    }
//
//    @Override
//    protected void onDetachedFromWindow() {
//        super.onDetachedFromWindow();
//        setImageDrawable(null);
//    }

    private boolean canTouchSwitch = true;
//
    public ColorFilterImageView(Context context) {
        this(context, null);
    }

    public ColorFilterImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ColorFilterImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if (canTouchSwitch)
                    turnOff();
                break;
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                if (canTouchSwitch)
                    turnOn();
                break;
            default:
                break;
        }
        return false;
    }

    public void turnOn() {
        setColorFilter(Color.TRANSPARENT);
    }

    public void turnOff() {
        setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void setCanTouchSwitch(boolean touchSwitch) {
        this.canTouchSwitch = touchSwitch;
    }


}
