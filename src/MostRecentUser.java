// Assignment 3
public class MostRecentUser implements VisitorInterface {

	private User mostRecentUser;
	
	@Override
	public void visitUser(User user) {
		mostRecentUser = user;
	}

	@Override
	public void visitGroup(UserGroup group) { }
	
	public String getRecentUser() {
		return mostRecentUser.getID();
	}

}
