package com.example.sqs.service;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Service
public class LoadMessages {

    @SqsListener("MsgQueue")
    private void loadMessages(String message){
        System.out.println("Queue Messages: " + message);
    }
}
