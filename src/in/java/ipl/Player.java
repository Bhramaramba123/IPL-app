package in.java.ipl;

public class Player 
{
	private String name;
	private int Age;
	private String place;
	private String primaryRole;
	private boolean isCaptain;
	private boolean isWicketKeeper;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPrimaryRole() {
		return primaryRole;
	}
	public void setPrimaryRole(String primaryRole) {
		this.primaryRole = primaryRole;
	}
	public boolean isCaptain() {
		return isCaptain;
	}
	public void setCaptain(boolean isCaptain) {
		this.isCaptain = isCaptain;
	}
	@Override
	public String toString()
	{
		String PlayerData = " Name : " + getName()
	+ " Age : " + getAge()
	+ " Place : " + getPlace()
	+ " PrimryRole: " + getPrimaryRole();
		if(isCaptain())
		{
			PlayerData = PlayerData.concat("and Captain");
		}
		if(isWicketKeeper())
		{
			PlayerData = PlayerData.concat("and WicketKeeper");
		}
		
		return PlayerData ;
	}
	public boolean isWicketKeeper() {
		return isWicketKeeper;
	}
	public void setWicketKeeper(boolean isWicketKeeper) {
		this.isWicketKeeper = isWicketKeeper;
	}
	public Player(String name, int age, String place, String primaryRole, boolean isCaptain, boolean isWicketKeeper) {
		super();
		this.name = name;
		Age = age;
		this.place = place;
		this.primaryRole = primaryRole;
		this.isCaptain = isCaptain;
		this.isWicketKeeper = isWicketKeeper;
	}
	
}
