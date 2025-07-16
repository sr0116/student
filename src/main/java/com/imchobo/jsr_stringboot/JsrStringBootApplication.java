package com.imchobo.jsr_stringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.imchobo.jsr_stringboot.mapper")
public class JsrStringBootApplication {

  public static void main(String[] args) {
    SpringApplication.run(JsrStringBootApplication.class, args);
  }



}
