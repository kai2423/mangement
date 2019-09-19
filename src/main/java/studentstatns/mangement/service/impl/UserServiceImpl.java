package studentstatns.mangement.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentstatns.mangement.entity.ManagementUser;
import studentstatns.mangement.entity.StudentUser;
import studentstatns.mangement.mapper.ManagerMapper;
import studentstatns.mangement.mapper.ManagerUserMapper;
import studentstatns.mangement.mapper.StudentUserMapper;
import studentstatns.mangement.service.UserService;

import java.util.HashMap;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    StudentUserMapper studentUserMapper;

    @Autowired
    ManagerUserMapper managerUserMapper;

    @Autowired
    ManagerMapper managerMapper;

    @Override
    public Object login(String id, String password) {

        Map<String, Object> map = new HashMap<>();
        StudentUser studentUser = studentUserMapper.getStudentUserByIDAndpassword(id, password);
        ManagementUser managementUser = managerUserMapper.getManagementUserByIDAndPassword(id, password);
        if ( managementUser!= null)
        {
            String post = managerMapper.getManagementByid(id).getPost();
            map.put("isLogin", true);
            map.put("identity", post);
            map.put("user",managementUser.getId());
        }
        else if(studentUser != null)
        {

            map.put("isLogin", true);
            map.put("identity", "student");
            map.put("user",studentUser.getId());
        }else
        {
            map.put("isLogin", false);
        }

        return map;
    }
}
