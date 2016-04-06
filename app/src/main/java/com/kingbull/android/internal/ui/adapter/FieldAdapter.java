package com.kingbull.android.internal.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kingbull.android.internal.ui.adapter.holder.FieldViewHolder;
import com.kingbull.internal.R;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by Kailash Dabhi on 06-03-2016.
 * You can contact us at kailash09dabhi@gmail.com OR on skype(kailash.09)
 * Copyright (c) 2016 Kingbull Technology. All rights reserved.
 */
public class FieldAdapter extends BaseAdapter<Field> {

    public FieldAdapter(List<Field> list) {
        super(list);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_field, parent, false);
        return new FieldViewHolder(this, itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        FieldViewHolder fieldViewHolder = (FieldViewHolder) holder;
        Field field = mList.get(position);
        fieldViewHolder.fieldTextView.setText(field.getName());

    }
}
