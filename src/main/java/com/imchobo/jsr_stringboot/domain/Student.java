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

  public int Sumtotal() {
    return kor + mat + eng + sci + soc;
  }
    private int no;
//  private String id;
//  private String pw;
//  private String name;


}
