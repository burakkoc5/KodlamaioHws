package week2Hw;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println(course.name +" adl� kurs eklendi.");
	}
	
	public void updateCourse(Course course) {
		System.out.println(course.name+ " adl� kurs g�ncellendi.");
	}

	public void deleteCourse(Course course) {
		System.out.println(course.name +" adl� kurs silindi");
	}

}
