package com.niit.fairyshoppingworld.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.fairyshoppingworld.dao.CategoryDAO;
import com.niit.fairyshoppingworld.model.Category;


public class CategoryTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static CategoryDAO categoryDAO;

	@Autowired
	static Category category;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
	categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	category = (Category) context.getBean("category");

	}
/*
	@Test
	public void createCategoryTestCase() {
		category.setId("CATG2");
		category.setName("Ofiice Chair");
		category.setDescription("Ofiice Chair Chair");

		boolean flag = categoryDAO.save(category);

		assertEquals("createCategoryTestCase", true, flag);

	}

	@Test
	public void updateCategoryTestCase() {
		category.setId("CATG1");
		category.setName("Dental Medicine");
		category.setDescription("for tooth pain");

		boolean flag = categoryDAO.update(category);

		assertEquals("updateCategoryTestCase", true, flag);

	}

	@Test
	public void deleteCategoryTestCase() {
		category.setName("Dental Medicine");
		boolean flag = categoryDAO.delete(category.getName());

		assertEquals("deleteCategoryTestCase", true, flag);

	}

	@Test
	public void listAllCategoryTestCase() {
		int actualSize = categoryDAO.list().size();
		assertEquals(6, actualSize);
	}
*/
}
