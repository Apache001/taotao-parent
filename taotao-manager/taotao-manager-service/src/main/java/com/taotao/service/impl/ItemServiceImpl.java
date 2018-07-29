package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 商品管理服务
 *
 * @Author: wpz
 * @Desctription:
 * @Date: Created in 2018/7/29 14:27
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Resource
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemByID(long itemID) {
        TbItem item = itemMapper.selectByPrimaryKey(itemID);
        return item;
    }
}
