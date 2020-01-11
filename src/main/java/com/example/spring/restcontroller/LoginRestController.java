package com.example.spring.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginRestController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String login() {
        return "login.html";
    }

}
