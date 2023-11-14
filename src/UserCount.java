
public class UserCount implements VisitorInterface {
	
	private int totalUser = 0;

	@Override
	public void visitUser(User user) {
		totalUser++;	
	}

	@Override
	public void visitGroup(UserGroup group) { }
	
	public int getTotalUser() {
		return totalUser;
	}
	
	public void setTotalUser(int userTotal) {
		totalUser = userTotal;
	}

}
