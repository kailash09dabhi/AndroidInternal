package com.kingbull.android.internal.ui.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

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
    @Bind(R.id.fieldTextView)
    TextView fieldTextView;
    List<Field> fieldList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fieldss);
        ButterKnife.bind(this);
        Class clazz = null;
        try {
            clazz = Class.forName(getIntent().getStringExtra("class"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        fieldList = FieldUtils.getAllFieldsList(clazz);
        fieldTextView.setText(Html.fromHtml(buildHtml()));

    }

    private String buildHtml() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < fieldList.size(); i++) {
            Field field = fieldList.get(i);
            builder.append(i).append("\t\t").append(field.getName()).append("<br/><br/>");
        }
        return builder.toString();
    }
}
