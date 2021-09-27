package in.java.ipl;

import java.util.List;

public class Teams implements ITeams
{
	private static final Player[] player = null;
	private String teamName ;
	private int totalSix ;
	private double netRunRate ;
	private boolean isKnockOut ;
    private List<Player> players ;
    private List<Member> members ;
    private Players players1;
    private Staff staff1;
    
    public Teams(String teamName, int totalSix, double netRunRate, boolean isKnockOut, Players players1, Staff staff1) {
		super();
		this.teamName = teamName;
		this.totalSix = totalSix;
		this.netRunRate = netRunRate;
		this.isKnockOut = isKnockOut;
		this.players = players1.getPlayerList();
		this.members = staff1.getStaff();
	}
	//private PlayersRCB players; 
	
	public String getTeamName()
	{
		return teamName;
	}
	public List<Member> getMembers() {
		return members;
	}
	public void setMember(List<Member> member) {
		this.members = member;
	}
	public static Player[] getPlayer() {
		return player;
	}
	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}
	
    public void setTotalSix(int totalSix) 
    {
		this.totalSix = totalSix;
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
    public Teams(String teamName, int totalSix, double netRunRate, boolean isKnockOut, List<Player> players,
			List<Member> members) {
		super();
		this.teamName = teamName;
		this.totalSix = totalSix;
		this.netRunRate = netRunRate;
		this.isKnockOut = isKnockOut;
		this.players = players;
		this.members = members;
	}
    
	public void printTeams() 
	{
		// System.out.println(" >>IPL TEAM - ROYAL CHALLENGERS BANGALORE. \n >>CAPTAIN - Virat Koli. \n >>WICKET KEEPER - AB de villers. \n >>BATSMAN - DevDUtt Padikal \n >>BOWLER - Yuzvendra Chahal \n >>Total of 266 sixes \n >> Net run rate is 0.171 \n >> not been knock out yet");
		 System.out.println("--------------------------------------------------------------------------------------------");
		 System.out.println(teamName);
        System.out.println("PLAYERS:");
        for(Player player: players)
        {
        	System.out.println(player.getFullName());
        	System.out.println(player.toString());
           
        }
        System.out.println("--------------------------------------------------------------------------------------------");
    	/*<---------------------------------------------------------------------->*/
        for(Member member: members)
        {
        	System.out.println(member.toString());
           
        }
    	/*<---------------------------------------------------------------------->*/
		try
		{
			System.out.println("RCS's Total number of Six is :" + getTotalSix());
		}
		
		catch(ZeroSixException |ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
		System.out.println(e);	
		}
		
		/*<---------------------------------------------------------------------->*/
	    try
	    {
	    	System.out.println("RCS's Net run rate is :" + getNetRunRate()); 	
	    }
	    catch (RunRateException e) 
	    {
	    	System.out.println(e);	
	    }
		
	    System.out.println(" has RCB Knocked out :" + isKnockOut);
	    
	    
	}

	
	@Override
	public String toString() {
		return "Teams [netRunRate=" + netRunRate + "]";
	}
	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	@Override
	public String getTotalMatchs() {
		// TODO Auto-generated method stub
		return "TotalMatchs";
	}
	@Override
	public String getTotalWins() {
		// TODO Auto-generated method stub
		return "TotalWins";
	}
	@Override
	public String getTotalSix() 
	{
		// TODO Auto-generated method stub
		if(totalSix > 0)
		{
		return "TotalSix";
		}
		else
		{
			throw new ZeroSixException("Total six Cannot be Zero");
		}
	}
	
	
	@Override
	public double getNetRunRate() {
		if(netRunRate <=1)
		{
		return netRunRate;
		}
		else
		{
			throw new RunRateException("NetRunRate cannot be greater than 1");
		}
	}
		
	
	

}
