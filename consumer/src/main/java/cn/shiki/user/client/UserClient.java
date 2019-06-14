package cn.shiki.user.client;

import cn.shiki.user.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: shiki
 * @Date: 2019/06/02 11:24
 */
@FeignClient(value = "user-service",fallback = UserClientFallback.class)
public interface UserClient {

    /**
     * 向远程服务器根据id请求查询到的user对象
     * @param id
     * @return
     */
    @GetMapping("user/queryById/{id}")
    User queryById(@PathVariable Integer id);
}
