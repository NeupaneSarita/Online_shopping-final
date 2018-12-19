package com.sarita.shoppingBackendFinal.dao;

import java.util.List;

import com.sarita.shoppingBackendFinal.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	Category get(int id);

}
