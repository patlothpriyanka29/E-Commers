package com.niit.fairyshoppingworld.dao;

import java.util.List;

import com.niit.fairyshoppingworld.model.Contact;



public interface ContactDAO {
	
	
	public  boolean save(Contact contact);
	
	public boolean delete(int id);
	
	
	public List<Contact> list();
	
	
	
	public Contact getContactById(int id);
	
}
