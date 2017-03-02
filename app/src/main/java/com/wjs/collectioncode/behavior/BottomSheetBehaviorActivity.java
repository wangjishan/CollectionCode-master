package com.wjs.collectioncode.behavior;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.wjs.collectioncode.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BottomSheetBehaviorActivity extends AppCompatActivity {

    @BindView(R.id.btn_show_bottom_sheet)
    TextView btnShowBottomSheet;
    @BindView(R.id.btn_show_bottom_sheetFragment)
    TextView btnShowBottomSheetFragment;
    @BindView(R.id.share_view)
    FrameLayout shareView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet_behavior);
        ButterKnife.bind(this);

        //获取BottomSheetBehavior
        final BottomSheetBehavior sheetBehavior = BottomSheetBehavior.from(shareView);
//        sheetBehavior.setSkipCollapsed(false);
//        //下滑的时候是否可以隐藏
//        sheetBehavior.setHideable(true);
        //默认设置为隐藏
        sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED );
        //设置折叠时的高度
        //sheetBehavior.setPeekHeight(BottomSheetBehavior.PEEK_HEIGHT_AUTO);

        //监听BottomSheetBehavior 状态的变化
        sheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });

        btnShowBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                    sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });


        btnShowBottomSheetFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBottomSheetDialog();
            }
        });


    }


    private void showBottomSheetDialog() {
        BottomSheetFragment fragment = BottomSheetFragment.newInstance();
        fragment.show(getSupportFragmentManager(), BottomSheetFragment.class.getSimpleName());
    }


}
