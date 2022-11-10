package business;

import java.util.List;
import java.util.logging.Logger;

import Logger.Loggin;
import abstrct.CategoryDao;
import entites.Category;

public class CategoryManager {
	private CategoryDao _categoryDao;
	private List<Category> _category;
	private Loggin[] logger;
	
	public CategoryManager(CategoryDao categoryDao, List<Category> category, Loggin[] logger) {
		this._categoryDao=categoryDao;
		this._category=category;
		this.logger=logger;
	}
	
	public void add(Category category) throws Exception {
		for(Category categoris:_category) {
			if(categoris.getName().equals(category) || categoris.getId()==category.getId()) {
				throw new Exception(" Bu Kategory Isim Mevcut"+category.getName());
			}
			
		}
		_categoryDao.add(category);
		_category.add(category);
		
		for(Loggin loggers:logger) {
			loggers.Log();
			
		}
	}

}
