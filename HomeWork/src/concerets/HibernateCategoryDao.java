package concerets;

import abstrct.CategoryDao;
import entites.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile Category Eklendi"+category.getName());
		
	}
	

}
