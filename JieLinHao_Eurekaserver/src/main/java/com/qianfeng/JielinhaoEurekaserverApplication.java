package com.qianfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //标记这是一个注册中心服务器
public class JielinhaoEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(JielinhaoEurekaserverApplication.class, args);
	}

}
