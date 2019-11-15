package com.xkcoding.properties.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/***
* @Description: 描述文件
* @Param:
* @return:
* @Author: SeekerGAO
* @Date: 2019/11/15
*/
@Data
@ConfigurationProperties(prefix = "description")
@Component
public class DescriptionProperty {
  // 使用@Value注解时，字段名必须与配置文件一致
//  @Value("${description.name}")
  String name;
//  @Value("${description.intro}")
  String intro;
//  @Value("${description.test-diff}")
  String testDiff;
}
