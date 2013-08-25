package com.github.miemiedev.sht.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "ha")
    @ResponseBody
    public String ha() {
        return "hahaha";
    }
}
