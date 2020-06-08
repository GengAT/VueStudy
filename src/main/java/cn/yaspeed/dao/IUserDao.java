package cn.yaspeed.dao;


import cn.yaspeed.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUserDao {
    /**
     * 查找所有用户
     *
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 根据用户ID查找用户
     *
     * @param userId 要查找的用户ID
     * @return
     */
    @Select("select * from user where id =#{userId}")
    User findById(Integer userId);

    /**
     * 修改用户信息
     *
     * @param user 要修改的用户
     */
    @Update("update user set username=#{username},password=#{password},sex=#{sex},age=#{age},email=#{email} where id =#{id} ")
    void updateUser(User user);
}
