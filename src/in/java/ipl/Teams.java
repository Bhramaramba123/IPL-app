package in.java.ipl;

import java.util.List;

public class Teams
{
	private static final Player[] player = null;
	private String teamName ;
	private int totalSix ;
	private double netRunRate ;
	private boolean isKnockOut ;
    private List<Player> players ;
    //private PlayersRCB players; 
	
	public Teams(String teamName, int totalSix, double netRunRate, boolean isKnockOut, List<Player> players) 
	{
		super();
		this.teamName = teamName;
		this.totalSix = totalSix;
		this.netRunRate = netRunRate;
		this.isKnockOut = isKnockOut;
		this.players = players;
	}

	public String getTeamName()
	{
		return teamName;
	}
	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}
	public int getTotalSix() 
	{
		return totalSix;
	}
    public void setTotalSix(int totalSix) 
    {
		this.totalSix = totalSix;
	}
    public double getNetRunRate()
    {
		return netRunRate;
	}
    public void setNetRunRate(double netRunRate)
    {
		this.netRunRate = netRunRate;
	}
    public boolean isKnockOut() 
    {
		return isKnockOut;
	}
    public void setKnockOut(boolean isKnockOut)
    {
		this.isKnockOut = isKnockOut;
	}
    
	public void printTeams()
	{
		// System.out.println(" >>IPL TEAM - ROYAL CHALLENGERS BANGALORE. \n >>CAPTAIN - Virat Koli. \n >>WICKET KEEPER - AB de villers. \n >>BATSMAN - DevDUtt Padikal \n >>BOWLER - Yuzvendra Chahal \n >>Total of 266 sixes \n >> Net run rate is 0.171 \n >> not been knock out yet");
		System.out.println(teamName);
        System.out.println("PLAYERS:");
        for(Player player: players)
        {
        	System.out.println(player.toString());
           
        }

	    System.out.println("RCS's Total number of Six is :" + totalSix);
		System.out.println("RCS's Net run rate is :" + netRunRate);
	    System.out.println(" has RCB Knocked out :" + isKnockOut);
	}

}
