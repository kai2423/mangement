package studentstatns.mangement;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import studentstatns.mangement.entity.Student;
import studentstatns.mangement.mapper.StudentMapper;


import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MangementApplicationTests {


    @Resource
    StudentMapper studentMapper;

    @Test
    public void testStudentMapper() throws JsonProcessingException {
        Student student = (Student) studentMapper.findStudnetbyid("360730199704261155");
        System.out.println(student);
        System.out.println(student.getEducation());
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println(new ObjectMapper().writeValueAsString(student));
    }

    @Test
    public void testStudentMapper_getallDel() throws JsonProcessingException {
        List<Student> students = studentMapper.getStudentInfo();
        System.out.println("数量"+students.size());
        System.out.println(new ObjectMapper().writeValueAsString(students));
    }


}
