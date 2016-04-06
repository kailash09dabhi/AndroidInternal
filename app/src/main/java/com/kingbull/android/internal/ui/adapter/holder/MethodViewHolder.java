package com.kingbull.android.internal.ui.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.kingbull.android.internal.ui.adapter.BaseAdapter;
import com.kingbull.android.internal.ui.adapter.MethodAdapter;
import com.kingbull.internal.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Kailash Dabhi on 06-03-2016.
 * You can contact us at kailash09dabhi@gmail.com OR on skype(kailash.09)
 * Copyright (c) 2016 Kingbull Technology. All rights reserved.
 */
public class MethodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    @Bind(R.id.methodTextView)
    public TextView methodTextView;
    BaseAdapter mAdapter;

    public MethodViewHolder(MethodAdapter adapter, View itemView) {
        super(itemView);
        this.mAdapter = adapter;
        ButterKnife.bind(this, itemView);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mAdapter.onItemHolderClick(this);
    }
}
