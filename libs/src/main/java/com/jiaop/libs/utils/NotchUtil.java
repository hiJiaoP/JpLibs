package com.jiaop.libs.utils;

import android.content.Context;
import android.util.Log;

import java.lang.reflect.Method;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   : 异面屏刘海帮助类
 *     version: 1.0.0
 * </pre>
 */
public class  NotchUtil {

    public static final int NOTCH_IN_SCREEN_VOIO = 0x00000020;//是否有凹槽
    public static final int ROUNDED_IN_SCREEN_VOIO = 0x00000008;//是否有圆角

    /**
     * 华为
     */
    /**
     * 检测是否存在刘海屏
     *
     * @param context
     * @return
     */
    public static boolean hasNotchInScreen(Context context) {
        boolean ret = false;
        try {
            ClassLoader cl = context.getClassLoader();
            Class HwNotchSizeUtil = cl.loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Method get = HwNotchSizeUtil.getMethod("hasNotchInScreen");
            ret = (boolean) get.invoke(HwNotchSizeUtil);
        } catch (ClassNotFoundException e) {
            Log.e("NotchUtil", "hasNotchInScreen ClassNotFoundException");
        } catch (NoSuchMethodException e) {
            Log.e("NotchUtil", "hasNotchInScreen NoSuchMethodException");
        } catch (Exception e) {
            Log.e("NotchUtil", "hasNotchInScreen Exception");
        } finally {
            return ret;
        }
    }

    /**
     * 获取刘海屏的参数
     *
     * @param context
     * @return
     */
    public static int[] getNotchSize(Context context) {
        int[] ret = new int[]{0, 0};
        try {
            ClassLoader cl = context.getClassLoader();
            Class HwNotchSizeUtil = cl.loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Method get = HwNotchSizeUtil.getMethod("getNotchSize");
            ret = (int[]) get.invoke(HwNotchSizeUtil);
        } catch (ClassNotFoundException e) {
            Log.e("NotchUtil", "getNotchSize ClassNotFoundException");
        } catch (NoSuchMethodException e) {
            Log.e("NotchUtil", "getNotchSize NoSuchMethodException");
        } catch (Exception e) {
            Log.e("NotchUtil", "getNotchSize Exception");
        } finally {
            return ret;
        }
    }

    /**
     * 获取系统状态栏高度
     *
     * @param context
     * @return
     */
    public static int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    /**
     * OPPO
     *
     * @param context
     * @return
     */
    public static boolean hasNotchInOppo(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /**
     * ViVO
     *
     * @param context
     * @return
     */
    public static boolean hasNotchInScreenAtVoio(Context context) {
        boolean ret = false;
        try {
            ClassLoader cl = context.getClassLoader();
            Class FtFeature = cl.loadClass("android.util.FtFeature");
            Method get = FtFeature.getMethod("isFeatureSupport", int.class);
            ret = (boolean) get.invoke(FtFeature, NOTCH_IN_SCREEN_VOIO);
        } catch (ClassNotFoundException e) {
            Log.e("NotchUtil", "hasNotchInScreen ClassNotFoundException");
        } catch (NoSuchMethodException e) {
            Log.e("NotchUtil", "hasNotchInScreen NoSuchMethodException");
        } catch (Exception e) {
            Log.e("NotchUtil", "hasNotchInScreen Exception");
        } finally {
            return ret;
        }
    }

    /**
     * 刘海适配
     */
    public static int notch(Context context) {
        int notchHeight = 0;
        switch (PhoneUtil.getDeviceBrand()) {
            case "HUAWEI":
                //华为
                if (hasNotchInScreen(context)) {
                    notchHeight = UIUtil.px2DpCeilInt(context, getStatusBarHeight(context));
                }
                break;
            case "OPPO":
                //OPPO
                if (hasNotchInOppo(context)) {
                    notchHeight = UIUtil.px2DpCeilInt(context, 80);
                }
                break;
            case "VIVO":
                //VIVO，实际刘海高度为27dp
                if (hasNotchInScreenAtVoio(context)) {
                    notchHeight = 30;
                }
                break;
            case "XIAOMI":
                //XiaoMi
                if (SystemPropertiesProxy.getInt(context, "ro.miui.notch", 0) == 1) {
                    int resourceId = context.getResources().getIdentifier("notch_height", "dimen", "android");
                    if (resourceId > 0) {
                        notchHeight = UIUtil.px2DpCeilInt(context, context.getResources().getDimensionPixelSize(resourceId));
                    }
                }
                break;
        }
        return notchHeight;
    }
}
