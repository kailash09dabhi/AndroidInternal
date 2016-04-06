package com.kingbull.android.internal.ui.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.kingbull.android.internal.ui.PackageClassMap;
import com.kingbull.internal.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnEditorAction;

/**
 * Created by Kailash Dabhi on 06-03-2016.
 * You can contact us at kailash09dabhi@gmail.com OR on skype(kailash.09)
 * Copyright (c) 2016 Kingbull Technology. All rights reserved.
 */
public class MainActivity extends AppCompatActivity {
    @Bind(R.id.classNameAutoCompleteView)
    AutoCompleteTextView classNameAutoCompleteView;

    @OnEditorAction(R.id.classNameAutoCompleteView)
    boolean onPasswordEditorAction(int id, KeyEvent key) {
        if (id == R.id.search || id == EditorInfo.IME_NULL) {
            Intent intent = new Intent(MainActivity.this, FieldsActivity.class);
            intent.putExtra("class", classNameAutoCompleteView.getText().toString());
            startActivity(intent);
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        List<Class> classes = listLoadedClasses(getClassLoader());
        HashMap<String, Class> classNames = PackageClassMap.ANDROID_WIDGET_CLASS_MAP;
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, new ArrayList<>(classNames.keySet()));
        classNameAutoCompleteView.setAdapter(adapter);
    }


    public List<Class> listLoadedClasses(ClassLoader byClassLoader) {
        List<Class> classList = new ArrayList<>();
        Class clKlass = byClassLoader.getClass();
        System.out.println("Classloader: " + clKlass.getCanonicalName());
        while (clKlass != java.lang.ClassLoader.class) {
            clKlass = clKlass.getSuperclass();
        }
        try {
            java.lang.reflect.Field fldClasses = clKlass
                    .getDeclaredField("classes");
            fldClasses.setAccessible(true);
            Vector classes = (Vector) fldClasses.get(byClassLoader);
            for (Iterator iter = classes.iterator(); iter.hasNext(); ) {
                classList.add((Class) iter.next());
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return classList;
    }
}
