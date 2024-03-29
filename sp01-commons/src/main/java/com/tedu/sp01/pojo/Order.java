package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String id;         //订单id
	private User user;         //订单所属用户   
	private List<Item> Items;  //订单包含的商品列表
	

}
