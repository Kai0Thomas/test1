package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/*
	 * 通过订单id来获取商品列表
	 */
	List<Item> getItems(String orderId);
	
	/**
	 * 保存订单的时候减少库存
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);

}
