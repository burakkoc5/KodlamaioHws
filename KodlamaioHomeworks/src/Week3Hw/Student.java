package Week3Hw;

public class Student extends User{
	private Course[] takenCourses;
	
	public Course[] getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(Course[] takenCourses) {
		this.takenCourses = takenCourses;
	}
}
