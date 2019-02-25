package com.zoy.springcloud.util;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * ·过滤器
 * Created by zouzp on 2019/2/21.
 */
public class AccessFilter extends ZuulFilter {
    private static final Logger log = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }
    @Override
    public int filterOrder() {
        return 0;
    }
    @Override
    public boolean shouldFilter() {
        return true;
    }
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info("send {} request to : {}", request.getMethod(), request.getRequestURL().toString());

        String token = request.getParameter("accessToken");
//        if (null == token) {
//            log.warn("accessToken is empty");
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            return null;
//        }
        log.info("accessToken ok");
        return null;
    }
}
