package com.xij.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xi_j-pc on 2016/11/17.
 */
public class HomePageController {
    @RequestMapping(value = "", method = GET)
    public String index(@RequestParam(defaultValue = "1") int page, Model model){
        return "home/index";
    }
}
