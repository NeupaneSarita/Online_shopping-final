package com.sarita.shoppingBackendFinal.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sarita.shoppingBackendFinal.dao.ProductDAO;
import com.sarita.shoppingBackendFinal.dto.Product;

public class ProductTestCase {
	private static AnnotationConfigApplicationContext context;
	private static Product product;
	private static ProductDAO productDAO;
	@BeforeClass
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.sarita.shoppingBackendFinal");
		context.refresh();
		productDAO=(ProductDAO)context.getBean("productDAO");
	}
	/*
	@Test
	public void testCRUDProducts() {
		//create operation 
		
		product=new Product();
		product.setName("oppo selfie S53");
		product.setBrand("oppo");
		product.setDescription("this is some description for oppo mobile");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		assertEquals("something went wrong while inserting a new product",true,productDAO.add(product));
	
	
	//reading and updating the category
	
	product=productDAO.get(2);
	product.setName("samsung galaxy s7");
	product.setActive(false);
	assertEquals("something went wrong while updating the existing record",true,productDAO.update(product));
	// list
	assertEquals("something went wrong while fetching the list of products",11,productDAO.list().size());
	
	}
	*/
	
	@Test
	public void testListActiveProducts() {
		assertEquals("something went wrong while fetching the list of products",10,productDAO.listActiveProducts().size());
	}
	@Test
	public void testListActiveProductsByCategory() {
		assertEquals("something went wrong while fetching the list of products",4,productDAO.listActiveProductsByCategory(1).size());

		assertEquals("something went wrong while fetching the list of products",6,productDAO.listActiveProductsByCategory(3).size());
	}
		
	
	
    @Test
	public void testGetLatestActiveProduct() {
		assertEquals("something went wrong while fetching the list of products",3,productDAO.getLatestActiveProducts(3).size());

	}
	

}
