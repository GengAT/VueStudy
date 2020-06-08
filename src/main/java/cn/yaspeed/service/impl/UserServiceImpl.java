package cn.yaspeed.service.impl;

import cn.yaspeed.dao.IUserDao;
import cn.yaspeed.domain.User;
import cn.yaspeed.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gms
 * @Version: 1.0
 * @date 2020/6/8 14:41
 */
@Service
//@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer userId) {
        return userDao.findById(userId);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
