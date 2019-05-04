package com.ethen.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 在启动类中添加对 mapper 包扫描@MapperScan
 * todo spring auto config 模块了解一下
 */
@MapperScan("com.ethen.core.mapper")
@SpringBootApplication
public class SpringbootStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudyApplication.class, args);
	}

}
