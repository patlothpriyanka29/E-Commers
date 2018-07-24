package com.niit.fairyshoppingworld.dao;

import java.util.List;

import com.niit.fairyshoppingworld.model.OrderTable;


public interface OrderTableDAO {
	
	public boolean save(OrderTable orderTable);
	public List<OrderTable> list(String userId);

}
