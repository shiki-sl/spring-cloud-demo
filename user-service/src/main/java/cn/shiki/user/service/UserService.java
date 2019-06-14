package cn.shiki.user.service;

import cn.shiki.user.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Author: shiki
 * @Date: 2019/06/01 6:50
 */
@Service
public interface UserService {
    /**
     * 根据id查询user实体类
     * @param id
     * @return
     */
    User findOneByID(Integer id);
}
