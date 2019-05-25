package com.hua.service.impl;

import com.hua.dao.UserDao;
import com.hua.entity.User;
import com.hua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author 周华山
 * @Date 2019/5/25 17:03
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    public List<User> getAll() {
        return userDao.getAll();
    }
}
