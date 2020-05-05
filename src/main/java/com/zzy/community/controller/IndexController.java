package com.zzy.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zouzhiyin
 * @create 2020-05-05-16:42
 **/

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
