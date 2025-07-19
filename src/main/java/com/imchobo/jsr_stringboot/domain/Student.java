package com.imchobo.jsr_stringboot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.springframework.boot.SpringApplication;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Alias("student")
public class Student {
  // 학생 예제
  private int no;
  private String student; // 이름으로 정의

  private int kor;
  private int eng;
  private int mat;
  private int sci;
  private int soc;

  public Student(int kor, int eng, int mat, int soc, int sci) {
    // 값을 직접 정의 본문에 들어갈 내용'

    this.kor = kor;
    this.eng = eng;
    this.mat = mat;
    this.soc = soc;
    this.sci = sci;
  }

  // 총합
  public int sumtotal() { // 총점
    return kor + mat + eng + sci + soc;
  }

  // 평점
  public double avgTotal() { // 총점
    return (kor + mat + eng + sci + soc) / 5;

  }

  // tostring 정의
  public String toString() {
    return String.format(
            "학과번호: %d, 국어: %d, 수학: %d, 영어: %d, 과학: %d, 사회: %d, 총합: %d, 평균: %.2f",
            no, kor, mat, eng, sci, soc, sumtotal(), avgTotal()
    );
  }
  // tostring 정의
  public String toString2() {
    return String.format(
            " 국어: %d, 수학: %d, 영어: %d, 과학: %d, 사회: %d",
            kor, mat, eng, sci, soc
    );
  }

}
