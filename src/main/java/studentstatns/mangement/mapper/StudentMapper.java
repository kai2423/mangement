package studentstatns.mangement.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import studentstatns.mangement.entity.ClassInfo;
import studentstatns.mangement.entity.Student;
import studentstatns.mangement.entity.StudentDel_Change;
import studentstatns.mangement.entity.Student_change;

import java.util.List;


@Repository
public interface StudentMapper {

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    Student findStudnetbyid(String id);

    /**
     * 根据id查找用户并修改用户密码
     * @param id
     * @param oldPwd
     * @param newpa
     */
    void changepassword(@Param("id") String id, @Param("oldPwd") String oldPwd,@Param("newpa") String newpa);

    /**
     * 修改信息
     * @param id 身份证号
     * @param student
     */
    void changeInfoByid(@Param("id") String id, @Param("student") Student_change student);

    /**
     * 获取班级信息
     * @return
     */
    List<ClassInfo> getClassInfo();

    /**
     *
     * @return
     */
    List<Student> getStudentInfo();

    /**
     * 根据id删除学生表的信息
     * @param id
     */
    void deleteStudentsInfoByID(String id);

    /**
     * 根据id删除education表的信息
     * @param id
     */
    void deleteEducationInfoByID(String id);

    /**
     * 修改学生表的信息
     * @param student
     */
    void changeStudentInfo(StudentDel_Change student);

    /**
     * 修改education表的信息
     * @param student
     */
    void changeEducationInfo(StudentDel_Change student);
}
