package com.wjs.wjslibrary.ninepatch;

import android.content.Context;
import android.widget.ImageView;

import com.wjs.wjslibrary.widget.ColorFilterImageView;

import java.util.List;

/**
 * 九宫格适配器
 *
 * @param <T>
 */
public abstract class NinePatchImageViewAdapter<T> {


    protected abstract void onDisplayImage(Context context, ImageView imageView, T t);

    protected void onItemImageClick(Context context, ImageView imageView, int index, List<T> list) {
    }

    protected ImageView generateImageView(Context context) {
        ColorFilterImageView imageView = new ColorFilterImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }
}