package com.bjpowernode.activemq.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyMessageListener implements MessageListener {
    public void onMessage(Message message) {
         if (message instanceof TextMessage){
             try {
                 String text = ((TextMessage) message).getText();
                 System.out.println("发送消息:" + text);
             } catch (JMSException e) {
                 e.printStackTrace();
             }
         }
    }
}
