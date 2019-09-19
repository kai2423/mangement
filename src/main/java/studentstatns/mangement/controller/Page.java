package studentstatns.mangement.controller;





import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
@Controller
public class Page{

    @GetMapping("/")
    public String login()
    {
        return "login";
    }



    @GetMapping("/student")
    public String student(HttpServletRequest request){
        return "studentdel";
    }





}
