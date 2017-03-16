package com.wjs.collectioncode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView viewById = (TextView) findViewById(R.id.textView);

        viewById.setText(Html.fromHtml(getString(R.string.html_text)));

    }
}
