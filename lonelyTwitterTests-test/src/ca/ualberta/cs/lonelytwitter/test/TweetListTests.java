package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetList;
import android.test.ActivityInstrumentationTestCase2;


public class TweetListTests extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public TweetListTests()
	{

		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception
	{

		super.setUp();
	}
	
	public void testTweetList() {
		TweetList tweetlist = new TweetList();
		ArrayList<LonelyTweetModel> tweets = tweetlist.getTweets();
		assertNotNull("Tweet List not initialized", tweets);
	}

	public void testCounts() {
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello");
		tweetList.addTweet(tweet);
		assertEquals("This should be one", tweetList.getCounts(), 1);
	}
	
	public void testDuplicateTweet() {
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello");
		tweetList.addTweet(tweet);
		//tweetList.addTweet(tweet);
		
	}
	
	public void testgetTweet() {
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello");
		tweetList.addTweet(tweet);
		NormalTweetModel tweet2 = new NormalTweetModel("Hi");
		tweetList.addTweet(tweet2);
		
		tweetList.getTweets();
		
	}
}
