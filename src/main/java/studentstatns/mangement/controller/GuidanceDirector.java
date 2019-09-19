package studentstatns.mangement.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import studentstatns.mangement.entity.ClassInfo;
import studentstatns.mangement.entity.Student;
import studentstatns.mangement.entity.StudentDel_Change;
import studentstatns.mangement.service.AdminService;


import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController("/admin")
public class GuidanceDirector {

    @Autowired
    AdminService adminService;

    @GetMapping("/getclassInfo")
    public String getclassInfo (HttpServletRequest request) throws JsonProcessingException {
        Map<String ,Object> map = new HashMap<>();
        if (request.getSession().getAttribute("user") == null )
        {
            map.put("isOK",false);
        }else
        {
            map.put("isOK",true);
            List<ClassInfo> classInfoList= adminService.getclassInfo();
            map.put("classInfo",classInfoList);
        }

        return new ObjectMapper().writeValueAsString(map);
    }

    @GetMapping("/getStudentInfo")
    public String getStudentInfo (HttpServletRequest request) throws JsonProcessingException {
        Map<String ,Object> map = new HashMap<>();
        if (request.getSession().getAttribute("user") == null )
        {
            map.put("isOK",false);
        }else
        {
            map.put("isOK",true);
            List<Student> studentInfo= adminService.getStudentInfo();
            map.put("studentInfo",studentInfo);
        }

        return new ObjectMapper().writeValueAsString(map);
    }

    @GetMapping("/deleteInfo")
    public String deleteInfoByid(@RequestParam String  id, HttpServletRequest request) throws JsonProcessingException {
        Map<String ,Object> map = new HashMap<>();
        if (request.getSession().getAttribute("user") == null )
        {
            map.put("isOK",false);
        }else
        {
            map.put("isOK",true);
            boolean idDeleteOK= adminService.deleteInfoByID(id);
            map.put("idDeleteOK",idDeleteOK);
        }

        return new ObjectMapper().writeValueAsString(map);
    }

    @PostMapping("/changedelInfo")
    public String changeInfo(@RequestParam String info, @RequestParam String id) throws IOException {
        StudentDel_Change student = new ObjectMapper().readValue(info, StudentDel_Change.class);
        student.setId(id);

        Map<String ,Object> map = new HashMap<>();
        boolean isOK= adminService.changeInfo(student);
        map.put("isOK", isOK);
        return new ObjectMapper().writeValueAsString(map);
    }
}
