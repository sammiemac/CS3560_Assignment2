import java.util.*;
import javax.swing.JList;

public class User implements CompositeUser {
	
	private String userID; // User's username
	private ArrayList<User> userFollowers; // List of the user's followers
	private ArrayList<User> userFollowing; // List of who the user is following
	private List<String> userMessages; // User's messages
	private Message twitFeed; // User's Twitter feed
	
	private JList feedList;
	
	// Assignment 3
	private long timeCreated; // Time when user was created
	private long lastTimeUpdated; // Time when user was last updated
	
	public User(String id, long createTime) {
		this.userID = id;
		this.userFollowers = new ArrayList<User>();
		this.userFollowing = new ArrayList<User>();
		this.userMessages = new ArrayList<String>();
		this.twitFeed = new Message();
		
		// Assignment 3
		this.timeCreated = createTime;
		this.lastTimeUpdated = createTime;
	}
	
	@Override
	public String getID() {
		return userID;
	}
	
	@Override
	public void setID(String id) {
		userID = id;
	}
	
//	public List<User> getUserFollowers() {
//		return userFollowers;
//	}
//	
//	public List<User> getUserFollowing() {
//		return userFollowing;
//	}
	
	public JList getFeedList() {
		return this.feedList;
	}
		
	public void setFeedList(JList tweets) {
		feedList = tweets;
	}
	
	// Gets a list of the user's followers
	public ArrayList<User> getFollowers() {
		return userFollowers;
	}
	
	// Adds a new follower for the user
	public void addFollower(User follower) {
		userFollowers.add(follower);
		System.out.println(follower + "is now following " + userID);
	}
	
	// Gets a list of who the user is following
	public ArrayList<User> getFollowing() {
		return userFollowers;
	}
	
	// Adds another user that the current user follows
	public void addFollowing(User follow) {
		userFollowing.add(follow);
		System.out.println(userID + "is now following " + follow);
	}
	
	// Adds a new message for the user
	public void addMessage(String message) {
		userMessages.add(message);
	}
	
	// Gets a message at given position
	public String getMessage(int pos) {
		return userMessages.get(pos);
	}
	
	// Uses the OBVSERVER pattern to update user's followers
	public void updateFollowers() {
		for (int i = 0; i < userFollowers.size(); i++) {
			userFollowers.get(i).updateFeed(userFollowers.get(i).getFeed());
        }
	}
	
	public JList getFeed() {
		return this.feedList;
	}
	
	public void setFeed(JList feed) {
		feedList = feed;
	}
	
	public void updateFeed(JList feed) {
        this.twitFeed.printTweets(feed, userFollowing, this);
    }
	
	// Assignment 3
	public long getTimeCreated() {
		return timeCreated;
	}
	
	public long getLastTimeUpdated() {
		return lastTimeUpdated;
	}
	
	public void setLastTimeUpdated(long updateTime) {
		lastTimeUpdated = updateTime;
	}
	
	public long getLastTimeUpdatedLong() {
		return lastTimeUpdated;
	}
	
	@Override
	public String toString() {
		return userID;
	}

}
