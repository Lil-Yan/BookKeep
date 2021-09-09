package com.example.bookkeeping;

import android.app.Application;

import com.example.bookkeeping.db.DBManager;
//表示全局应用对象

public class UniteApp  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化数据库
        DBManager.initDB(getApplicationContext());
    }
}
