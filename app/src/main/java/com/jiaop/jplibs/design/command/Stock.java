package com.jiaop.jplibs.design.command;

import android.util.Log;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        Log.i("Stock", "Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        Log.i("Stock", "Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }

}
