package ca.ualberta.cs.lonelytwitter;


import java.util.ArrayList;

public class TweetList
{

	private ArrayList<LonelyTweetModel> tweetList;
	private int count;
	
	public TweetList () {
		this.tweetList = new ArrayList<LonelyTweetModel>();
		count = 0;
	}
	public ArrayList<LonelyTweetModel> getTweets()
	{
		
		return tweetList;
	}
	
	public int getCounts()
	{

		return count;
	}
	public void addTweet(NormalTweetModel tweet)
	{
		tweetList.add(tweet);
		count ++;
	}
	
}
