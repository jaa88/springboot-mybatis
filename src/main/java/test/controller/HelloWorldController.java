package test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jianan on 2018/9/29.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/helloWorld")
    public String sayHelloWorld(){
        return "hello world";
    }
}
