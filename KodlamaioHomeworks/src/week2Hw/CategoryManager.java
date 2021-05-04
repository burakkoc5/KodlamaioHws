package week2Hw;

public class CategoryManager {
	
	public void addCategory(Category category) {
		System.out.println(category.name +" adlý kategori eklendi.");
	}
	
	public void updateCategory(Category category) {
		System.out.println(category.name+ " adlý kategori güncellendi.");
	}

	public void deleteCategory(Category category) {
		System.out.println(category.name +"adlý kategori silindi");
	}


}
