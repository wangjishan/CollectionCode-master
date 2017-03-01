package com.wjs.collectioncode.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wjs.collectioncode.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


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
    }


}
