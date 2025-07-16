package com.imchobo.jsr_stringboot.mapper;

import com.imchobo.jsr_stringboot.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
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
  public void testlistStudent() {
    List<Student> student = mapper.list();
    log.info("{}", student);
  }

  // 학생 과목 추가
  @Test
  public void testinsertStudent() {
    Student student = new Student().builder()
            .student("학생")
            .kor(50)
            .mat(20)
            .eng(80)
            .sci(50)
            .soc(90)
            .build();
// 먼저 total 더해주기
    student.setTotal(student.sumtotal());

    mapper.insert(student);
    log.info("{}", student);
  }

  // 학생 삭제
  @Test
  public void testDeleteStudent() {
//    int no = 9;
//    mapper.delete(no);
//
//    List<Student> student = mapper.list();
//    log.info("{}", student);
  }


  // 학생 점수 수정
  @Test
  public void testUpdateStudent() {
    int no = 12;
    Student student = new Student().builder()
            .no(no)
            .student("업데이트학생")
            .kor(50)
            .mat(20)
            .eng(80)
            .sci(50)
            .soc(90)
            .build();
    student.setTotal(student.sumtotal());
    mapper.update(student);



    log.info("{}", student);
  }
}



