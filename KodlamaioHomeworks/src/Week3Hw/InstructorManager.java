package Week3Hw;

public class InstructorManager extends UserManager{
	
	public void createCourse(Course course) {
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course);
	}

}
