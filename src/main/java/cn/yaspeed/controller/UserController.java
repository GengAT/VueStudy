package cn.yaspeed.controller;

import cn.yaspeed.domain.User;
import cn.yaspeed.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author gms
 * @Version: 1.0
 * @date 2020/6/8 14:29
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll.do")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/findById.do")
    public User findById(Integer userid){
        return userService.findById(userid);
    }

    @RequestMapping("/updateUser.do")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }
}
