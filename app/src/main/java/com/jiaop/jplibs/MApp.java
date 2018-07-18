package com.jiaop.jplibs;

import com.jiaop.libs.BaseApplication;
import com.zhouyou.http.EasyHttp;
import com.zhouyou.http.cache.model.CacheMode;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class MApp extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        initEasyHttp();
    }

    private void initEasyHttp() {
        EasyHttp.init(this);
        EasyHttp.getInstance()
                .setBaseUrl("")
                .debug("Libs", true)
                .setReadTimeOut(60 * 1000)
                .setWriteTimeOut(60 * 100)
                .setConnectTimeout(60 * 100)
                .setRetryCount(6)
                .setRetryDelay(1000)
                .setRetryIncreaseDelay(1000)
                .setCacheMode(CacheMode.NO_CACHE)
                .setCacheTime(0)
                .setCacheMaxSize(10 * 1024 * 1024)
                .setCacheVersion(1);
    }
}