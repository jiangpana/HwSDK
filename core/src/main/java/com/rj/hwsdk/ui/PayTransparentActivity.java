package com.rj.hwsdk.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.rj.hwsdk.pay.HwPayHelper;


/**
 * author: jansir
 * e-mail: 369394014@qq.com
 * date: 2020/6/8.
 */
public class PayTransparentActivity extends Activity {


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        HwPayHelper.pay(this);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        HwPayHelper.onPayResult(this, requestCode, data);
        finish();
    }
}
