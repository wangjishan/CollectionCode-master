package com.wjs.wjslibrary.widget;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/3/19.
 */

public class Test {


    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

}
