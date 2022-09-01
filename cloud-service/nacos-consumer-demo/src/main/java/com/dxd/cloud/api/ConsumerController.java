package com.dxd.cloud.api;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Resource
    private RestTemplate restTemplate;

    private final String SERVICE_URL = "http://cloud-goods-service";

    @GetMapping("/consumerTest")
    public String consumerTest() {
        System.out.println(restTemplate.getForObject(SERVICE_URL + "/goodsServiceTest",String.class));
        //返回信息给调用器
        return  restTemplate.getForObject(SERVICE_URL + "/goodsServiceTest",String.class);
    }
}
