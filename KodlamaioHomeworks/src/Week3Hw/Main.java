package Week3Hw;

public class Main {

	public static void main(String[] args) {
		
		User instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setUserName("Engindemirog");
		instructor1.setPassword("12345");
		
		User student1 = new Student();
		student1.setId(2);
		student1.setUserName("Burakkoc");
		student1.setPassword("54321");
		
		
		Course course1 = new Course() {};
		course1.setId(1);
		course1.setInstructor((Instructor)instructor1);
		course1.setName("Java ve React Kampı");
		course1.setDescription("2 ay sürecek ücretsiz bir kurstur.");

		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		CourseManager courseManager = new CourseManager();
		
		
		instructorManager.add(instructor1);
		studentManager.add(student1);
		
		instructorManager.createCourse(course1);
		

	}

}
