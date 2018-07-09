package com.jiaop.jplibs;

import android.content.Context;

import com.jiaop.libs.http.OnBaseHttpResultListener;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public interface I {

    /**
     * 发送验证码
     *
     * @param phone
     * @param listener
     */
    void sendCode(Context context, String phone, OnBaseHttpResultListener<VerificationCode> listener);

}
