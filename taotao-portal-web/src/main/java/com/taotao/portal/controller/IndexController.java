package com.taotao.portal.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wpz
 * @Desctription:
 * @Date: Created in 2018/8/4 13:56
 */
public class IndexController {
    @RequestMapping("/index")
    public String showIndex(){
        return "index";
    }
}
