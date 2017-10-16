package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.RespectBinding;

import net.kzn.shoopingbackend.dto.Category;
import net.kzn.shoppingbackend.dao.CategoryDao;
import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories=new ArrayList<>();
	
	static{
		Category category=new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("Televisor LCD");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		category=new Category();
		category.setId(2);
		category.setName("Radio");
		category.setDescription("Radio FM");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		
		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Laptop LCD");
		category.setImageURL("CAT_3.png");
		categories.add(category);
		
		category=new Category();
		category.setId(4);
		category.setName("Zapatillas");
		category.setDescription("Zapatilla nike");
		category.setImageURL("CAT_4.png");
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//enchanced for loop
		for(Category category: categories){
			if(category.getId()==id) return category;
		}
		return null;
	}

}
