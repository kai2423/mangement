package studentstatns.mangement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentstatns.mangement.entity.ClassInfo;
import studentstatns.mangement.entity.Student;
import studentstatns.mangement.entity.StudentDel_Change;
import studentstatns.mangement.mapper.StudentMapper;
import studentstatns.mangement.service.AdminService;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<ClassInfo> getclassInfo() {

        return studentMapper.getClassInfo();
    }

    @Override
    public List<Student> getStudentInfo() {

        return studentMapper.getStudentInfo();
    }

    @Override
    public boolean deleteInfoByID(String id) {

        try{
            studentMapper.deleteStudentsInfoByID(id);
            studentMapper.deleteEducationInfoByID(id);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean changeInfo(StudentDel_Change student) {
        try{
            studentMapper.changeStudentInfo(student);
            studentMapper.changeEducationInfo(student);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
