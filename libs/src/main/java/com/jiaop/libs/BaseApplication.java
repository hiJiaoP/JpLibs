package com.jiaop.libs;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.jiaop.libs.utils.SharedPreUtil;
import com.luliang.shapeutils.DevShapeUtils;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   : 封装Application基类
 *     version: 1.0.0
 * </pre>
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //设置圆角样式，用来替代shape和selector
        DevShapeUtils.init(this);
        //配置SP
        SharedPreUtil.init(this, getPackageName() + "_data");
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

}
