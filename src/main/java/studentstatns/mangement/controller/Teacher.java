package studentstatns.mangement.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import studentstatns.mangement.entity.Student_change;
import studentstatns.mangement.service.TeacherService;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class Teacher {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/getList")
    public String GetList(HttpServletRequest request) throws JsonProcessingException {
        return teacherService.getList((String) request.getSession().getAttribute("user"));
    }

    @PostMapping("/changeInfo")
    public String changeInfo(@RequestParam String changeInfo, @RequestParam String id) throws IOException {
        Student_change student = new ObjectMapper().readValue(changeInfo,Student_change.class);

        return teacherService.changeInfo(student, id);
    }
}
