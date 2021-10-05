package in.java.ipl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataInitializationImpl implements DataInitialization
{
     Player player = new Player();
     Players players = new Players();
     Member member = new Member();
     Members members = new Members();
     Team team = new Team();
     Teams teams = new Teams();
     
	 List<Player> PlayerList = new ArrayList<Player>();
	 List<Member> MemberList = new ArrayList<Member>();
	 List<Team> TeamList = new ArrayList<Team>();


	@Override
	public Players InitPlayers() 
	{
		// TODO Auto-generated method stub
		//List<Player> PlayerList = new ArrayList<Player>();

		//PlayerList.add(new Player("Virat", "Koli", 30,Person.Gender.MALE,"Delhi",Player.role.Batsman,true,false));
		//PlayerList.add(new Player("Ab", "de villers", 30,Person.Gender.MALE,"Bela-Bela",Player.role.Batsman,false,true));
		//PlayerList.add(new Player("DevDUtt", " Padikal", 25,Person.Gender.MALE,"Bangalore",Player.role.Batsman,false,false));
		//PlayerList.add(new Player("Yuzvendra", "Chahal", 32,Person.Gender.MALE,"Jind",Player.role.Bowler,false,false));
		
		//Players  p1 = new Players(PlayerList);
		
		
			 players = readPlayerDataFromFile();
			 
			 return players;
		
	}

	public Teams readTeamDataFromFile() 
	{
		File file = new File("Resource/Team.txt");
	    Scanner sc = null;
				
	    try {			
	    	sc = new Scanner(file);		
	    } 
	    catch (FileNotFoundException e)
	    {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
	    }  
			    while (sc.hasNextLine())
			    {
					String TeamRecord = sc.nextLine();
					TeamList.add(addTeamToList(TeamRecord));
			      //System.out.println(sc.nextLine());
			    	
			    	
			    }
			    //PlayerList.add(player);
			    teams.setTeamList(TeamList);
		return teams;
	}
	
	
	private Team addTeamToList(String teamRecord) {
		// TODO Auto-generated method stub
		//Members members = new Members();
		String[] IRecord = teamRecord.split(",");
   	 team.setTeamName(Frenchaices.getFranchaicesByString(IRecord[0]));
   	 team.setTotalSix(Integer.parseInt(IRecord[1].trim()));
   	 team.setNetRunRate(Double.parseDouble(IRecord[2].trim()));
   	 team.setKnockOut(Boolean.parseBoolean(IRecord[3].trim()));
   	 
   	 team.setPlayers(players.getPlayersByTeam(team.getTeamName()));
   	 team.setMembers(members.getMembersByTeam(team.getTeamName()));
	
		return team;
	}

	public Players readPlayerDataFromFile() 
	{
		File file =
			      new File("Resource/Players.txt");
			    Scanner sc = null;
				try {
					sc = new Scanner(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  
			    while (sc.hasNextLine())
			    {
					String PlayerRecord = sc.nextLine();
					PlayerList.add(addPlayerToList(PlayerRecord));
			      //System.out.println(sc.nextLine());
			    	
			    	
			    }
			    //PlayerList.add(player);
			    players.setPlayerList(PlayerList);
			    
		return players; 
	}
	
	public Player addPlayerToList(String PlayerRecord)
	{
		String[] IRecord = PlayerRecord.split(",");
    	 player.setFirstName(IRecord[0]);
    	 player.setSecondName(IRecord[1]);
    	 player.setAge(Integer.parseInt(IRecord[2].trim()));
    	if(Person.Gender.MALE.toString().equalsIgnoreCase(IRecord[3]))
    	{	
    	 player.setGender(Person.Gender.MALE);
    	}
    	else
    	{
    		 player.setGender(Person.Gender.FEMALE);
    	}
    	player.setPlace(IRecord[4].trim());
    	
    	switch (IRecord[5].trim())
    	{
		case "BATSMAN": player.setPrimaryRole(Player.role.Batsman);
			break;
		case "BOWLER": player.setPrimaryRole(Player.role.Bowler);
			break;
		case "AllROUNDER": player.setPrimaryRole(Player.role.AllRounder);
			break;

		default:
			break;
		}
    	player.setCaptain(Boolean.parseBoolean(IRecord[6].trim()));
    	player.setWicketKeeper(Boolean.parseBoolean(IRecord[7].trim()));
    	player.setFranchaices(Frenchaices.getFranchaicesByString(IRecord[8].trim()));
    	
    	
    	

	    System.out.println(player.toString());
		return player;
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public Members readMemberDataFromFile() 
	{
		File file = new File("Resource/Staff.txt");
			    Scanner sc = null;
				try {
					sc = new Scanner(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    while (sc.hasNextLine())
			    {
			      //System.out.println(sc.nextLine());
			    
			    	String MemberRecord = sc.nextLine();
			    	Member member = addMemberToList(MemberRecord);
			    	//MemberList.add(member);
			    	members.addMember(member);
			    	
			    }
			    //members.setMembers(MemberList);
			    return members;
	}
	
	

	private Member addMemberToList(String memberRecord) {
		// TODO Auto-generated method stub
	String[] StaffRecord = memberRecord.split(",");
    	member.setFirstName(StaffRecord[0]);
    	member.setSecondName(StaffRecord[1]);
    	member.setAge(Integer.parseInt(StaffRecord[2].trim()));
    	if(Person.Gender.MALE.toString().equalsIgnoreCase(StaffRecord[3]))
    	{	
    	 member.setGender(Person.Gender.MALE);
    	}
    	else
    	{
    		 member.setGender(Person.Gender.FEMALE);
    	}	
    	member.setPlace(StaffRecord[4]);
    	
    	switch (StaffRecord[5].trim())
    	{
		case "Physio": member.setRole(Member.role.Physio);
			break;
		case "Coach": member.setRole(Member.role.Coach);
			break;
		
		default:
			break;
		}
    member.setFrenchaices(Frenchaices.getFranchaicesByString(StaffRecord[6]));
    	 System.out.println(member.toString());

		return member;
	}
	
	
	
	
	
	
	
	
	

	@Override
	public Player InitPlayer() {
		
		return null;
	}

	@Override
	public Members InitMembers() 
	{
		// TODO Auto-generated method stub
		//List<Member> MemberList = new ArrayList<Member>();
		//StaffList.add(new Member("Mike", "Hesson", 50, Person.Gender.MALE, "NZ",Member.role.Coach));
		//StaffList.add(new Member("Navnita", "Gautam", 30, Person.Gender.FEMALE, "Punjab", Member.role.Physio));
		
		//Members s1 = new Members(MemberList);
		//return s1;
		members = readMemberDataFromFile();
		return members;
	}

	@Override
	public Member InitMember() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team InitTeam() 
	{
		// TODO Auto-generated method stub
		
		Team teamRCB = new Team(Frenchaices.RCB.Name , 0, 0.537, false, InitPlayers(),InitMembers());
		//Teams teamCSK = new Teams(Frenchaices.CSK.Name, 251, 0.181, false, csk.getPlayerList(),cskStaff.getStaff());
		return teamRCB;
	}

	@Override
	public Teams InitTeams() {
		// TODO Auto-generated method stub
		InitPlayers();
		InitMembers();
		return readTeamDataFromFile();
		
	}

	public void deletePlayerFromList(String secondName) {
		// TODO Auto-generated method stub

		for(Player p : PlayerList)
		{
			if(p.getSecondName().equals(secondName))
			{
		       PlayerList.remove(player); 
		    }
		}
		
	}

}
