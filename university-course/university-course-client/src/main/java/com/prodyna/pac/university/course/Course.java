package com.prodyna.pac.university.course;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Sergej Herdt, PRODYNA AG
 * 
 */
@Entity
@Table(name = "cou_course")
public class Course implements Serializable {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = -729486818742117407L;

	/**
	 * UUID format should be used as id;
	 */
	@Id
	private String id;

	/**
	 * Course name.
	 */
	private String name;

	/**
	 * Description for the course.
	 */
	private String description;

	/**
	 * @return the id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

}
