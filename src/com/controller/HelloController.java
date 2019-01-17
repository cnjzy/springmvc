package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jzy
 * created at 2019/1/17
 * desc
 */
@Controller
@RequestMapping("/controller")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "hello";
    }
}
