package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: wpz
 * @Desctription:
 * @Date: Created in 2018/7/29 17:05
 */
@Controller
public class PageController {
    @Resource
    private ItemService itemService;

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

//    @RequestMapping("/item/list")
//    @ResponseBody
//    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
//        return itemService.getItemList(page, rows);
//    }
}
