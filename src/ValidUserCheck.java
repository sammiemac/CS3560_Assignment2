// Assignment 3
import java.util.*;

public class ValidUserCheck implements VisitorInterface {

	private Set<CompositeUser> invalidUser = new HashSet<CompositeUser>();
	
	@Override
	public void visitUser(User user) {
		invalidUser.add(user);
	}

	@Override
	public void visitGroup(UserGroup group) {
		invalidUser.add(group);
	}
	
	public String getListOfUsers() {
		String userList = invalidUser.toString();
		
		return userList;	
	}

}
