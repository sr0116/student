package com.imchobo.jsr_stringboot.mapper;

import com.imchobo.jsr_stringboot.domain.Student;

import java.util.List;

public interface StudentMapper {

  // 학생 조회
  List<Student> list();

  // 추가 (학생)
  void insert(Student student);

  // 학생 한 명 조회
  void selectOne(int no);
  
// 삭제(번호 기준으로 )
  void delete(int no);

  // 수정호 기준으로 )
  void update(Student student);

}
