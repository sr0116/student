package com.imchobo.jsr_stringboot.service;


import com.imchobo.jsr_stringboot.domain.Student;
import com.imchobo.jsr_stringboot.mapper.StudentMapper;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class StudentService {
    // 평점 계산, 등록 , 조회, 수정, 삭제
    private final StudentMapper studentMapper;

    public List<Student> list() {
        return studentMapper.list();
    }

    public void register(Student student) {
//  int avg = student.avgTotal();  // 평균 구함 -> 이걸 굳이 DB에 넣을 필요가 없음
//  student.setTotal(avg);
        studentMapper.insert(student);
    }

    public int remove(int no) {
        return studentMapper.delete(no);
    }

    public void modify(Student student) {
        studentMapper.update(student);
    }

    public Student get(int no) {
        return studentMapper.selectOne(no);
    }

    public Student avgSubject() {
        return studentMapper.scoreAvgSubject();
    }

    public  List<Student> scoreRank() {
        return studentMapper.listscoreRank();
    }

}