package com.jiaop.jplibs.design.intermediary;

import android.util.Log;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class ChatRoom {

    public static void showMessage(User user,String msg) {
        Log.i("ChatRoom", user.getName() + " say :" + msg);
    }

}
