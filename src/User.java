import java.util.*;
import javax.swing.JList;

public class User implements CompositeUser {
	
	private String userID; // User's username
	private ArrayList<User> userFollowers; // List of the user's followers
	private ArrayList<User> userFollowing; // List of who the user is following
	private List<String> userMessages; // User's messages
	private Message twitFeed; // User's Twitter feed
	
	private JList feedList;
	
	public User(String id) {
		this.userID = id;
		this.userFollowers = new ArrayList<User>();
		this.userFollowing = new ArrayList<User>();
		this.userMessages = new ArrayList<String>();
		this.twitFeed = new Message();
	}
	
	@Override
	public String getID() {
		return userID;
	}
	
	@Override
	public void setID(String id) {
		userID = id;
	}
	
	public List<User> getUserFollowers() {
		return userFollowers;
	}
	
	public List<User> getUserFollowing() {
		return userFollowing;
	}
	
	public JList getFeedList() {
		return this.feedList;
	}
		
	public void setFeedList(JList tweets) {
		feedList = tweets;
	}
	
	// Adds a new follower for the user
	public void addFollower(User follower) {
		userFollowers.add(follower);
		System.out.println(follower + "is now following " + userID);
	}
	
	// Gets a list of the user's followers
	public ArrayList<User> getFollowers() {
		return userFollowers;
	}
	
	// Adds another user that the current user follows
	public void addFollowing(User follow) {
		userFollowing.add(follow);
		System.out.println(userID + "is now following " + follow);
	}
	
	// Gets a list of who the user is following
	public ArrayList<User> getFollowing() {
		return userFollowers;
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
	
	@Override
	public String toString() {
		return userID;
	}

}
