package com.example.credit.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import java.util.List;

public class SharePreferences {
    private static final String SPNAME = "credit";

    private SharePreferences() {
    }//私有构造方法

    private static SharePreferences esp;
    public static SharedPreferences sp;

    //初始化本地xml文件
    public static void init(Context ctx) {
        if (sp == null) {
            sp = ctx.getSharedPreferences(SPNAME, ctx.MODE_PRIVATE);
        }
    }

    //单例模式
    public static SharePreferences getLifeSharedPreferences() {
        if (esp == null) {
            esp = new SharePreferences();
        }
        return esp;
    }


    //保存历史记录
    public void putHistory(String listory) {
        Editor editor = sp.edit();
        editor.putString("listory", listory);
        editor.commit();
    }

    public String getHistory() {
        return sp.getString("listory", null);
    }

}
