package com.hua.test;

import com.hua.dao.UserDao;
import com.hua.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO
 *
 * @author 周华山
 * @Date 2019/5/25 15:43
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class ManagerTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testAdd(){
        User user=new User();
        user.setAge(18);
        user.setName("华剑2号");
        userDao.addUser(user);
    }


}
