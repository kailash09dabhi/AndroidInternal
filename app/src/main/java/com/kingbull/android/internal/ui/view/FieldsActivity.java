package com.kingbull.android.internal.ui.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kingbull.android.internal.ui.adapter.FieldAdapter;
import com.kingbull.internal.R;

import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Kailash Dabhi on 06-03-2016.
 * You can contact us at kailash09dabhi@gmail.com OR on skype(kailash.09)
 * Copyright (c) 2016 Kingbull Technology. All rights reserved.
 */
public class FieldsActivity extends AppCompatActivity {
    @Bind(R.id.recyclerView)
    RecyclerView mRecyclerView;
    FieldAdapter mFieldAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fields);
        ButterKnife.bind(this);
        Class clazz = null;
        try {
            clazz = Class.forName(getIntent().getStringExtra("class"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        List<Field> fieldList = FieldUtils.getAllFieldsList(clazz);
        mFieldAdapter = new FieldAdapter(fieldList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mRecyclerView.addItemDecoration(new ItemDecorationAlbumColumns((int) (getResources().getDisplayMetrics().density * 5), 5));
        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(mFieldAdapter);

    }
}
