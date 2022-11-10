import java.util.ArrayList;
import java.util.List;

import Logger.DatabaseLogger;
import Logger.FileLogger;
import Logger.Loggin;
import Logger.MailLogger;
import business.CategoryManager;
import business.CourseManager;
import business.InstractorManager;
import concerets.HibernateInstractorDao;
import concerets.JdbcCategoryDao;
import concerets.JdbcCourseDao;
import entites.Category;
import entites.Courses;
import entites.Instractor;

public class Main {

	public static void main(String[] args) throws Exception {
		List<Category> category=new ArrayList<>();
		Category category1=new Category(1,"sakina");
		Category category2=new Category(2,"Rezai");
		
		Instractor instractor1=new Instractor(1,"EnginDemir", null, 0);
		
		
		List<Courses> course=new ArrayList<>();
		Courses course1 = new Courses(1,"Java Yazılım Geliştirme",10);
		Courses course2 = new Courses(2,".NET  Yazılım Geliştirme",10);
		Courses course3 = new Courses(3,"Javascript Yazılım Geliştirme",-1);
		Courses course4 = new Courses(2,".NET  Yazılım Geliştirme",10);
		
		Loggin[] logger={
				new DatabaseLogger(),
				new FileLogger(),
				new MailLogger()
			
		};
		
		List<Instractor> instractor = new ArrayList<>(); 
		Instractor instractor1 = new Instractor(1,"Engin Demirog", null, 0);
		Instractor instractor2 = new Instractor(2,"Osman Kuştu", null, 0);
		
	
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),category,logger);
		InstractorManager instructorManager = new InstractorManager(new HibernateInstractorDao(),instractor,logger);
		CourseManager courseManager =  new CourseManager(new JdbcCourseDao(), course,logger);
		
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		instractorManager.add(instractor1);
		instractorManager.add(instractor2);
		
		courseManager.add(course1);
		courseManager.add(course2);
		
		
		courseManager.add(course4);
	}
}
