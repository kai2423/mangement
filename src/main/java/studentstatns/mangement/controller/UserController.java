package studentstatns.mangement.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import studentstatns.mangement.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/loginServlet")
    public String  login (@RequestParam String ID, @RequestParam String password, HttpServletRequest request) throws JsonProcessingException {
        Map<String,Object> data = (Map<String, Object>) userService.login(ID,password);
        if ((boolean)data.get("isLogin"))
        {
            request.getSession().setAttribute("user",data.get("user"));
        }
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(data);
    }


}
