package in.java.ipl;

import java.util.List;

public class Team implements ITeams
{
	private static final Player[] player = null;
	private Frenchaices teamName ;
	private int totalSix ;
	private double netRunRate ;
	private boolean isKnockOut ;
   // private List<Player> players ;
   // private List<Member> members ;
    private Players players;
    private Members members;
    
    public Team(Frenchaices name, int totalSix, double netRunRate, boolean isKnockOut, Players players, Members members) {
		super();
		this.teamName = name;
		this.totalSix = totalSix;
		this.netRunRate = netRunRate;
		this.isKnockOut = isKnockOut;
		this.players = players;
		this.members = members;
	}
	//private PlayersRCB players; 
	
	public Frenchaices getTeamName()
	{
		return teamName;
	}
	
	public Members getMembers() {
		return members;
	}

	public void setMembers(Members members) {
		this.members = members;
	}

	public Players getPlayers() {
		return players;
	}

	public static Player[] getPlayer() {
		return player;
	}
	public void setTeamName(Frenchaices teamName)
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
 
    
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(String name, int totalSix2, double netRunRate2, boolean isKnockOut2, Players initPlayers,
			Members initStaff) {
		// TODO Auto-generated constructor stub
	}

	public void printTeams() 
	{
		// System.out.println(" >>IPL TEAM - ROYAL CHALLENGERS BANGALORE. \n >>CAPTAIN - Virat Koli. \n >>WICKET KEEPER - AB de villers. \n >>BATSMAN - DevDUtt Padikal \n >>BOWLER - Yuzvendra Chahal \n >>Total of 266 sixes \n >> Net run rate is 0.171 \n >> not been knock out yet");
		 System.out.println("--------------------------------------------------------------------------------------------");
		 System.out.println(teamName);
        System.out.println("PLAYERS:");
        for(Player player: players.getPlayerList())
        {
        	System.out.println(player.getFullName());
        	System.out.println(player.toString());
           
        }
        System.out.println("--------------------------------------------------------------------------------------------");
    	/*<---------------------------------------------------------------------->*/
        for(Member member: members.getMemberList())
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
	public String toString()
	{
		String teamData = "";
		teamData = teamData.concat(" Team Name " + getTeamName().Name);
		teamData = teamData.concat(System.lineSeparator());
		teamData = teamData.concat(getPlayers().toString());
		teamData = teamData.concat(getMembers().toString());
		
		return teamData;
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

	public void setPlayers(Players players) {
		// TODO Auto-generated method stub
		this.players = players;
		
	}
		
	
	

}
