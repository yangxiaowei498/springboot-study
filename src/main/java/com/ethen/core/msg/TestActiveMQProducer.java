package com.ethen.core.msg;

/**
 * JMS activeMQ 测试
 */
public class TestActiveMQProducer {

    public static void main(String[] args) {
        ActiveProducer producer = new ActiveProducer();
        TestActiveMQProducer testMq = new TestActiveMQProducer();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Thread 1
        new Thread(testMq.new ProductorMq(producer)).start();
        //Thread 2
        new Thread(testMq.new ProductorMq(producer)).start();
        //Thread 3
        new Thread(testMq.new ProductorMq(producer)).start();
        //Thread 4
        new Thread(testMq.new ProductorMq(producer)).start();
        //Thread 5
        new Thread(testMq.new ProductorMq(producer)).start();
    }

    private class ProductorMq implements Runnable {

        ActiveProducer producer;

        ProductorMq(ActiveProducer producer) {
            this.producer = producer;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    producer.sendMessage("Jaycekon-MQ");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}