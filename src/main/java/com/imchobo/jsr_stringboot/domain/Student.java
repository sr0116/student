package com.imchobo.jsr_stringboot.domain;

import com.imchobo.jsr_stringboot.JsrStringBootApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
  // 학생 예제
  private String student;

  private int kor;
  private int eng;
  private int mat;
  private int sci;
  private int soc;
  private int total;
  private int no;

  public int sumtotal() { // 총점
    return kor + mat + eng + sci + soc;
  }
  public int avgTotal() { // 총점
    return (kor + mat + eng + sci + soc) / 5;
  }
//  private String id;
//  private String pw;
//  private String name;


}
