package studentstatns.mangement.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import studentstatns.mangement.mapper.StudentMapper;
import studentstatns.mangement.service.StudentService;

import java.util.HashMap;
import java.util.Map;

@Repository("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public String getStudentByid(String id) throws JsonProcessingException {

        return new ObjectMapper().writeValueAsString(studentMapper.findStudnetbyid(id));
    }

    @Override
    public String changePassword(String id, String oldPwd, String newpa) throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        try{
            studentMapper.changepassword(id,oldPwd,newpa);
            map.put("isOk",true);
            return  new ObjectMapper().writeValueAsString(map);
        }catch (Exception e)
        {
            e.printStackTrace();
            map.put("isOk",false);
            return  new ObjectMapper().writeValueAsString(map);
        }
    }
}
