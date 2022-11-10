package concerets;

import abstrct.CategoryDao;
import entites.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile kategory eklendi"+category.getName());
	}
	

}
