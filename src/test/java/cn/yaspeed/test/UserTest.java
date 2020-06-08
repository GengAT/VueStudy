package cn.yaspeed.test;

import cn.yaspeed.controller.UserController;
import cn.yaspeed.domain.User;
import cn.yaspeed.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author gms
 * @Version: 1.0
 * @date 2020/6/8 14:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {

    @Autowired
    private IUserService userService;



    @Test
    public void testFindAll() {
        List<User> all = userService.findAll();
        for (User u:all
             ) {
            System.out.println(u);
        }

    }


    @Test
    public void testFindById() {
        User byId = userService.findById(1);
        System.out.println(byId);

    }


    @Test
    public void testUpdateUser() {
        User byId = userService.findById(1);
        byId.setUsername("测试");
        userService.updateUser(byId);
        System.out.println(byId);
    }


}
