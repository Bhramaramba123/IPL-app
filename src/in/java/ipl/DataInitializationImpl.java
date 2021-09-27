package in.java.ipl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataInitializationImpl implements DataInitialization
{
     Player player = new Player();
     

	@Override
	public Players InitPlayers() {
		// TODO Auto-generated method stub
		List<Player> PlayerList = new ArrayList<Player>();

		//PlayerList.add(new Player("Virat", "Koli", 30,Person.Gender.MALE,"Delhi",Player.role.Batsman,true,false));
		//PlayerList.add(new Player("Ab", "de villers", 30,Person.Gender.MALE,"Bela-Bela",Player.role.Batsman,false,true));
		//PlayerList.add(new Player("DevDUtt", " Padikal", 25,Person.Gender.MALE,"Bangalore",Player.role.Batsman,false,false));
		//PlayerList.add(new Player("Yuzvendra", "Chahal", 32,Person.Gender.MALE,"Jind",Player.role.Bowler,false,false));
		
		Players  p1 = new Players(PlayerList);
		
		return p1;
	}
	
	public Players readPlayerDataFromFile() throws FileNotFoundException
	{
		File file =
			      new File("Resource/Players.txt");
			    Scanner sc = new Scanner(file);
			  String[] IRecord = null;
			    while (sc.hasNextLine())
			    {
			      //System.out.println(sc.nextLine());
			    	
			    	String PlayerRecord = sc.nextLine();
			    	IRecord = PlayerRecord.split(",");
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
			    }
		return null; 
	}

	@Override
	public Player InitPlayer() {
		
		return null;
	}

	@Override
	public Staff InitStaff() {
		// TODO Auto-generated method stub
		List<Member> StaffList = new ArrayList<Member>();
		//StaffList.add(new Member("Mike", "Hesson", 50, Person.Gender.MALE, "NZ",Member.role.Coach));
		//StaffList.add(new Member("Navnita", "Gautam", 30, Person.Gender.FEMALE, "Punjab", Member.role.Physio));
		
		Staff s1 = new Staff(StaffList);
		return s1;
	}

	@Override
	public Member InitMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teams InitTeam() {
		// TODO Auto-generated method stub
		
		Teams teamRCB = new Teams(Frenchaices.RCB.Name , 0, 0.537, false, InitPlayers(),InitStaff());
		//Teams teamCSK = new Teams(Frenchaices.CSK.Name, 251, 0.181, false, csk.getPlayerList(),cskStaff.getStaff());
		return teamRCB;
	}

}
