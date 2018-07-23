package com.jiaop.jplibs.design.prototype;

import android.util.Log;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/23
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        Log.i("Circle", "Circle -- ");
    }

}
