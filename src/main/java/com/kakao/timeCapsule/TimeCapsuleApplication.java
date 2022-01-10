package com.kakao.timeCapsule;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.kakao.timeCapsule.mapper"})
@SpringBootApplication
public class TimeCapsuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeCapsuleApplication.class, args);
	}

}
