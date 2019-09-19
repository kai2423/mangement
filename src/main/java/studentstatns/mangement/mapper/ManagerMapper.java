package studentstatns.mangement.mapper;

import org.springframework.stereotype.Repository;
import studentstatns.mangement.entity.Management;
import studentstatns.mangement.entity.Student;
import studentstatns.mangement.entity.Student_change;

import java.util.List;

@Repository
public interface ManagerMapper {

    Management getManagementByid(String id);

    List<Student> getStudentListByTeacherID(String id);

}
