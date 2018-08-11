package com.taotao.search.mapper;

import com.taotao.common.pojo.SearchItem;

import java.util.List;

/**
 * @Author: wpz
 * @Desctription:
 * @Date: Created in 2018/8/8 21:49
 */
public interface SearchItemMapper {
    List<SearchItem> getItemList();
    SearchItem getItemById(long itemId);
}
