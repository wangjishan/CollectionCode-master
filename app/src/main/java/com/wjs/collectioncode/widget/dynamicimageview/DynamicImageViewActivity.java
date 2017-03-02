package com.wjs.collectioncode.widget.dynamicimageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wjs.collectioncode.R;
import com.wjs.collectioncode.main.MainActivity;
import com.wjs.collectioncode.main.MainActivityAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DynamicImageViewActivity extends AppCompatActivity {


    @BindView(R.id.DynamicImageView_RecyclerView)
    RecyclerView DynamicImageViewRecyclerView;

    private List<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_image_view);
        ButterKnife.bind(this);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        DynamicImageViewRecyclerView.setLayoutManager(layoutManager);

        list.add("dsd");
//        list.add("dsd");
//        list.add("dsd");
//        list.add("dsd");

        DynamicImageViewActivityAdapter dynamicImageViewActivityAdapter = new DynamicImageViewActivityAdapter(DynamicImageViewActivity.this
                ,DynamicImageViewRecyclerView, list, R.layout.dynamicimageviewactivityadapter_layout);
        DynamicImageViewRecyclerView.setAdapter(dynamicImageViewActivityAdapter);


    }


}
