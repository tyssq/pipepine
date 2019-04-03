package com.example.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 蜻蜓
 * @date 2019-04-01 13:55
 */
@RestController
public class DemoController {

    @GetMapping("demo")
    public Object demo(){
        return "廖正瀚哈哈哈测试";
    }
}
