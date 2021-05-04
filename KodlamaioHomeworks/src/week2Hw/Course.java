package week2Hw;

public class Course {
	
	int id;
	int categoryId;
	String instructor;
	String name;
	String description;
	
	public Course() {}
	
	public Course(int id,int categoryId,String instructor,String name,String description) {
		this.id=id;
		this.categoryId=categoryId;
		this.instructor=instructor;
		this.name=name;
		this.description=description;
	}
	

}
