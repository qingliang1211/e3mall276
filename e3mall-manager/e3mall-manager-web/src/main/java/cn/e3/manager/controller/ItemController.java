package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemSevice;

	//通过id查询商品信息
	@RequestMapping("/list/{itemId}")
	@ResponseBody
	public TbItem getList(@PathVariable Long itemId){
		TbItem item = itemSevice.findItemById(itemId);
		return item;
	}
}
