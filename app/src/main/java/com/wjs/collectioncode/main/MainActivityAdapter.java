package com.wjs.collectioncode.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.wjs.collectioncode.R;
import com.wjs.collectioncode.base.BaseRecylerViewAdapter;
import com.wjs.collectioncode.base.BaseViewHolder;
import com.wjs.collectioncode.utils.UtilsLog;

import java.util.List;

/**
 * Created by ${wangjishan} on 2017/3/1.
 *
 * @version V1.0
 * @Description:
 */

public class MainActivityAdapter extends BaseRecylerViewAdapter<String> {


    public MainActivityAdapter(Context mContext, RecyclerView recyclerView, List<String> mDatas, int mLayoutId) {
        super(mContext, recyclerView, mDatas, mLayoutId);
    }


    @Override
    public void convert(Context mContext, RecyclerView.ViewHolder holder, String s) {
        if (holder instanceof BaseViewHolder) {
            TextView tv_content = ((BaseViewHolder) holder).getView(R.id.tv_content);
            UtilsLog.i("str",""+s);
            tv_content.setText(s);
        }
    }


}
