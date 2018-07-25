package com.jiaop.jplibs.design.facade;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/25
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Computer {

    private CPU cpu;
    private Memory memory;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
    }

    /**
     * 开启所有子系统
     */
    public void startup() {
        cpu.startup();
        memory.startup();
    }

    /**
     * 关闭所有子系统
     */
    public void shutdown() {
        cpu.shutdown();
        memory.shutdown();
    }

}
