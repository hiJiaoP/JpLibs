package com.jiaop.jplibs.design.prototype;

import android.util.Log;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/23
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Main {

    public void main() {
        Cache.loadCache();

        try {
            Shape clonedShape = (Shape) Cache.getShape("1");
            Log.i("Main", "Shape : " + clonedShape.getType());
            Shape clonedShape1 = (Shape) Cache.getShape("2");
            Log.i("Main", "Shape : " + clonedShape1.getType());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    public void deepMain() {
        try {
            Color color = new Color("1", new Date());
            //通过ObjectOutputStream流将s1对象读出来给ByteArrayOutputStream流
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(bos);
            oos.writeObject(color);
            //ByteArrayOutputStream流将对象信息转成byte数组，这样byte数组里就包含了对象的数据
            byte[] bytes = bos.toByteArray();
            //通过ByteArrayInputStream流读入bytes字节数组中数据，然后传给ObjectInputStream对象输入流
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bis);
            //通过ObjectInputStream返回一个Sheep对象
            //获取克隆好的对象
            Color colorClone = (Color) ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
