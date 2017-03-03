package com.wjs.collectioncode.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wjs.collectioncode.R;
import com.wjs.collectioncode.base.BaseRecylerViewAdapter;
import com.wjs.collectioncode.behavior.AvatarImageBehaviorActivity;
import com.wjs.collectioncode.behavior.BottomSheetBehaviorActivity;
import com.wjs.collectioncode.behavior.CustomBehaviorActivity;
import com.wjs.collectioncode.recyclerview.snaphelper.SnapHelperActivity;
import com.wjs.collectioncode.utils.IntentUtils;
import com.wjs.collectioncode.utils.UtilsLog;
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
        }

    }

}
