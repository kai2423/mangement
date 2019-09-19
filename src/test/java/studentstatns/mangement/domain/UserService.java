package studentstatns.mangement.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserService {

    @Resource
    studentstatns.mangement.service.UserService userService;

    @Test
    public void testLogin() throws JsonProcessingException {
        String result = (String) userService.login("360730199704232211","123456");
        System.out.println(result);
    }

    @Test
    public void testFunction() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(new HashMap<>()).length());
    }
}
