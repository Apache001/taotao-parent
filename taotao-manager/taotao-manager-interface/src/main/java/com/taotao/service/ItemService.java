package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;

/**
 * @Author: wpz
 * @Desctription:
 * @Date: Created in 2018/7/29 14:23
 */
public interface ItemService {
    TbItem getItemByID(long itemID);
    EasyUIDataGridResult getItemList(int page,int rows);
    TaotaoResult addItem(TbItem item,String desc);
    TbItemDesc getItemDescById(long itemId);
}
