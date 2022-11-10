package concerets;

import abstrct.CourseDao;
import entites.Courses;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Courses course) {
		System.out.println("JDBC ile course eklendi "+ course.getName());
		
	}

}
