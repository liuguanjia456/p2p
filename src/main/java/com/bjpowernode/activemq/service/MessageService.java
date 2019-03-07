package com.bjpowernode.activemq.service;

import com.bjpowernode.activemq.listener.MyMessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jms.Message;

@Service
public class MessageService {

     @Autowired
     private MyMessageListener myMessageListener;

    public void recelivermessage(Message message){
         myMessageListener.onMessage(message);
    }
}
