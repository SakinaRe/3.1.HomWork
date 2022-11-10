package business;

import java.util.List;
import java.util.logging.Logger;

import Logger.Loggin;
import abstrct.CourseDao;
import entites.Courses;

public class CourseManager {
    private CourseDao _courseDao;
    private List<Courses> _course;
    private Loggin[] _logger;
    
    
    public CourseManager(CourseDao courseDao, List<Courses> course, Loggin[] logger) {
    	this._courseDao=courseDao;
    	this._course=course;
    	this._logger=logger;
    	
    }
    
    public void add(Courses course) throws Exception {
    	if(course.getPrice()<0) {
    		throw new Exception("Course fiyati 0 den kucuk olamaz"+course.getPrice());
    	}
    	for(Courses courses:_course) {
    		if(courses.getName().equals(course.getPrice())) {
    			throw new Exception("Bu ders mevcuttur."+course.getName());
    		}
    	}
    	_courseDao.add(course);
    	_course.add(course);
    	
    	for(Loggin loggers: _logger)
    	{
    		loggers.Log();
    	}
    }
}
