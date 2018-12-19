package com.example.multilanguages;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.multilanguages.utils.LocalManageUtil;


public class BaseActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocalManageUtil.setLocal(newBase));
    }
}
