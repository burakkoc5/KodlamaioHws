package week2Hw;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println(course.name +" adlı kurs eklendi.");
	}
	
	public void updateCourse(Course course) {
		System.out.println(course.name+ " adlı kurs güncellendi.");
	}

	public void deleteCourse(Course course) {
		System.out.println(course.name +" adlı kurs silindi");
	}

}
