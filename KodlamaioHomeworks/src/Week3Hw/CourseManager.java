package Week3Hw;

public class CourseManager {

	public void addCourse(Course course) {
		System.out.println(course.getName() +" adl� kurs eklendi.");
	}
	
	public void updateCourse(Course course) {
		System.out.println(course.getName()+ " adl� kurs g�ncellendi.");
	}

	public void deleteCourse(Course course) {
		System.out.println(course.getName() +" adl� kurs silindi");
	}
}
