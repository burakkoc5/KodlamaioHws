package week2Hw;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="C# Kurslar�";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Java Kurslar�";

		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addCategory(category1);
		categoryManager.addCategory(category2);
		
		Course course1 = new Course(1,1,"Engin Demiro�","C# ve Angular Kursu","2 ay s�recek �cretsiz bir kurstur.");
		
		Course course2 = new Course() {};
		course2.id =2;
		course2.categoryId=2;
		course2.instructor="Engin Demiro�";
		course2.name="Java ve React Kamp�";
		course2.description="2 ay s�recek �cretsiz bir kurstur.";
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		
		courseManager.deleteCourse(course1);
	}

}
