package ca.ualberta.cs.lonelytwitter;


import java.util.ArrayList;
import java.util.Date;

public class TweetList
{

	private ArrayList<LonelyTweetModel> tweetList;
	
	public TweetList () {
		this.tweetList = new ArrayList<LonelyTweetModel>();
	}
	
	public ArrayList<LonelyTweetModel> getTweets()
	{
		//for (tweet:tweetList) {
			//tweet.getTimestamp();
		//}
		tweetList.toArray();
		new Date(6767);
		return tweetList;
	}
	
	public int getCounts()
	{
		return tweetList.size();
	}
	
	public void addTweet(LonelyTweetModel tweet) throws IllegalArgumentException
	{
		if (hasTweet(tweet)) {
			throw new IllegalArgumentException();
		}
		tweetList.add(tweet);
	}
	
	public boolean hasTweet(LonelyTweetModel tweet) {
		if (tweetList.contains(tweet)) 
			return true;
		else
			return false;
	}
	
}
