package com.wjs.collectioncode.widget.dynamicimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.wjs.collectioncode.R;
import com.wjs.wjslibrary.ninepatch.NinePatchImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicImageView2Activity extends AppCompatActivity {

    private RecyclerView mRvPostLister;
    private PostAdapter mNineImageAdapter;

    private List<Post> mPostList;
    private String[] IMG_URL_LIST = {
            "http://ac-QYgvX1CC.clouddn.com/36f0523ee1888a57.jpg", "http://ac-QYgvX1CC.clouddn.com/07915a0154ac4a64.jpg",
            "http://ac-QYgvX1CC.clouddn.com/9ec4bc44bfaf07ed.jpg", "http://ac-QYgvX1CC.clouddn.com/fa85037f97e8191f.jpg",
            "http://ac-QYgvX1CC.clouddn.com/de13315600ba1cff.jpg", "http://ac-QYgvX1CC.clouddn.com/15c5c50e941ba6b0.jpg",
            "http://ac-QYgvX1CC.clouddn.com/10762c593798466a.jpg", "http://ac-QYgvX1CC.clouddn.com/eaf1c9d55c5f9afd.jpg",
            "http://ac-QYgvX1CC.clouddn.com/ad99de83e1e3f7d4.jpg", "http://ac-QYgvX1CC.clouddn.com/233a5f70512befcc.jpg",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewServer.get(this).addWindow(this);
        setContentView(R.layout.activity_dynamic_image_view2);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        mRvPostLister = (RecyclerView) findViewById(R.id.rv_post_list);
        final LinearLayoutManager manager = new LinearLayoutManager(this);
        mRvPostLister.setLayoutManager(manager);

        mPostList = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            List<String> imgUrls = new ArrayList<>();
            imgUrls.addAll(Arrays.asList(IMG_URL_LIST).subList(0, i % 9));
            Post post = new Post("Am I handsome? Am I handsome? Am I handsome?", imgUrls);
            mPostList.add(post);
        }

        mNineImageAdapter = new PostAdapter(this, mPostList, NinePatchImageView.STYLE_GRID);
        mRvPostLister.setAdapter(mNineImageAdapter);

        manager.scrollToPositionWithOffset(5, 0);
        mRvPostLister.post(new Runnable() {
            @Override
            public void run() {
                View view = manager.findViewByPosition(1);
                if (view != null) System.out.println(view.getMeasuredHeight());
            }
        });

    }

    public void onDestroy() {
        super.onDestroy();
        ViewServer.get(this).removeWindow(this);
    }

    public void onResume() {
        super.onResume();
        ViewServer.get(this).setFocusedWindow(this);
    }

}
