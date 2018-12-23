package com.sarita.shoppingBackendFinal.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sarita.shoppingBackendFinal.dao.CategoryDAO;
import com.sarita.shoppingBackendFinal.dto.Category;
@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;
	/*private static List<Category> categories=new ArrayList<>();
	static {
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is Television");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		
		 category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is Mobile");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		
		
	 category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is Laptop");
		category.setImageURL("CAT_3.png");
		categories.add(category);
		
	}
	*/
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		String selectActiveCategory ="FROM Category WHERE  active = :active";
		Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active",true);
		
		return query.getResultList();
	}
	
	// get single category based on id
	@Override
	public Category get(int id) {
		
		// TODO Auto-generated method stub
		/*for(Category category : categories) {
			if(category.getId()==id) return category;
		}
		*/
		return sessionFactory.getCurrentSession().get(Category.class,Integer.valueOf(id));
	}
	@Override
	
	public boolean add(Category category) {
		// TODO Auto-generated method stub
		try {
			//add the category to the database table
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}
	//updating a single category
	@Override
	public boolean update(Category category) {
		try {
			//add the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		}
	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			//add the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
			}

}
