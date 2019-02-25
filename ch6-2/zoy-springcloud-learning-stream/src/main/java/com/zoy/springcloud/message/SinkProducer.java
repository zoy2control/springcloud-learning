package com.zoy.springcloud.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * Created by zouzp on 2019/2/22.
 */
public interface SinkProducer {

    @Output(Sink.INPUT)
    MessageChannel output();
}
