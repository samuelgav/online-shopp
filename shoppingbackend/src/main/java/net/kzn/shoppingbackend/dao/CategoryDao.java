package net.kzn.shoppingbackend.dao;

import java.util.List;

import net.kzn.shoopingbackend.dto.Category;

public interface CategoryDao {

	boolean add(Category category);
	List<Category> list();
	Category get(int id);
}
