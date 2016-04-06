package com.kingbull.android.internal.ui.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.kingbull.internal.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Kailash Dabhi on 06-03-2016.
 * You can contact us at kailash09dabhi@gmail.com OR on skype(kailash.09)
 * Copyright (c) 2016 Kingbull Technology. All rights reserved.
 */
public class HomeActivity extends AppCompatActivity {
    @Bind(R.id.methodsButton)
    Button methodButton;
    @Bind(R.id.fieldsButton)
    Button fieldsButton;
    @Bind(R.id.inheritanceButton)
    Button inheritanceButton;

    @OnClick(R.id.methodsButton)
    void onMethodsButtonClick() {
        startActivity(new Intent(this, MethodsActivity.class));
    }


    @OnClick(R.id.fieldsButton)
    void onFieldsButtonClick() {
        startActivity(new Intent(this, FieldsActivity.class));
    }


    @OnClick(R.id.inheritanceButton)
    void onInheritanceButtonClick() {
        startActivity(new Intent(this, InheritanceActivity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }
}
