package com.kingbull.android.internal.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.List;

/**
 * Created by Kailash Dabhi on 28-10-2015.
 * You can contact us at kingbulltechnology@gmail.com
 * Copyright (c) 2015 Kingbull Technology. All rights reserved.
 */
public class BaseAdapter<E> extends RecyclerView.Adapter {
    public AdapterView.OnItemClickListener mOnItemClickListener;
    protected List<E> mList;

    protected BaseAdapter(List<E> list) {
        mList = list;
    }

    @Override
     public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    public void onItemHolderClick(RecyclerView.ViewHolder itemHolder) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(null, itemHolder.itemView,
                    itemHolder.getPosition(), itemHolder.getItemId());
        }
    }

}
