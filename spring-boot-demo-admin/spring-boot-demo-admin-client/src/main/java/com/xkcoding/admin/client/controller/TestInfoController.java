package com.xkcoding.admin.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
* @Description: 测试信息
* @Param:
* @return:
* @Author: SeekerGAO
* @Date: 2019/11/18
*/
@RestController
@RequestMapping("/test")
public class TestInfoController {
  @GetMapping("/info")
  public String getInfo(){
    return "返回测试信息";
  }

}
