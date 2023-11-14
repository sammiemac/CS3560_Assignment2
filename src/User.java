import java.util.*;
import javax.swing.JList;

public class User implements CompositeUser {
	
	private String userID; // User's username
	private List<User> userFollowers; // List of the user's followers
	private List<User> userFollowing; // List of who the user is following
	private List<String> twitFeed; // User's Twitter feed
	
	private JList feedList;
	
	public User(String id) {
		this.userID = id;
		this.userFollowers = new ArrayList<>();
		this.userFollowing = new ArrayList<>();
		this.twitFeed = new ArrayList<>();
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
	
	public List<String> getTwitFeed() {
		return twitFeed;
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
	
	// Adds another user that the current user follows
	public void addFollow(User follow) {
		userFollowing.add(follow);
		System.out.println(userID + "is now following " + follow);
	}
	
	// Adds a new tweet to the Twitter feed
	public void postTweet(String tweet) {
		twitFeed.add(tweet);
		for (User follower : userFollowers) {
			follower.getTwitFeed().add(tweet);
		}
	}
	
	@Override
	public String toString() {
		return userID;
	}

}
