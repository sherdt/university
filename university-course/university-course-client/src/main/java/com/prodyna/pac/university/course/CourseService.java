package com.prodyna.pac.university.course;

import java.util.List;

/**
 * @author Sergej Herdt, PRODYNA AG
 * 
 */
public interface CourseService {

	Course addCourse(Course course);

	void deleteCourse(Long id);

	List<Course> readCourses();

	Course updateCourse(Course course);

}
