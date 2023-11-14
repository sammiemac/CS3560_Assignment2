import java.util.*;


public class UserGroup implements CompositeUser {
	
	private String groupID;
	private List<User> groupUsers;
	
	public UserGroup(String id) {
		this.groupID = id;
		this.groupUsers = new ArrayList<>();
	}
	
	@Override
	public String getID() {
		return groupID;
	}
	
	@Override
	public void setID(String id) {
		groupID = id;
	}
	
	public List<User> getGroupUsers() {
		return groupUsers;
	}
	
	public void addUser(User user) {
		groupUsers.add(user);
		System.out.println(user + " added to " + groupID);
	}
	
	@Override
	public String toString() {
		return groupID;
	}

}
