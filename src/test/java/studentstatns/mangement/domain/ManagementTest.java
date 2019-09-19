package studentstatns.mangement.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import studentstatns.mangement.entity.StudentUser;
import studentstatns.mangement.mapper.StudentUserMapper;

import javax.annotation.Resource;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagementTest
{
    @Resource
    StudentUserMapper studentUserMapper;

    @Test
    public void  testStudentmapper()
    {
        StudentUser studentUser = studentUserMapper.getStudentUserByIDAndpassword("360730199704261122","k123456");
        System.out.println(studentUser.toString());
    }
}