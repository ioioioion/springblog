package com.xij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


/**
 * Created by xij on 16-11-17.
 */
@Controller
public class HomePageController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "admin/home/index";
    }
}
