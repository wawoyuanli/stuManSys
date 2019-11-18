package com.hyl.service.impl;

import com.hyl.dao.StudentDao;
import com.hyl.pojo.Student;
import com.hyl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public int insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public int deleteStudent(int studentId) {
        return studentDao.deleteStudent(studentId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public List<Student> searchFromStudent(String s) {
        return studentDao.searchFromStudent(s);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public Student selectStudentById(int studentId) {
        return studentDao.selectStudentById(studentId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public List<Student> selectAllStudents() {
        return studentDao.selectAllStudents();
    }

}
