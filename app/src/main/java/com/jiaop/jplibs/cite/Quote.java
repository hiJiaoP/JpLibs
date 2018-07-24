package com.jiaop.jplibs.cite;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/23
 *     desc   : 对象的四种引用方式
 *     version: 1.0.0
 * </pre>
 */
public class Quote {

    //强引用
    String str = "abc";
    Object o = new Object();

    /**
     * 软引用
     */
    public void soft() {
        SoftReference<String> sr = new SoftReference<String>(new String("Hello World"));
        //如果软引用对象被GC回收，该方法返回的就是null
        sr.get();
    }

    /**
     * 弱引用
     */
    public void weak() {
        WeakReference<String> sr = new WeakReference<String>(new String("hello"));
        //gc进行垃圾回收
        System.gc();
    }

    /**
     * 虚引用
     */
    public void phantom() {
        ReferenceQueue<String> queue = new ReferenceQueue<String>();
        PhantomReference<String> pr = new PhantomReference<String>(new String("hello"), queue);
        pr.get();
    }

}
