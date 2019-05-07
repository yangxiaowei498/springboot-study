package com.ethen.core.facade;

/**
 * 客户 调用方 => 调用门面，屏蔽细节
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        System.err.println("=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>");
        computer.shutdown();
    }
}
