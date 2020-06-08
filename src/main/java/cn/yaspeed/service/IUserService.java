package cn.yaspeed.service;

import cn.yaspeed.domain.User;

import java.util.List;

public interface IUserService {
    /**
     * 查找所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 根据用户ID查找用户
     * @param userId 要查找的用户ID
     * @return
     */
    User findById(Integer userId);

    /**
     * 修改用户信息
     *
     * @param user 要修改的用户
     */
    void updateUser(User user);
}
