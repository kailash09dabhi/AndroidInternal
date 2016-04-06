package com.kingbull.android.internal.ui.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kingbull.android.internal.ui.adapter.ClassAdapter;
import com.kingbull.internal.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Kailash Dabhi on 06-03-2016.
 * You can contact us at kailash09dabhi@gmail.com OR on skype(kailash.09)
 * Copyright (c) 2016 Kingbull Technology. All rights reserved.
 */
public class InheritanceActivity extends AppCompatActivity {
    @Bind(R.id.recyclerView)
    RecyclerView mRecyclerView;
    ClassAdapter mClassAdapter;
    List<Class> mInheritanceStackList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fields);
        ButterKnife.bind(this);
        List<Class> classList = getInheritanceStack(AppCompatActivity.class);
        classList.add(0, AppCompatActivity.class);
        Collections.reverse(classList);
        mClassAdapter = new ClassAdapter(classList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mRecyclerView.addItemDecoration(new ItemDecorationAlbumColumns((int) (getResources().getDisplayMetrics().density * 5), 5));
        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(mClassAdapter);

    }

    List<Class> getInheritanceStack(Class clazz) {
        Class aclazz = clazz.getSuperclass();
        if (aclazz == null)
            return mInheritanceStackList;
        else {
            mInheritanceStackList.add(aclazz);
            return getInheritanceStack(aclazz);
        }
    }


}
