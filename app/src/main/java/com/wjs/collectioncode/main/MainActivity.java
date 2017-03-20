package com.wjs.collectioncode.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wjs.collectioncode.R;
import com.wjs.collectioncode.appbarLayout.AppBarLayoutActivity;
import com.wjs.collectioncode.base.BaseRecylerViewAdapter;
import com.wjs.collectioncode.behavior.AvatarImageBehaviorActivity;
import com.wjs.collectioncode.behavior.BottomSheetBehaviorActivity;
import com.wjs.collectioncode.behavior.CustomBehaviorActivity;
import com.wjs.collectioncode.recyclerview.dragswipe.DragSwipeActivity;
import com.wjs.collectioncode.recyclerview.gallery.shop.ShopActivity;
import com.wjs.collectioncode.recyclerview.gallery.weather.WeatherActivity;
import com.wjs.collectioncode.recyclerview.snaphelper.SnapHelperActivity;
import com.wjs.collectioncode.tablayout.TabLayoutTopActivity;
import com.wjs.collectioncode.utils.IntentUtils;
import com.wjs.collectioncode.widget.dynamicimageview.DynamicImageView2Activity;
import com.wjs.collectioncode.widget.dynamicimageview.DynamicImageViewActivity;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements BaseRecylerViewAdapter.OnItemClickListener {


    @BindView(R.id.main_RecyclerView)
    RecyclerView mainRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        initializeData();
    }


    private void initializeData() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mainRecyclerView.setLayoutManager(layoutManager);

        List<String> strings = Arrays.asList(getResources().getStringArray(R.array.mainActivity_List));
        MainActivityAdapter mainActivityAdapter = new MainActivityAdapter(MainActivity.this, mainRecyclerView, strings, R.layout.mainactivityadapter_layout);
        mainRecyclerView.setAdapter(mainActivityAdapter);


        mainActivityAdapter.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(View view, int position) {

        switch (position) {
            case 0:
                IntentUtils.ToActivity(this, SnapHelperActivity.class, null);
                break;
            case 1:
                IntentUtils.ToActivity(this, DynamicImageViewActivity.class, null);
                break;
            case 2:
                IntentUtils.ToActivity(this, BottomSheetBehaviorActivity.class, null);
                break;
            case 3:
                IntentUtils.ToActivity(this, CustomBehaviorActivity.class, null);
                break;
            case 4:
                IntentUtils.ToActivity(this, AvatarImageBehaviorActivity.class, null);
                break;
            case 5:
                IntentUtils.ToActivity(this, TabLayoutTopActivity.class, null);
                break;
            case 6:
                IntentUtils.ToActivity(this, AppBarLayoutActivity.class, null);
                break;
            case 7:
//                IntentUtils.ToActivity(this, Main2Activity.class, null);
                IntentUtils.ToActivity(this, DragSwipeActivity.class, null);
                break;
            case 8:
                IntentUtils.ToActivity(this, ShopActivity.class, null);
                break;
            case 9:
                IntentUtils.ToActivity(this, WeatherActivity.class, null);
                break;
            case 10:
                IntentUtils.ToActivity(this, DynamicImageView2Activity.class, null);
                break;
        }

    }

}
