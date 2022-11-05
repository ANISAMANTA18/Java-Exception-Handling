import java.util.*;
class TeamTest
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter Team name : ");
		String n=sc.nextLine();
		System.out.println ("Enter Games Played :");
		int gp=sc.nextInt();
		System.out.println ("Enter Games Won : ");
		int gw=sc.nextInt();
		System.out.println ("Enter Games Drawn : ");
		int gd=sc.nextInt();
		System.out.println ("Enter Goals Scored : ");
		int gs=sc.nextInt();
		System.out.println ("Enter Goals Conceded : ");
		int gc=sc.nextInt();
		try 
		{
			TeamPerformance obj=new TeamPerformance(n,gp,gw,gd,gs,gc);
			System.out.println ("Valid Argument");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println ("Not Valid");
		}
	}
}