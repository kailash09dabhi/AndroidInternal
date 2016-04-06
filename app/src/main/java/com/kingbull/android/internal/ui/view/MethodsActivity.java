package com.kingbull.android.internal.ui.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kingbull.android.internal.ui.adapter.MethodAdapter;
import com.kingbull.internal.R;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Kailash Dabhi on 06-03-2016.
 * You can contact us at kailash09dabhi@gmail.com OR on skype(kailash.09)
 * Copyright (c) 2016 Kingbull Technology. All rights reserved.
 */
public class MethodsActivity extends AppCompatActivity {
    @Bind(R.id.recyclerView)
    RecyclerView mRecyclerView;
    MethodAdapter mMethodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fields);
        ButterKnife.bind(this);
        List<Method> methodList = Arrays.asList(AppCompatActivity.class.getDeclaredMethods());
        mMethodAdapter = new MethodAdapter(methodList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mRecyclerView.addItemDecoration(new ItemDecorationAlbumColumns((int) (getResources().getDisplayMetrics().density * 5), 5));
        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(mMethodAdapter);

    }
}
