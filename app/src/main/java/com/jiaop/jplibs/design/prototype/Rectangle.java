package com.jiaop.jplibs.design.prototype;

import android.util.Log;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/23
 *     desc   : 扩展抽象类
 *     version: 1.0.0
 * </pre>
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        Log.i("Rectangle", "Rectangle -- ");
    }

}
