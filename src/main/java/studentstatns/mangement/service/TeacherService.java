package studentstatns.mangement.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Repository;
import studentstatns.mangement.entity.Student_change;

/**
 * 处理老师请求
 */
@Repository("teacherService")
public interface TeacherService {
    /**
     * 获取该老师所在班级的全部学生信息
     * @param user
     * @return
     */
    String getList(String id) throws JsonProcessingException;


    /**
     * 修改信息
     * @param student
     * @return
     */
    String changeInfo(Student_change student, String id) throws JsonProcessingException;
}
