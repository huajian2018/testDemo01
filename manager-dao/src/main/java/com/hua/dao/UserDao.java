package com.hua.dao;

import com.hua.entity.User;

import java.util.List;

/**
 * TODO
 *
 * @author 周华山
 * @Date 2019/5/25 13:28
 * @since 1.0.0
 */
public interface UserDao {

    void addUser(User user);

    List<User>  getAll();


}
