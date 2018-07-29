package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 商品展示Controller
 *
 * @Author: wpz
 * @Desctription:
 * @Date: Created in 2018/7/29 15:04
 */
@Controller
public class ItemController {

    @Resource
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemByID(@PathVariable Long itemId) {
        return itemService.getItemByID(itemId);
    }
}
