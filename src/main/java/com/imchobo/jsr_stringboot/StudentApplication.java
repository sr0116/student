package com.imchobo.jsr_stringboot;

import com.imchobo.jsr_stringboot.ui.StudentUI;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan({"com.imchobo.student.mapper"})
public class StudentApplication {
  public static void main(String[] args) {
    org.springframework.context.ApplicationContext ctx = SpringApplication.run(StudentApplication.class, args);
    StudentUI ui = (StudentUI)ctx.getBean(StudentUI.class);
    System.out.println(ui);
    ui.run();
  }
}
