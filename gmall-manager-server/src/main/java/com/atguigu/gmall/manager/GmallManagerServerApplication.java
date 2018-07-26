package com.atguigu.gmall.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.atguigu.gmall.manager.mapper")
@SpringBootApplication
public class GmallManagerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallManagerServerApplication.class, args);
	}
}
