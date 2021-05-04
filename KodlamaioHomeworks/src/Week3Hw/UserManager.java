package Week3Hw;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getUserName() +" eklendi.");
	}
	
	public void addMutiple(User[] users) {
		
		for(User user:users) {
			add(user);
			
		}
		
	}
}
