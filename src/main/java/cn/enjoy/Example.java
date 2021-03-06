package cn.enjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
    @RequestMapping("/")
    String home(){
        System.out.println("你好，我要合并");
        return "Hello Git V1.0";
    }
    @RequestMapping("/add")
    String add(){
        System.out.println("远程修改了内容");
        System.out.println("我也插入一条数据");
        return "i am add";
    }
}
