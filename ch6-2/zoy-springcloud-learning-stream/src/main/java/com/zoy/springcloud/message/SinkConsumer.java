package com.zoy.springcloud.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Created by zouzp on 2019/2/22.
 */
@EnableBinding(value = {Sink.class, SinkProducer.class})
public class SinkConsumer {

    private static final Logger log = LoggerFactory.getLogger(SinkConsumer.class);

    @StreamListener(Sink.INPUT)
    public void streamListener(Object obj) {
        log.info("Consumer : " + obj);
    }
}
