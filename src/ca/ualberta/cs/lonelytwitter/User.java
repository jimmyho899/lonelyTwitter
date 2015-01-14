package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;


public abstract class User extends Object implements UserLike
{
	public User(String name)
	{

		super();
		this.name = name;
	}
	
	public User()
	{

		super();
		this.name = "anonymous";
	}
	
	
	protected String name;
	
	public String getName()
	{
	
		return name;
	}	

	
	public abstract void setName(String x) throws IOException;
	

}
