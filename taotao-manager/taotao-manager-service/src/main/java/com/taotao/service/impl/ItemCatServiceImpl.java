package com.taotao.service.impl;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.service.ItemCatService;
import org.springframework.stereotype.Service;
import com.taotao.pojo.TbItemCatExample.Criteria;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wpz
 * @Desctription:
 * @Date: Created in 2018/7/30 21:02
 */
@Service
public class ItemCatServiceImpl implements ItemCatService{

    @Resource
    private TbItemCatMapper itemCatMapper;

    /**
     * 根据父节点id查询子节点列表
     * @param parentId
     * @return
     */
    @Override
    public List<EasyUITreeNode> getItemCatList(long parentId) {
        //根据父节点id查询子节点列表
        TbItemCatExample example = new TbItemCatExample();
        //设置查询条件
        Criteria criteria = example.createCriteria();

        //设置parentid
        criteria.andParentIdEqualTo(parentId);
        //执行查询
        List<TbItemCat> list = itemCatMapper.selectByExample(example);
        //转换成EasyUITreeNode列表
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for (TbItemCat tbItemCat : list) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            //如果节点下有子节点“closed”，如果没有子节点“open”
            node.setState(tbItemCat.getIsParent()?"closed":"open");
            //添加到节点列表
            resultList.add(node);
        }
        return resultList;
    }
}
