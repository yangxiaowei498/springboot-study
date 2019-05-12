package com.ethen.core.msg;

/**
 *
 * 默认管理控制台：http://localhost:8161/admin/index.jsp
 * 用户名密码：admin/admin
*/



public class TestActiveMQConsumer {


    public static void main(String[] args){
        ActiveConsumer consumer = new ActiveConsumer();
//        consumer.init();
        TestActiveMQConsumer testConsumer = new TestActiveMQConsumer();
        new Thread(testConsumer.new ConsumerMq(consumer)).start();
        new Thread(testConsumer.new ConsumerMq(consumer)).start();
        new Thread(testConsumer.new ConsumerMq(consumer)).start();
        new Thread(testConsumer.new ConsumerMq(consumer)).start();
    }

    private class ConsumerMq implements Runnable{
        ActiveConsumer consumer;
        public ConsumerMq(ActiveConsumer consumer){
            this.consumer = consumer;
        }

        @Override
        public void run() {
            while(true){
                try {
                    consumer.getMessage("Jaycekon-MQ");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}