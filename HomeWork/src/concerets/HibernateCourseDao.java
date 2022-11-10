package concerets;

import abstrct.CourseDao;
import entites.Courses;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Courses course) {
		System.out.println("Hibernate ile Course Eklendi"+course.getName());
	}

}
