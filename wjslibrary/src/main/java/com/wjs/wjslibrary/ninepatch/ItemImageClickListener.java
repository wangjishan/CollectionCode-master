package com.wjs.wjslibrary.ninepatch;

import android.content.Context;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by wjs
 *
 * Email: wangjishan9@gmail.com
 */

public interface ItemImageClickListener<T> {
    void onItemImageClick(Context context, ImageView imageView, int index, List<T> list);
}
