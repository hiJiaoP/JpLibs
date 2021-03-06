package com.jiaop.libs.utils;

import android.annotation.SuppressLint;
import android.os.CountDownTimer;
import android.widget.TextView;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/9
 *     desc   : 倒计时操作帮助类
 *     version: 1.0.0
 * </pre>
 */
public class CountdownUtil {

    /**
     * 倒计时
     *
     * @param view      TextView
     * @param waitTime  总时长 毫秒
     * @param interval  间隔时长 毫秒
     * @param leftText  计时时间左侧文字
     * @param rightText 计时时间右侧文字
     * @param endText   计时结束提示文字
     */
    public static void countDownShow(final TextView view, long waitTime, long interval,
                                     final String leftText, final String rightText, final String endText) {
        view.setEnabled(false);
        CountDownTimer timer = new CountDownTimer(waitTime, interval) {

            @SuppressLint("DefaultLocale")
            @Override
            public void onTick(long l) {
                view.setText(String.format(leftText + "%d" + rightText, l / 1000));
            }

            @Override
            public void onFinish() {
                view.setEnabled(true);
                view.setText(endText);
            }
        };
        timer.start();
    }

}
