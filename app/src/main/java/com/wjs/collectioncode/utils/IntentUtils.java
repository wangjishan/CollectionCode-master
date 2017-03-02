package com.wjs.collectioncode.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by ${wangjishan} on 2017/3/2.
 *
 * @version V1.0
 * @Description:
 */

public class IntentUtils {

    /**
     * 带参数的传参 没有参数的话传入null即可
     *
     * @param activity
     * @param mClass
     * @param bundle
     */
    public static final void ToActivity(Context activity, Class<?> mClass, Bundle bundle) {
        Intent intent = new Intent(activity, mClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
//        activity.overridePendingTransition(R.anim.push_left_in,
//                R.anim.push_left_out);
    }


    /**
     * 带参数的传参 没有参数的话传入null即可 有返回值
     *
     * @param activity
     * @param mClass
     * @param bundle
     * @param requestCode
     */
    public static final void ToActivityForResult(Activity activity, Class<?> mClass, Bundle bundle, int requestCode) {
        Intent intent = new Intent(activity, mClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivityForResult(intent, requestCode);
//        activity.overridePendingTransition(R.anim.push_left_in,
//                R.anim.push_left_out);
    }


}
