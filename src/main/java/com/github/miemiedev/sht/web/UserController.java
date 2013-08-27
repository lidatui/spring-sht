package com.github.miemiedev.sht.web;

import com.github.miemiedev.sht.entity.QUser;
import com.github.miemiedev.sht.entity.User;
import com.github.miemiedev.sht.repo.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user")
    @ResponseBody
    public Object user() {
        //return userDao.findAll(QUser.user.name.like("%王%"), new PageRequest(0, 20));
        return userDao.findLikeName("%王%",new PageRequest(0, 20));
        //return userDao.findNativeLikeName("%王%",new PageRequest(0, 20));
    }
}
