package Week3Hw;

public class StudentManager extends UserManager {
	public void takeCourse(Course course) {
		
		System.out.println(course.getInstructor()+" adlı eğitmenin verdiği "+course.getName()+ " adlı kurs alındı.");
	
	}
	
}
