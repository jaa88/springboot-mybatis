package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.service.UserService;

/**
 * Created by jianan on 2018/9/29.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getAllCount")
    public int getAllCount(){
        return userService.getAllCount();
    }

    @RequestMapping("/batchInsertUser")
    public String batchInsertUser(int count){
        return userService.batchInsertUser(count);
    }

}
