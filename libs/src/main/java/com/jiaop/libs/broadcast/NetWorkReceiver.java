package com.jiaop.libs.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.jiaop.libs.interfaces.NetWorkIntfc;
import com.jiaop.libs.utils.NetWorkUtil;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   : 网络监听广播接收器
 *     version: 1.0.0
 * </pre>
 */
public class NetWorkReceiver extends BroadcastReceiver {

    private NetWorkIntfc mNetWorkIntfc;

    public NetWorkReceiver(NetWorkIntfc netWorkIntfc) {
        this.mNetWorkIntfc = netWorkIntfc;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //有网络链接
        if (NetWorkUtil.isNetworkConnected(context)) {
            mNetWorkIntfc.netWorkChange(NetWorkUtil.getNetType(context));
        }
        //无网络链接
        else {
            mNetWorkIntfc.netWorkChange(0);
        }
    }
}
