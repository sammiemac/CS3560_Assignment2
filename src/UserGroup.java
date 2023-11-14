import java.util.*;

public class UserGroup implements CompositeUser {
	
	private String groupID; // Group's name
	private ArrayList<CompositeUser> groupUsers; // List of group users
	
	public UserGroup(String id) {
		this.groupID = id;
		this.groupUsers = new ArrayList<CompositeUser>();
	}
	
	@Override
	public String getID() {
		return groupID;
	}
	
	@Override
	public void setID(String id) {
		groupID = id;
	}
	
	// Adds a user to a group
	public void addUserToGroup(User userID) {
        groupUsers.add(userID);
    }
	
	public ArrayList<CompositeUser> getGroupUsers() {
		return groupUsers;
	}
	
	@Override
	public String toString() {
		return groupID;
	}

}
