package com.f.springmvc.test;

import com.f.springmvc.pojo.User;
import com.f.springmvc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author fzy
 * @date 2024/2/20 20:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void testSelectUserPage() {
        List<User> users = userService.selectUserPage("十", "女", 0);
        users.forEach(user -> {
            System.out.println(user);
        });
    }

    @Test
    public void testDeleteUserById() {
        int count = userService.deleteUserById("15968954638794962");
        System.out.println("影响记录的条数：" + count);
    }

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setUserId("15968954638794962");
        user.setCardType("身份证");
        user.setCardNo("110654196604079098");
        user.setUserName("孔十四");
        user.setUserSex("女");
        user.setUserAge("29");
        user.setUserRole("生产、运输设备操作人员及有关人员");
        int count = userService.createUser(user);
        System.out.println("影响记录的条数：" + count);
    }

    @Test
    public void testGetRowCount() {
        int rowCount = userService.getRowCount(null, null);
        System.out.println("符合条件的总记录条数为：" + rowCount);
    }
}
