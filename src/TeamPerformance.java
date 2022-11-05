import java.util.*;
public class TeamPerformance
{
	private String name;
	private int gamesPlayed;
	private int gamesWon;
	private int gamesDrawn;
	private int goalsScored;
	private int goalsConceded;
	
	public TeamPerformance(String n,int gp,int gw,int gd,int gs,int gc)
	{
		if(gw>gp || gd>gp || ((gd+gw)>gp))
			throw new IllegalArgumentException();
		
		name=n;
		gamesWon=gw;
		gamesPlayed=gp;
		gamesDrawn=gd;
		goalsScored=gs;
		goalsConceded=gc;
	}
	
	//Name Accessor mutator methods 
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
	
	//Games Accessor Mutator methods
	public int getGamesWon()
	{
		return gamesWon;
	}
	public void setGamesWon(int n)
	{
		gamesWon=n;
	}
	
	public int getGamesPlayed()
	{
		return gamesPlayed;
	}
	public void setGamesPlayed(int n)
	{
		gamesPlayed=n;
	}
	
	public int getGamesDrawn()
	{
		return gamesDrawn;
	}
	public void setGamesDrawn(int n)
	{
		gamesDrawn=n;
	}
	
	//Goals Accessor Mutator methods
	public int getGoalsScored()
	{
		return goalsScored;
	}
	public void setGoalsScored(int n)
	{
		goalsScored=n;
	}
	
	public int getGoalsConceded()
	{
		return goalsConceded;
	}
	public void setGoalsConceded(int n)
	{
		goalsConceded=n;
	}
}