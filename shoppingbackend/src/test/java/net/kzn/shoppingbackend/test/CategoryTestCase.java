package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDao;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static CategoryDao categoryDao;
	
	private Category category;
	
	@BeforeClass
	public static void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		categoryDao=(CategoryDao)context.getBean("categoryDAO");		
	}
	@Test
	public void testAddCategory(){
		category=new Category();
		category.setName("Television");
		category.setDescription("Televisor LCD");
		category.setImageURL("CAT_1.png");
		assertEquals("success",true,categoryDao.add(category));
		
	}
	
}
