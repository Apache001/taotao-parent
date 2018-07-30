package com.taotao.service;

import com.taotao.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * @Author: wpz
 * @Desctription:
 * @Date: Created in 2018/7/30 20:58
 */
public interface ItemCatService {
    List<EasyUITreeNode> getItemCatList(long parentID);
}
