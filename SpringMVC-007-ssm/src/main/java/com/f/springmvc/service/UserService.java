package com.f.springmvc.service;

import com.f.springmvc.pojo.User;

import java.util.List;

/**
 * @author fzy
 * @date 2024/2/20 20:18
 */
public interface UserService {
    List<User> selectUserPage(String userName, String userSex, int startRow);

    int createUser(User user);

    int deleteUserById(String userId);

    int getRowCount(String userName, String userSex);
}