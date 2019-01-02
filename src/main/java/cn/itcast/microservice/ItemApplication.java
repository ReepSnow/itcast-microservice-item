package cn.itcast.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangpengtao
 * @date 2018/12/30  21:40
 * @EMAIL wptxc@foxmail.com
 */
@EnableDiscoveryClient
@SpringBootApplication //申明这是一个Spring Boot项目
public class ItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemApplication.class, args);
    }

}

