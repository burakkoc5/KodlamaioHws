package Week3Hw;

public class Instructor extends User{
	
	private Course[] givenCourses;

	public Course[] getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(Course[] givenCourses) {
		this.givenCourses = givenCourses;
	}
}
