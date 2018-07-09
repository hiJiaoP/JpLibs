package com.jiaop.libs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   : 封装Fragment基类
 *     version: 1.0.0
 * </pre>
 */
public abstract class BaseFragment extends Fragment {

    private boolean isInitView = false;
    private boolean isVisible = false;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(layoutId(), null);
        ButterKnife.bind(this, layout);
        initView();
        isInitView = true;
        return layout;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            isVisible = true;
            isCanLoadData();
        } else {
            isVisible = false;
        }
    }

    private void isCanLoadData() {
        //条件是view初始化完成并且对用户可见
        if (isInitView && isVisible) {
            //防止重复加载数据
            isInitView = false;
            isVisible = false;
            onVisible();
        }
    }

    /**
     * 用户可见加载数据
     */
    private void onVisible() {
        if (((BaseActivity) getActivity()).getNetStatus() == 0) {
            initOfflineData();
        } else {
            initNetData();
        }
    }

    /**
     * 初始化布局数据
     */
    protected abstract void initView();

    /**
     * 获取layoutId
     *
     * @return
     */
    protected abstract int layoutId();

    /**
     * 加载网络数据
     */
    protected abstract void initNetData();

    /**
     * 加载离线数据
     */
    protected abstract void initOfflineData();

}
