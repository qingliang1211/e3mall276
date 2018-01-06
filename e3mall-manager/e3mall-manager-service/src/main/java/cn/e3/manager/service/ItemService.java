package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {

	//通过id查询商品信息
	public TbItem findItemById(Long itemId);
}
