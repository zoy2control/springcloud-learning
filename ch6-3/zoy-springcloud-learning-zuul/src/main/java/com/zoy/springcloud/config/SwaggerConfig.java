package com.zoy.springcloud.config;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zouzp on 2019/2/21.
 */
@Component
@Primary
public class SwaggerConfig implements SwaggerResourcesProvider{

    @Override
    public List<SwaggerResource> get() {
        List swaggerList = new ArrayList();
        // ·通过 SwaggerResource添加多个文档来源
        swaggerList.add(assembleSwaggerResource("service-a", "/swagger-service-a/v2/api-docs", "2.0"));
        swaggerList.add(assembleSwaggerResource("service-b", "/swagger-service-b/v2/api-docs", "2.0"));
        /*网关上Swagger会通过访问/swagger-service-a/v2/api-docs和swagger-service-b/v2/api-docs来加载两个文档内容，同时由于当前应用是Zuul构建的API网关，
        这两个请求会被转发到swagger-service-a和swagger-service-b服务上的/v2/api-docs接口获得到Swagger的JSON文档，从而实现汇总加载内容。*/
        return swaggerList;
    }

    /**
     * ·封装SwaggerResource
     * @param name
     * @param location
     * @param version
     * @return
     */
    private SwaggerResource assembleSwaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
