package com.jiaop.libs.utils;

import android.graphics.Bitmap;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/9
 *     desc   : 常用功能操作帮助类
 *     version: 1.0.0
 * </pre>
 */
public class FeaturesUtil {

    /**
     * 输入框显示金额，格式为：0.01
     * 需要为该EditText设置：android:inputType="number|numberDecimal"
     *
     * @param editText
     */
    public static void showAmountEditText(final EditText editText) {
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String temp = editable.toString();
                if (temp.length() == 2) {
                    if (temp.indexOf("0") == 0) {
                        if (!temp.substring(1).equals(".")) {
                            editText.setText("0");
                            editText.setSelection(editText.length());
                        }
                    }
                }
                int posDot = temp.indexOf(".");
                if (posDot <= 0) return;
                if (temp.length() - posDot - 1 > 2) {
                    editable.delete(posDot + 3, posDot + 4);
                }
            }
        });
    }

    /**
     * EditText竖直方向能否够滚动
     *
     * @param editText
     * @return
     */
    public static boolean canVerticalScroll(EditText editText) {
        //滚动的距离
        int scrollY = editText.getScrollY();
        //控件内容的总高度
        int scrollRange = editText.getLayout().getHeight();
        //控件实际显示的高度
        int scrollExtent = editText.getHeight() - editText.getCompoundPaddingTop() - editText.getCompoundPaddingBottom();
        //控件内容总高度与实际显示高度的差值
        int scrollDifference = scrollRange - scrollExtent;
        if (scrollDifference == 0) {
            return false;
        }
        return (scrollY > 0) || (scrollY < scrollDifference - 1);
    }

    /**
     * 将View转换成Bitmap
     *
     * @return
     */
    public static Bitmap getViewBitmap(View comBitmap) {
        Bitmap bitmap = null;
        if (comBitmap != null) {
            comBitmap.clearFocus();
            comBitmap.setPressed(false);
            boolean willNotCache = comBitmap.willNotCacheDrawing();
            comBitmap.setWillNotCacheDrawing(false);
            int color = comBitmap.getDrawingCacheBackgroundColor();
            comBitmap.setDrawingCacheBackgroundColor(0);
            float alpha = comBitmap.getAlpha();
            comBitmap.setAlpha(1.0f);
            if (color != 0) {
                comBitmap.destroyDrawingCache();
            }
            int widthSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.EXACTLY);
            int heightSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.EXACTLY);
            comBitmap.measure(widthSpec, heightSpec);
            comBitmap.layout(0, 0, 0, 0);
            comBitmap.buildDrawingCache();
            Bitmap cacheBitmap = comBitmap.getDrawingCache();
            comBitmap.setDrawingCacheEnabled(false);
            if (cacheBitmap == null) {
                return null;
            }
            bitmap = Bitmap.createBitmap(cacheBitmap);
            comBitmap.setAlpha(alpha);
            comBitmap.destroyDrawingCache();
            comBitmap.setWillNotCacheDrawing(willNotCache);
            comBitmap.setDrawingCacheBackgroundColor(color);
        }
        return bitmap;
    }

    /**
     * 设置TextView中间线样式
     *
     * @param textView  需要设置的TextView
     * @param text      显示的文本
     * @param start     开始的下标
     * @param end       结束的下标
     * @param spannable 需要中间线的样式
     */
    public static void showMiddleLine(TextView textView, String text, int start, int end, int spannable) {
        Spannable spanStrikethrough = new SpannableString(text);
        StrikethroughSpan stSpan = new StrikethroughSpan();
        spanStrikethrough.setSpan(stSpan, start, end, spannable);
        textView.setText(spanStrikethrough);
    }

}
