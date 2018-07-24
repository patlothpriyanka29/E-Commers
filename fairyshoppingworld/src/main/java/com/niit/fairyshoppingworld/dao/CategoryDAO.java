package com.niit.fairyshoppingworld.dao;

import java.util.List;

import com.niit.fairyshoppingworld.model.Category;


public interface CategoryDAO {
	
	public boolean save(Category category);
	
	public boolean update(Category category);
	
	
	public List<Category> list();
	
	public Category getCategoryById(String id);
	
	public boolean delete(String id);
	

	public Category getCategoryByName(String name);

}
