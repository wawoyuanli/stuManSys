package com.hyl.service.impl;

import com.hyl.dao.TeacherDao;
import com.hyl.pojo.Teacher;
import com.hyl.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public int insertTeacher(Teacher teacher) {
        return teacherDao.insertTeacher(teacher);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public int deleteTeacher(int teacherId) {
        return teacherDao.deleteTeacher(teacherId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public int updateTeacher(Teacher teacher) {
        return teacherDao.updateTeacher(teacher);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public List<Teacher> searchFromTeacher(String s) {
        return teacherDao.searchFromTeacher(s);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public Teacher selectTeacherById(int teacherId) {
        return teacherDao.selectTeacherById(teacherId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public List<Teacher> selectAllTeachers() {
        return teacherDao.selectAllTeachers();
    }
}
