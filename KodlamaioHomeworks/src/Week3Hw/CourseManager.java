package Week3Hw;

public class CourseManager {

	public void addCourse(Course course) {
		System.out.println(course.getName() +" adlı kurs eklendi.");
	}
	
	public void updateCourse(Course course) {
		System.out.println(course.getName()+ " adlı kurs güncellendi.");
	}

	public void deleteCourse(Course course) {
		System.out.println(course.getName() +" adlı kurs silindi");
	}
}
