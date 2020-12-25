package com.rj.hwsdk;

import android.content.Context;

import com.huawei.hms.ads.HwAds;


public class SdkManager {

    public static Context sApplicationContext;

    //useType unity上使用则传true
    public static void init(Context context){
        sApplicationContext=context.getApplicationContext();
        HwAds.init(context);

    }
}
