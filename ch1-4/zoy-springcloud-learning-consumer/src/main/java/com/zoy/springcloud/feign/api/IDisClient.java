package com.zoy.springcloud.feign.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zouzp on 2019/2/18.
 */

/*创建一个Feign的客户端接口定义。使用@FeignClient注解来指定这个接口所要调用的服务名称，
接口中定义的各个函数使用Spring MVC的注解就可以来绑定服务提供方的REST接口，比如下面就是绑定consul-client服务的/dc接口的例子*/
@FeignClient("consul-client") // ·采用SpringMVC的形式，用 服务名作为 搜索条件
public interface IDisClient {
    @GetMapping("/dc")
    public String feignConsumer();
}
