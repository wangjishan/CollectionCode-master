package com.wjs.collectioncode.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wjs.collectioncode.R;
import com.wjs.collectioncode.base.BaseRecylerViewAdapter;

import java.util.ArrayList;
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


    }

}
