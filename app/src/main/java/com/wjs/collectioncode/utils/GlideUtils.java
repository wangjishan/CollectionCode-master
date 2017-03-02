package com.wjs.collectioncode.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by ${wangjishan} on 2017/3/2.
 *
 * @version V1.0
 * @Description:
 */

public class GlideUtils {

    /**
     * 加载网络图片(设置加载中以及加载失败图片)
     *
     * @param mContext
     * @param url
     * @param mImageView
     * @param localResources
     */
    public static void displayImageView(Context mContext, String url, ImageView mImageView, int... localResources) {
        if (localResources != null) {
            if (localResources.length == 1) {
                Glide.with(mContext).load(url).placeholder(localResources[0]).into(mImageView);
            } else if (localResources.length == 2) {
                Glide.with(mContext).load(url).placeholder(localResources[0]).error(localResources[1]).into(mImageView);
            } else {
                Glide.with(mContext).load(url).into(mImageView);
            }
        } else {
            Glide.with(mContext).load(url).into(mImageView);
        }
    }


}
