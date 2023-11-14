import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;

// Uses the Observer pattern to update Twitter feed
public class Message {
	
	private String[] positiveWords = {"good", "great", "happy", "awesome", "epic"};
	
	private static ArrayList<String> allTweets = new ArrayList<String>();
	private static ArrayList<User> userTweet = new ArrayList<User>();
	private MessageCount totalMessage = new MessageCount();
	
	// Calculates how positive a tweet is
	public float CalculatePosTweet() {
		float percentPos;
		float posTweet = 0;
		float overallTweet = allTweets.size();
		
		for(int i = 0; i < overallTweet; i++) {
            String tweet = allTweets.get(i);
            
            tweet = tweet.toLowerCase();
            
            for(int j = 0; j < positiveWords.length; j++) {
                if (tweet.contains(positiveWords[j])) {
                    posTweet++;
                }
            }
        }
        
        percentPos = posTweet / overallTweet * 100;
        
        return percentPos;
	}
	
	// Adds a tweet for the user
	public void addTweet(User user, String tweet) {
		allTweets.add(tweet);
		userTweet.add(user);
		
		totalMessage.visitUser(user);
		
		System.out.println("Tweets: " + allTweets.toString());
        System.out.println(userTweet.get(userTweet.size() - 1) + ": " + allTweets.get(allTweets.size() - 1));
	}
	
	public ArrayList<String> getTweets() {
		return allTweets;
	}
	
	public void printTweets(JList twitFeed, ArrayList<User> following, User user) {
		DefaultListModel feed = (DefaultListModel) twitFeed.getModel();
		twitFeed.clearSelection();
		
		for (int i = allTweets.size() - 1; i >= 0; i--) {
            if (following.contains(userTweet.get(i)) || user.equals(userTweet.get(i))) {
                feed.addElement(userTweet.get(i) + ": " + allTweets.get(i));
            }
        }
	}

}
