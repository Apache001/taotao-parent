package com.taotao.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taotao.item.pojo.Item;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;
import com.taotao.service.ItemService;

import javax.annotation.Resource;

/**
 * 商品详情页面展示Controller
 * <p>Title: ItemController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class ItemController {
	
	@Resource
	private ItemService itemService;

	@RequestMapping("/item/{itemId}")
	public String showItem(@PathVariable Long itemId, Model model) {
		//取商品基本信息
		TbItem tbItem = itemService.getItemById(itemId);
		Item item = new Item(tbItem);
		//取商品详情
		TbItemDesc tbItemDesc = itemService.getItemDescById(itemId);
		//把数据传递给页面
		model.addAttribute("item", item);
		model.addAttribute("itemDesc", tbItemDesc);
		//返回逻辑视图
		return "item";
	}
}
