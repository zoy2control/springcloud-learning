package com.zoy.springcloud.controller.trace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zouzp on 2019/2/22.
 */
@RestController
@RequestMapping("call")
public class TraceController {

    private static final Logger log = LoggerFactory.getLogger(TraceController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("trace-a")
    public String getTraceA() {
        log.info("==========trace a============");
        // ·调用 trace-b服务
        String s = restTemplate.getForEntity("http://trace-b/call/trace-b", String.class).getBody();
        log.info("trace-a restTemplate result : " + s);
        return s;
    }

    /**
     * ·获取 链路跟踪详细信息，关键字段如下
     X-B3-TraceId：一条请求链路（Trace）的唯一标识，必须值
     X-B3-SpanId：一个工作单元（Span）的唯一标识，必须值
     X-B3-ParentSpanId:：标识当前工作单元所属的上一个工作单元，Root Span（请求链路的第一个工作单元）的该值为空
     X-B3-Sampled：是否被抽样输出的标志，1表示需要被输出，0表示不需要被输出
     X-Span-Name：工作单元的名称
     * @return
     */
    @GetMapping("trace-a/detail")
    public String getTraceBDetail() {
        log.info("==========trace a detail============");
        String s = restTemplate.getForEntity("http://trace-b/call/trace-b/detail", String.class).getBody();
        log.info("trace-a restTemplate result : " + s);
        return s;
    }
}
