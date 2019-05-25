package com.hua.service;

import com.hua.entity.User;

import java.util.List;

/**
 * TODO
 *
 * @author 周华山
 * @Date 2019/5/25 13:40
 * @since 1.0.0
 */
public interface UserService {

    void addUser(User user);

    List<User> getAll();
}
