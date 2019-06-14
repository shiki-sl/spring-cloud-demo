package cn.shiki.user.service.impl;

import cn.shiki.user.mapper.UserMapper;
import cn.shiki.user.pojo.User;
import cn.shiki.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: shiki
 * @Date: 2019/06/01 6:50
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
        logger.info("userMapper",userMapper);
    }

    @Override
    public User findOneByID(Integer uid){
        return userMapper.selectByPrimaryKey(uid);
    }
}
