package com.github.miemiedev.sht.web;

import com.github.miemiedev.sht.repo.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "ha")
    @ResponseBody
    public Object ha() {
        return userDao.findAll();
    }
}
