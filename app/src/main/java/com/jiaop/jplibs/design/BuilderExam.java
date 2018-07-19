package com.jiaop.jplibs.design;

import android.content.Context;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/19
 *     desc   : 建造者模式
 *     version: 1.0.0
 * </pre>
 */
public class BuilderExam {

    //一般必需参数设置为final，并且要创建对应的构造函数
    private final Context context;
    //非必需参数不用设置为常量，即可以为空，调用时不用设置值
    private String name;
    private int age;

    public BuilderExam(Builder builder) {
        this.context = builder.context;
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder {

        private final Context context;
        private String name;
        private int age;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder name(String var) {
            this.name = var;
            return this;
        }

        public Builder age(int var) {
            this.age = var;
            return this;
        }

        //最后设置build，返回父类对象，完成实例化
        public BuilderExam build() {
            return new BuilderExam(this);
        }
    }
}
