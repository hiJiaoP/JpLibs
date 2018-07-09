package com.jiaop.libs.http;

import android.text.TextUtils;

import com.jiaop.libs.utils.GsonUtil;
import com.zhouyou.http.EasyHttp;
import com.zhouyou.http.callback.SimpleCallBack;
import com.zhouyou.http.exception.ApiException;
import com.zhouyou.http.model.HttpParams;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class BaseModel<T> {

    /**
     * 封装请求的函数
     *
     * @param uri      接口地址
     * @param params   参数
     * @param tClass   接收返回结果类型
     * @param listener 回调监听
     */
    public void requestHttp(String uri, HttpParams params, final Class<T> tClass, final OnBaseHttpResultListener<T> listener) {
        EasyHttp.post(uri)
                .params(params)
                .execute(new SimpleCallBack<String>() {
                    @Override
                    public void onError(ApiException e) {
                        listener.fail(e.getMessage());
                    }

                    @Override
                    public void onSuccess(String response) {
                        if (TextUtils.isEmpty(response)) {
                            return;
                        }
                        BaseResult payResult = GsonUtil.json2Object(response, BaseResult.class);
                        if (payResult == null) {
                            return;
                        }
                        if (TextUtils.isEmpty(payResult.getMsg())) {
                            return;
                        }
                        if (payResult.getCode().equals("0")) {
                            //请求成功
                            listener.success(GsonUtil.json2Object(payResult.getData(), tClass));
                        } else if (payResult.getCode().equals("1")) {
                            //请求失败
                            listener.fail(payResult.getMsg());
                        } else if (payResult.getCode().equals("111")) {
                            //其他状态
                        }
                    }
                });
    }

}
