package com.f.springmvc.mapper;

import com.f.springmvc.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author fzy
 * @date 2024/2/20 17:00
 */
public interface UserMapper {
    /**
     * 查询用户
     */
    List<User> selectUserPage(
            @Param("userName")
            String userName,
            @Param("userSex")
            String userSex,
            @Param("startRow")
            int startRow
    );

    /**
     * 新增用户
     */
    int createUser(User user);

    /**
     * 删除用户
     */
    int deleteUserById(String userId);

    /**
     * 获取总行数
     */
    int getRowCount(
            @Param("userName")
            String userName,
            @Param("userSex")
            String userSex
    );
}
