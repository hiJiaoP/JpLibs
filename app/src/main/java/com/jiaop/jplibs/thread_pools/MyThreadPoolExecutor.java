package com.jiaop.jplibs.thread_pools;

import android.util.Log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/25
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class MyThreadPoolExecutor {

    private final static String TAG = "MyThreadPoolExecutor";

    private void main() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4,
                40, 1, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(128));
        for (int i = 0; i < 40; i++) {
            final int index = i;
            Runnable run = new Runnable() {
                @Override
                public void run() {
                    try {
                        String threadName = Thread.currentThread().getName();
                        Log.v(TAG, "线程：" + threadName + ",正在执行第" + index + "个任务");
                        Thread.currentThread().sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            threadPoolExecutor.execute(run);
        }
    }

    private void cached() {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        cachedThreadPool.execute(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        });
    }

    private void fixed() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
        fixedThreadPool.execute(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        });
    }

    private void scheduled() {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        }, 1, 2, TimeUnit.SECONDS);
    }

    private void single() {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.execute(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        });
    }

}
