package com.imchobo.jsr_stringboot.mapper;

import com.imchobo.jsr_stringboot.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentMapperTest {

  @Autowired
  StudentMapper mapper;

  @Test
  public void testExist() {
    System.out.println(mapper);
  }

  // 학생 조회
  @Test
  public void testListStudent() {
    List<Student> student = mapper.list();
//    log.info("{}", student);
  }

  // 학생 과목 추가
  @Test
  public void testInsertStudent() {
//    Student student = new Student().builder()
//            .student("학생")
//            .kor(50)
//            .mat(20)
//            .eng(80)
//            .sci(50)
//            .soc(90)
//            .build();
//// 먼저 total 더해주기
//
//    mapper.insert(student);
//    log.info("{}", student);
    Student insertStudent = Student.builder()
            .kor(50)
            .mat(20)
            .eng(80)
            .sci(50)
            .soc(90)
            .build();
// 먼저 total 더해주기

    mapper.insert(insertStudent);
  }

  // 학생 삭제
  @Test
  public void testDeleteStudent() {
    int no = 6;
    mapper.delete(no);

    List<Student> student = mapper.list();
//    log.info("{}", student);
  }

  // 학생 점수 수정
  @Test
  public void testUpdateStudent() {
    int no = 12;
    Student student = Student.builder()
            .no(no)
            .student("업데이트학생")
            .kor(50)
            .mat(50)
            .eng(30)
            .sci(90)
            .soc(90)
            .build();


    mapper.update(Student.builder()
            .no(no)
            .student("업데이트학생")
            .kor(50)
            .mat(50)
            .eng(30)
            .sci(90)
            .soc(90)
            .build());
//    log.info("{}", student);
  }

  // 과목별 평균
  @Test
  public void testAvgScore() {
    // 학과 번호는 안 나오게 하고

    System.out.println( mapper.scoreAvgSubject());
    // 또다른 기능을 출력하거나 더 보완해야 됨


  }

  // 과목별 평균
  @Test
  public void testScoreRank() {


    System.out.println( mapper.listscoreRank());



  }

}



