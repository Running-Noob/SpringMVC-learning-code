package com.f.springmvc.service.impl;

import com.f.springmvc.mapper.UserMapper;
import com.f.springmvc.pojo.User;
import com.f.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author fzy
 * @date 2024/2/20 20:21
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserPage(String userName, String userSex, int startRow) {
        return userMapper.selectUserPage(userName, userSex, startRow);
    }

    @Override
    @Transactional
    public int createUser(User user) {
        return userMapper.createUser(user);
    }

    @Override
    @Transactional
    public int deleteUserById(String userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int getRowCount(String userName, String userSex) {
        return userMapper.getRowCount(userName, userSex);
    }
}
