package studentstatns.mangement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("studentstatns.mangement.mapper")
public class MangementApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangementApplication.class, args);
    }

}
