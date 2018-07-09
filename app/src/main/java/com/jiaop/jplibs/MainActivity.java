package com.jiaop.jplibs;

import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.jiaop.libs.BaseActivity;
import com.jiaop.libs.utils.PhoneUtil;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements V {

    @BindView(R.id.ll_parent)
    LinearLayout ll_parent;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        Log.e("MainActivity", "获取手机型号 == " + PhoneUtil.getModel());
        Log.e("MainActivity", "获取手机厂商 == " + PhoneUtil.getDeviceBrand());
        Log.e("MainActivity", "获取刘海高度 == " + getNotchHeight());

        P p = new P(this);
//        p.req();
    }

    @Override
    protected void initNetData() {

    }

    @Override
    protected void initOfflineData() {

    }

    @Override
    public String phone() {
        return "13520518525";
    }

    @Override
    public void success(VerificationCode result) {
        Log.e("Main", "result == " + result);
    }

    @Override
    public void fail(String fail) {
        Toast.makeText(this, fail, Toast.LENGTH_SHORT).show();
    }
}
