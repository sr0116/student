package com.imchobo.jsr_stringboot.mapper;

import com.imchobo.jsr_stringboot.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

  // 학생 조회
  List<Student> list();

  // 추가 (학생)
  void insert(Student student);

  // 학생 한 명 조회
  Student selectOne(int no);

  // 삭제(번호 기준으로 )
  int delete(int no);

  // 수정 기준으로
  void update(Student student);

  // 과목별 평균 (이름 뭐로할지 생각하기)
  Student scoreAvgSubject(); /// 받아와야될 값이 있는지 없는지 확인하고 해야 됨
  ///
  // 석차별 리스트
  List <Student> listscoreRank();
}
