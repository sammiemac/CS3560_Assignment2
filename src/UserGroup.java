import java.util.*;

public class UserGroup implements CompositeUser {
	
	private String groupID; // Group's name
	private ArrayList<CompositeUser> groupUsers; // List of group users
	
	// Assignment 3
	private long timeCreated;
	
	public UserGroup(String id, long createTime) {
		this.groupID = id;
		this.groupUsers = new ArrayList<CompositeUser>();
		
		// Assignment 3
		this.timeCreated = createTime;
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
	
	// Assignment 3
	public long getTimeCreated() {
		return timeCreated;
	}
	
	@Override
	public String toString() {
		return groupID;
	}

}
