package com.sarita.shoppingBackendFinal.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sarita.shoppingBackendFinal.dao.CategoryDAO;
import com.sarita.shoppingBackendFinal.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	@BeforeClass 
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.sarita.shoppingBackendFinal");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
	
/*	@Test
	public void testAddCategory() {
		category=new Category();
		category.setName("Laptop");
		category.setDescription("This is Laptop");
		category.setImageURL("CAT_115.png");
		assertEquals("successfully added a category inside the table",true,categoryDAO.add(category));	
	}
*/
	
/*	@Test
	public void testGetCategory() {
		category=categoryDAO.get(2);
		assertEquals("successfully fetched  a single category from the table","Laptop",category.getName());	

	}
	*/
/*	@Test
	public void testUpdateCategory() {
		category=categoryDAO.get(1);
		category.setName("TV");
		assertEquals("successfully updated  a single category in the table",true,categoryDAO.update(category));	

	}
*/
/*	@Test
	public void testDeleteCategory() {
		category=categoryDAO.get(1);
		assertEquals("successfully deleted a single category from the table",true,categoryDAO.delete(category));	
}
*/
/*	@Test
	public void testListCategory() {
		assertEquals("successfully fetched the list of categories from the table",2,categoryDAO.list().size());	
}
	*/
	@Test
	public void testCRUDCategory() {
		
		//adding category
		category=new Category();
		category.setName("Laptop");
		category.setDescription("This is Laptop");
		category.setImageURL("CAT_1.png");
		assertEquals("successfully added a category inside the table",true,categoryDAO.add(category));	
		
		category=new Category();
		category.setName("Television");
		category.setDescription("This is tv");
		category.setImageURL("CAT_2.png");
		assertEquals("successfully added a category inside the table",true,categoryDAO.add(category));	

		//updating
		category=categoryDAO.get(2);
		category.setName("TV");
		assertEquals("successfully updated  a single category in the table",true,categoryDAO.update(category));	

		//deleting ie deactivating
		category=categoryDAO.get(2);
		assertEquals("successfully deleted a single category from the table",true,categoryDAO.delete(category));	
		//fetching the list
		assertEquals("successfully fetched the list of categories from the table",10,categoryDAO.list().size());	

}
		
		
		
	}


