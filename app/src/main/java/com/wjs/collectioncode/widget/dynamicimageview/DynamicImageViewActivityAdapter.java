package com.wjs.collectioncode.widget.dynamicimageview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.wjs.collectioncode.R;
import com.wjs.collectioncode.base.BaseRecylerViewAdapter;
import com.wjs.collectioncode.base.BaseViewHolder;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ${wangjishan} on 2017/3/2.
 *
 * @version V1.0
 * @Description:
 */

public class DynamicImageViewActivityAdapter extends BaseRecylerViewAdapter<String> {


    public static final String PICTURE_URL[] = {
            "http://www.pptbz.com/pptpic/UploadFiles_6909/201203/2012031220134655.jpg",
            "http://pic23.nipic.com/20120917/10076134_112929387108_2.jpg",
            "http://img3.imgtn.bdimg.com/it/u=3504467926,1438117737&fm=206&gp=0.jpg",
//            "http://img1.imgtn.bdimg.com/it/u=663132532,1265075679&fm=206&gp=0.jpg",
//            "http://img2.imgtn.bdimg.com/it/u=430285025,1168446243&fm=206&gp=0.jpg",
//            "http://img4.imgtn.bdimg.com/it/u=3814971924,4161415886&fm=206&gp=0.jpg",
//            "http://img1.imgtn.bdimg.com/it/u=731307697,3873909574&fm=206&gp=0.jpg",
//            "http://img3.imgtn.bdimg.com/it/u=1681882397,3535453166&fm=206&gp=0.jpg",
//            "http://img2.imgtn.bdimg.com/it/u=2059708553,255963759&fm=206&gp=0.jpg",
//            "http://img2.imgtn.bdimg.com/it/u=1023930876,2577057362&fm=206&gp=0.jpg",
//            "http://img0.imgtn.bdimg.com/it/u=2349257573,7606495&fm=206&gp=0.jpg"
    };


    public DynamicImageViewActivityAdapter(Context mContext, RecyclerView recyclerView, List<String> mDatas, int mLayoutId) {
        super(mContext, recyclerView, mDatas, mLayoutId);
    }


    @Override
    public void convert(Context mContext, RecyclerView.ViewHolder holder, String s) {
        if (holder instanceof BaseViewHolder) {

            List<String> strings = Arrays.asList(PICTURE_URL);
            DynamicImageView DynamicImageView = ((BaseViewHolder) holder).getView(R.id.DynamicImageView);
            DynamicImageView.setShuoShuoPosition(0);
            DynamicImageView.setList(strings);
        }
    }


}
