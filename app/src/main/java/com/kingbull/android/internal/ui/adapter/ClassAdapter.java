package com.kingbull.android.internal.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kingbull.android.internal.ui.adapter.holder.ClassViewHolder;
import com.kingbull.internal.R;

import java.util.List;

/**
 * Created by Kailash Dabhi on 06-03-2016.
 * You can contact us at kailash09dabhi@gmail.com OR on skype(kailash.09)
 * Copyright (c) 2016 Kingbull Technology. All rights reserved.
 */
public class ClassAdapter extends BaseAdapter<Class> {

    public ClassAdapter(List<Class> list) {
        super(list);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_clazz, parent, false);
        return new ClassViewHolder(this, itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ClassViewHolder classViewHolder = (ClassViewHolder) holder;
        Class clazz = mList.get(position);
        if (position == 0)
            classViewHolder.inheritanceDenoterView.setVisibility(View.GONE);
        else
            classViewHolder.inheritanceDenoterView.setVisibility(View.VISIBLE);
        classViewHolder.clazzTextView.setText(clazz.getName());
    }
}
