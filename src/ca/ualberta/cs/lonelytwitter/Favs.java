package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;


public class Favs extends LonelyTweetModel
{
	public Favs(String text, Date timestamp)
	{

		super(text, timestamp);
		// TODO Auto-generated constructor stub
	}


	public Favs(String text)
	{

		super(text);
		// TODO Auto-generated constructor stub
	}


	protected ArrayList favs = new ArrayList();

	public Date getTimestamp()
	{
		return timestamp;
	}
	
	public ArrayList getFavs()
	{
	
		return favs;
	}

	
	public void setFavs(String x)
	{
	
		this.favs.add(x);
	}


	@Override
	public Date getTimestamp()
	{

		// TODO Auto-generated method stub
		return null;
	}
	
}
