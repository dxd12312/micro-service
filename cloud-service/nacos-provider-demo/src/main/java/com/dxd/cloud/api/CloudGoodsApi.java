package com.dxd.cloud.api;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudGoodsApi {
    @Value("${server.port}")
    private String applicationServerPort;

    @GetMapping("/goodsServiceTest")
    public String goodsServiceTest() {
        System.out.println("this is goods service from port:" + applicationServerPort);
        //返回信息给调用器
        return  "this is goods service from port:" + applicationServerPort;
    }
}
