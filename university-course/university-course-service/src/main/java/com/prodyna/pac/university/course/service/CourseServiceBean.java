package com.prodyna.pac.university.course.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.prodyna.pac.university.course.Course;
import com.prodyna.pac.university.course.CourseService;

/**
 * @author Sergej Herdt, PRODYNA AG
 * 
 */
@Stateless
public class CourseServiceBean implements CourseService {

	/**
	 * Entity manger for DB access.
	 */
	@PersistenceContext(unitName = "universityPU")
	private EntityManager entityManager;

	@Override
	public Course addCourse(final Course course) {
		this.entityManager.persist(course);
		return course;
	}

	@Override
	public void deleteCourse(final String id) {
		final Course course = this.entityManager.find(Course.class, id);
		this.entityManager.remove(course);
	}

	@Override
	public List<Course> readCourses() {
		return this.entityManager.createQuery("select c from Course c", Course.class).getResultList();
	}

	@Override
	public Course updateCourse(final Course course) {
		return this.entityManager.merge(course);
	}

}
