package Core;

import DTO.Test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test2 {

    public static void main(String[] args) {
        SpringApplication.run(Test2.class, args);
    }

    @RequestMapping("/")
    public String welcome() {
        sayHello();
        Test1.sayHello();
        return "From Tejaswi";
    }

    public static String sayHello() {
        return "MyTest2 says hello!";
    }

}
