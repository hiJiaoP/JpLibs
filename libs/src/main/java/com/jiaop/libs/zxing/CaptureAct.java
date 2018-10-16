package com.jiaop.libs.zxing.reader;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;

import com.google.zxing.Result;
import com.jiaop.libs.BaseActivity;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/27
 *     desc   : 二维码扫描封装展示页面，必须继承此类
 *     version: 1.0.0
 * </pre>
 */
public class CaptureAct extends BaseActivity {

    protected CaptureActivityHandler handler;
    protected CameraManager cameraManager;
    protected Rect mCropRect = null;

    public Handler getHandler() {
        return handler;
    }

    public Rect getCropRect() {
        return mCropRect;
    }

    public CameraManager getCameraManager() {
        return cameraManager;
    }

    public void handleDecode(Result rawResult, Bundle bundle) {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int setLayoutId() {
        return 0;
    }
}
