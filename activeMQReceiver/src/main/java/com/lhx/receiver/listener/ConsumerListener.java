package com.lhx.receiver.listener;

import com.lhx.mq.bean.User;
import org.springframework.jms.support.converter.MessageConverter;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 * Created by lhx on 15-8-18 下午5:43
 *
 * @Description
 */
public class ConsumerListener implements MessageListener {

    private MessageConverter messageConverter;

    public void setMessageConverter(MessageConverter messageConverter) {
        this.messageConverter = messageConverter;
    }

    @Override
    public void onMessage(Message message) {
        ObjectMessage objMessage = (ObjectMessage) message;
        try {
            User user = (User) messageConverter.fromMessage(objMessage);
            System.out.println("接收到一个ObjectMessage，包含User对象。");
            System.out.println(user);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
