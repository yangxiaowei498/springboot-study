package com.ethen.core.facade;

import com.ethen.core.facade.subsys.CPU;
import com.ethen.core.facade.subsys.Disk;
import com.ethen.core.facade.subsys.Memory;

/**
 * 门面类 Facade
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    /**
     * 初始化
     */
    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }


    /**
     * 一键开启
     */
    public void start() {
        System.err.println("Computer => start begin...");
        this.cpu .start();
        this.memory.start();
        this.disk.start();
        System.err.println("Computer => start end...");
    }


    public void shutdown() {
        System.err.println("Computer => shutdown begin...");
        this.cpu .start();
        this.memory.start();
        this.disk.start();
        System.err.println("Computer => shutdown end...");
    }
}
