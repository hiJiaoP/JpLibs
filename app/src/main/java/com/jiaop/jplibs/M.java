package com.jiaop.jplibs;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;

import com.jiaop.libs.encrypt.MD5;
import com.jiaop.libs.http.BaseModel;
import com.jiaop.libs.http.OnBaseHttpResultListener;
import com.zhouyou.http.model.HttpParams;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class M extends BaseModel<VerificationCode> implements I {

    @Override
    public void sendCode(Context context, String phone, OnBaseHttpResultListener<VerificationCode> listener) {
        HttpParams params = new HttpParams();
        params.put("UD", getUD(context, ""));
        params.put("phone", phone);
        requestHttp("Login/verificationCode", params, VerificationCode.class, listener);
    }

    /**
     * 获取用户UD
     * 如果没有token，传入""
     *
     * @param context
     * @param token
     * @return
     */
    public static String getUD(Context context, String token) {
        String UdString = " token=" + token + "&version=" +
                getVerName(context) + "&phoneType=2&system=" + Build.VERSION.SDK_INT + "&time=" + getCurrentTimestamp10();
        SortedMap<Object, Object> parameters = new TreeMap<Object, Object>();
        parameters.put("token", token);
        parameters.put("version", getVerName(context));
        parameters.put("phoneType", "2");
        parameters.put("system", String.valueOf(Build.VERSION.SDK_INT));
        parameters.put("time", getCurrentTimestamp10());
        String sign = createSign(parameters);
        String newParam = UdString + "&sign=" + sign;
        return new String(Base64.encode(newParam.getBytes(), Base64.DEFAULT));
    }

    private static String createSign(SortedMap<Object, Object> parameters) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sbkey = new StringBuffer();
        Set es = parameters.entrySet();
        Iterator it = es.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String k = (String) entry.getKey();
            Object v = entry.getValue();
            if (null != v && !"".equals(v)) {
                sb.append(k + "=" + v + "&");
                sbkey.append(k + "=" + v + "&");
            }
        }
        String par = sbkey.toString().substring(0, sbkey.toString().length() - 1);
        String sign = MD5.MD5(par + "Carwash").toUpperCase();
        return sign;
    }

    public static String getVerName(Context context) {
        String verName = "";
        try {
            verName = context.getPackageManager().
                    getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return verName;
    }

    /**
     * 获取当前10位时间戳
     *
     * @return
     */
    public static String getCurrentTimestamp10() {
        return String.format("%010d", System.currentTimeMillis() / 1000);
    }
}
