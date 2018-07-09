package com.jiaop.jplibs;

import com.jiaop.libs.http.OnBaseHttpResultListener;
import com.jiaop.libs.utils.ActivityUtil;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class P {

    private I i;
    private V v;

    public P(V v) {
        this.v = v;
        this.i = new M();
    }

    public void req() {
        i.sendCode(ActivityUtil.getInstance().getCurrentActivity(), v.phone(), new OnBaseHttpResultListener<VerificationCode>() {
            @Override
            public void success(VerificationCode result) {
                v.success(result);
            }

            @Override
            public void fail(String fail) {
                v.fail(fail);
            }
        });
    }

}
