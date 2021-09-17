package in.java.ipl;

public class Player extends Person implements IPlayer
{
	enum role{Batsman,Bowler,AllRounder};
	
	private role primaryRole;
	private boolean isCaptain;
	private boolean isWicketKeeper;
	
	public role getPrimaryRole() {
		return primaryRole;
	}
	public void setPrimaryRole(role primaryRole) {
		this.primaryRole = primaryRole;
	}
	public boolean isCaptain() {
		return isCaptain;
	}
	public void setCaptain(boolean isCaptain) {
		this.isCaptain = isCaptain;
	}
	
	public boolean isWicketKeeper() {
		return isWicketKeeper;
	}
	public void setWicketKeeper(boolean isWicketKeeper) {
		this.isWicketKeeper = isWicketKeeper;
	}
	public Player(String Fname,String Lname,  int age, Person.Gender gender , String place, role primaryRole, boolean isCaptain, boolean isWicketKeeper) {
		super(Fname, Lname, age, place, gender);
		
		this.primaryRole = primaryRole;
		this.isCaptain = isCaptain;
		this.isWicketKeeper = isWicketKeeper;
	}
	@Override
	public String toString()
	{
		String PlayerData = super.toString();
		PlayerData = PlayerData.concat(" PrimryRole: " + getPrimaryRole());
				
				
		if(isCaptain())
		{
			PlayerData = PlayerData.concat(" and Captain");
		}
		if(isWicketKeeper())
		{
			PlayerData = PlayerData.concat(" and WicketKeeper");
		}
		
		return PlayerData ;
	}
	@Override
	public String getHighestRUns() {
		// TODO Auto-generated method stub
		return "HighestRuns";
	}
	@Override
	public String getBestBowling() {
		// TODO Auto-generated method stub
		return "BestBowling";
	}
	@Override
	public String getTotalRuns() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTotalWickets() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTotalCatcher() {
		// TODO Auto-generated method stub
		return null;
	}
}
