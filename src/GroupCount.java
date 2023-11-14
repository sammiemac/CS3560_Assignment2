public class GroupCount implements VisitorInterface {
	
	private int totalGroup = 0;
	
	@Override
	public void visitUser(User user) { }
	
	@Override
	public void visitGroup(UserGroup group) {
		totalGroup++;
	}
	
	public int getTotalGroup() {
		return totalGroup;
	}
	
	public void setTotalGroup(int groupTotal) {
		totalGroup = groupTotal;
	}

}
