package com.rj.hwsdk.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.rj.hwsdk.SdkManager;


/**
 * author: jansir
 * e-mail: 369394014@qq.com
 * date: 2020/7/2.
 */
public class SpUtil {
   public static SharedPreferences sp =   SdkManager.sApplicationContext.getSharedPreferences("my_sdk_sharedPreferences", Context.MODE_PRIVATE);

    public static void putString(String key,String json){
        SharedPreferences.Editor editor = sp.edit();//获取编辑器
        editor.putString(key, json);
        editor.apply();
    }

    public static String getString(String key){
      return  sp.getString(key,"admob");
    }
}
