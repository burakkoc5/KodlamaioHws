package week2Hw;

public class CategoryManager {
	
	public void addCategory(Category category) {
		System.out.println(category.name +" adl� kategori eklendi.");
	}
	
	public void updateCategory(Category category) {
		System.out.println(category.name+ " adl� kategori g�ncellendi.");
	}

	public void deleteCategory(Category category) {
		System.out.println(category.name +"adl� kategori silindi");
	}


}
