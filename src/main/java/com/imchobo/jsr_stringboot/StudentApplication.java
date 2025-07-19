package com.imchobo.jsr_stringboot;

import com.imchobo.jsr_stringboot.ui.StudentUI;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.imchobo.jsr_stringboot.mapper")
public class StudentApplication {
  public static void main(String[] args) {
    org.springframework.context.ApplicationContext ctx = SpringApplication.run(StudentApplication.class, args);
    StudentUI ui = (StudentUI) ctx.getBean(StudentUI.class);
    System.out.println(ui);
    ui.run();
  }
}
