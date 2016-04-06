package com.kingbull.android.internal.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kingbull.android.internal.ui.adapter.holder.MethodViewHolder;
import com.kingbull.internal.R;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kailash Dabhi on 06-03-2016.
 * You can contact us at kailash09dabhi@gmail.com OR on skype(kailash.09)
 * Copyright (c) 2016 Kingbull Technology. All rights reserved.
 */
public class MethodAdapter extends BaseAdapter<Method> {

    public MethodAdapter(List<Method> list) {
        super(list);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_method, parent, false);
        return new MethodViewHolder(this, itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MethodViewHolder fieldViewHolder = (MethodViewHolder) holder;
        Method method = mList.get(position);
        Class[] classes = method.getParameterTypes();
        List<Class> classList = Arrays.asList(classes);
        String paraText = "";
        for (Class clazz : classList) {
            paraText += clazz.getName() + ",";
        }
        if (paraText.length() > 2)
            paraText = paraText.substring(0, paraText.length() - 1);
        fieldViewHolder.methodTextView.setText(method.getName() + "(" + paraText + ")");
    }
}
