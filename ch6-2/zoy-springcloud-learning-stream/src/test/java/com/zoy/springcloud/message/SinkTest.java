package com.zoy.springcloud.message;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ·？？？这个测试有问题，不知道为什么 生产者不能发送消息
 * Created by zouzp on 2019/2/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SinkTest {

    @Autowired
    private SinkProducer producer;

    @Test
    public void test() {
        producer.output().send(MessageBuilder.withPayload("produce a message ：").build());
    }

}
