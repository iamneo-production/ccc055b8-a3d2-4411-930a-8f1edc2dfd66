package com.PartTimeAdmissionPortal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class CourseEntity {

	@Id
	@GeneratedValue
	private int courseId;
	private String courseName;
	private String courseDescription;
	private int courseDuration;
	private int courseStudents;
	private String courseTime;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	public int getCourseStudents() {
		return courseStudents;
	}
	public void setCourseStudents(int courseStudents) {
		this.courseStudents = courseStudents;
	}
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}
	@Override
	public String toString() {
		return "CourseEntity [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + ", courseDuration=" + courseDuration + ", courseStudents=" + courseStudents
				+ ", courseTime=" + courseTime + "]";
	}
	
	public CourseEntity() {
		super();
	}
}