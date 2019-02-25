package com.zoy.springcloud.controller.trace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zouzp on 2019/2/22.
 */
@RestController
@RequestMapping("call")
public class TraceController {

    private static final Logger log = LoggerFactory.getLogger(TraceController.class);

    @GetMapping("trace-b")
    public String getTraceB() {
        log.info("==========trace b============");
        return "this is Trace B";
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
    @GetMapping("trace-b/detail")
    public String getTraceB(HttpServletRequest request) {
        log.info("========call trace b==========。" +
                        "X-B3-TraceId : {}, X-B3-SpanId : {}",
                request.getHeader("X-B3-TraceId"), request.getHeader("X-B3-SpanId"));

        return "this is Trace B detail";
    }
}
