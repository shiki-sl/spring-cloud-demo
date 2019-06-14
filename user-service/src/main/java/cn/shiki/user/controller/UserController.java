package cn.shiki.user.controller;

import cn.shiki.user.pojo.User;
import cn.shiki.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shiki
 * @Date: 2019/06/01 6:50
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
        log.info("userService:注入成功", userService);
    }

    @GetMapping("/queryById/{id}")
    public User findOneByID(@PathVariable Integer id) {
        User oneByID = null;
        try {
            oneByID = userService.findOneByID(id);
        } catch (Exception e) {
            e.printStackTrace();
            log.warn(e.getMessage());
        }
        return oneByID;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
