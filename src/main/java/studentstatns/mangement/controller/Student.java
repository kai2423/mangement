package studentstatns.mangement.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import studentstatns.mangement.mapper.StudentMapper;
import studentstatns.mangement.service.StudentService;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Student {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    StudentService studentService;


    @GetMapping("/getStudentDel")
    public String getStudentDel(HttpServletRequest request) throws JsonProcessingException {
        String id  = (String) request.getSession().getAttribute("user");


        return studentService.getStudentByid(id);
    }

    @PostMapping("/changePassword")
    public String changePassword(@RequestParam String oldPwd, @RequestParam String newpa, HttpServletRequest request) throws JsonProcessingException {
        String id = (String) request.getSession().getAttribute("user");

        return studentService.changePassword(id,oldPwd,newpa);
    }
}
