package com.jiaop.libs;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;

import com.gyf.barlibrary.ImmersionBar;
import com.jiaop.libs.broadcast.NetWorkReceiver;
import com.jiaop.libs.interfaces.NetWorkIntfc;
import com.jiaop.libs.utils.ActivityUtil;
import com.jiaop.libs.utils.NotchUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   : 封装Activity
 *     version: 1.0.0
 * </pre>
 */
public abstract class BaseActivity extends AppCompatActivity implements NetWorkIntfc {

    private NetWorkReceiver netWorkReceiver;
    private ImmersionBar mImmersionBar;
    private Unbinder knife;
    private int notchHeight = 0;
    private int netStatus = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载布局文件
        setContentView(setLayoutId());
        //隐藏标题栏
        getSupportActionBar().hide();
        //加载黄油刀View注解
        knife = ButterKnife.bind(this);
        //注册Broadcast Receiver
        netWorkReceiver = new NetWorkReceiver(BaseActivity.this);
        IntentFilter filter = new IntentFilter();
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(netWorkReceiver, filter);
        //Activity栈管理
        ActivityUtil.getInstance().addActivity(this);
        //设置沉浸式
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar
                .statusBarColor(ConfigData.BASE_STATUSBAR_COLOR_ID)
                .fitsSystemWindows(true)
                .init();
        notchHeight = NotchUtil.notch(BaseActivity.this);
        initView();
    }

    @Override
    public void netWorkChange(int status) {
        netStatus = status;
        if (status == 0) {
            initOfflineData();
        } else {
            initNetData();
        }
    }

    /**
     * 初始化页面
     */
    protected abstract void initView();

    /**
     * 设置文件布局资源
     *
     * @return
     */
    protected abstract int setLayoutId();

    /**
     * 加载网络数据
     */
    protected void initNetData() {

    }

    /**
     * 加载离线数据
     */
    protected void initOfflineData() {

    }

    /**
     * 获取状态栏
     *
     * @return
     */
    public ImmersionBar getmImmersionBar() {
        return mImmersionBar;
    }

    /**
     * 获取刘海屏高度
     *
     * @return
     */
    public int getNotchHeight() {
        return notchHeight;
    }

    /**
     * 获取网络状态
     *
     * @return
     */
    public int getNetStatus() {
        return netStatus;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (knife != null)
            knife.unbind();
        if (netWorkReceiver != null)
            unregisterReceiver(netWorkReceiver);
        if (mImmersionBar != null)
            mImmersionBar.destroy();
    }

    /**
     * 物理返回
     *
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getRepeatCount() == 0) {
            onKeyBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    /**
     * 物理返回键
     */
    protected void onKeyBack() {

    }
}
