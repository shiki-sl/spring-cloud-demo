package cn.shiki.user.controller;

import cn.shiki.user.client.UserClient;
import cn.shiki.user.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
//使用全局的响应处理
@DefaultProperties(defaultFallback = "defaultFallback")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserClient userClient;

    @GetMapping("/queryById/{id}")
    public User queryById(@PathVariable Integer id) {
        return userClient.queryById(id);
    }

//    @Autowired
//    private  RestTemplate restTemplate;
//
//    @Autowired
//    private  LoadBalancerClient client;
//

//    @GetMapping("/findOneById/{id}")
////    @HystrixCommand(fallbackMethod = "findOneByIDFallback")
////    @HystrixCommand(commandProperties = {
////            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
////    })
//    @HystrixCommand
//    public String findOneByID(@PathVariable Integer id) {
//        String url = "http://user-service/user/findOneById/" + id;
//        return restTemplate.getForObject(url, String.class);
//    }
//



}
