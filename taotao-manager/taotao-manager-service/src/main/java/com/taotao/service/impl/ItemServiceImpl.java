package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

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

    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        //设置分页信息
        PageHelper.startPage(page, rows);
        //执行查询
        TbItemExample example = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(example);
        //取查询结果
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setRows(list);
        result.setTotal(pageInfo.getTotal());
        //返回结果
        return result;
    }
}
