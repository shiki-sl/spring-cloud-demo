package cn.shiki.user.client;

import cn.shiki.user.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @Author: shiki
 * @Date: 2019/06/02 11:25
 */
@Component
public class UserClientFallback implements UserClient {
    /**
     * 向远程服务器根据id请求查询到的user对象
     *
     * @param id
     * @return
     */
    @Override
    public User queryById(Integer id) {
        User user = new User();
        user.setName("查询失败");
        return user;
    }
}
