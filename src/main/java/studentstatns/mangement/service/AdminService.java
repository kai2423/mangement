package studentstatns.mangement.service;

import studentstatns.mangement.entity.ClassInfo;
import studentstatns.mangement.entity.Student;
import studentstatns.mangement.entity.StudentDel_Change;

import java.util.List;

/**
 * 处理教务主任请求
 */
public interface AdminService {

    /**
     * 获取班级信息
     * @return
     */
    List<ClassInfo> getclassInfo();

    /**
     * 获取学生信息
     * @return
     */
    List<Student> getStudentInfo();

    /**
     * 根据学生id删除students表和education表的信息
     * @param id
     * @return
     */
    boolean deleteInfoByID(String id);

    /**
     * 修改信息
     * @param student
     * @return
     */
    boolean changeInfo(StudentDel_Change student);
}
