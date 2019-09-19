package studentstatns.mangement.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentstatns.mangement.entity.Student_change;
import studentstatns.mangement.mapper.ManagerMapper;
import studentstatns.mangement.mapper.StudentMapper;
import studentstatns.mangement.service.TeacherService;

import java.util.HashMap;
import java.util.Map;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    ManagerMapper managerMapper;

    @Autowired
    StudentMapper studentMapper;

    @Override
    public String getList(String id) throws JsonProcessingException {

        return new ObjectMapper().writeValueAsString( managerMapper.getStudentListByTeacherID(id));
    }

    @Override
    public String changeInfo(Student_change student, String id) throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        try{
            studentMapper.changeInfoByid(id,student);
            map.put("isOK",true);
            return  new ObjectMapper().writeValueAsString(map);
        }catch (Exception e)
        {
            e.printStackTrace();
            map.put("isOK",false);
            return  new ObjectMapper().writeValueAsString(map);
        }
    }
}
