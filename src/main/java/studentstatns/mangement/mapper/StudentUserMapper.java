package studentstatns.mangement.mapper;


import org.springframework.stereotype.Repository;
import studentstatns.mangement.entity.StudentUser;

@Repository
public interface StudentUserMapper {

    StudentUser getStudentUserByIDAndpassword(String id , String password);
}
