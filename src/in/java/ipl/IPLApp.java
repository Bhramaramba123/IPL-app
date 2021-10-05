package in.java.ipl;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPLApp
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("IPL 2021");
		System.out.println("IPL 2021-TEAM MEMBERS DETAILS");
		System.out.println("-------------------------------------------------------------");
		// System.out.println(" >>IPL TEAM - ROYAL CHALLENGERS BANGALORE. \n >>CAPTAIN - Virat Koli. \n >>WICKET KEEPER - AB de villers. \n >>BATSMAN - DevDUtt Padikal \n >>BOWLER - Yuzvendra Chahal \n >>Total of 266 sixes \n >> Net run rate is 0.171 \n >> not been knock out yet");
		//Players details and members details are added for CSK TEAM
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		ReadPlayerThread PlayerThread = new ReadPlayerThread();
		Thread t1 = new Thread(PlayerThread , "Player Thread");
		//t1.start();
		//t1.join();
		//System.out.println(t1.getName());
		
		ReadStaffThread StaffThread = new ReadStaffThread();
		Thread t2 = new Thread(StaffThread , "Staff Thread");
		//t2.start();
		//t2.join();
		//System.out.println(t2.getName());
		DataInitializationImpl DI = new DataInitializationImpl();
		//DI.readTeamDataFromFile();
		DI.InitTeams().toString();
		System.out.println("-------------------------------------------------------------");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Second name to delete the player Entry in PlayerList");
		String secondName = sc.nextLine();
	    DI.deletePlayerFromList(secondName);
		 //System.out.println(secondName);
		 
		
		 
		
		
		/*
		 * DataInitializationImpl DI = new DataInitializationImpl() ; //Teams
		 * teamsObject = DI.InitTeam(); try { DI.readPlayerDataFromFile(); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } System.out.println(
		 * "----------------------------------------------------------------------------"
		 * ); try { DI.readStaffDataFromFile(); } catch (FileNotFoundException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
		
		/*
		 * List<Player> cskPlayerList = new ArrayList<Player>(); cskPlayerList.add(new
		 * Player("Mahendra Singh", "Dhoni", 35, Person.Gender.MALE, "Ranchi",
		 * Player.role.Batsman, true,true)); cskPlayerList.add(new Player("Ambatti",
		 * "Rayudu", 30,Person.Gender.MALE, "Guntur",Player.role.Batsman,false,false));
		 * cskPlayerList.add(new Player("Ravindra", "Jadeja", 30,Person.Gender.MALE,
		 * "Navagam",Player.role.AllRounder,false,false)); cskPlayerList.add(new
		 * Player("Ravichandran"," Ashwin", 32,Person.Gender.MALE,
		 * "Chenni",Player.role.Bowler,false,false));
		 * 
		 * 
		 * List<Member> cskStaffList = new ArrayList<Member>(); cskStaffList.add(new
		 * Member("Stephen", "Fleming", 40, Person.Gender.MALE,
		 * "NZ",Member.role.Coach)); cskStaffList.add(new Member("Tommy", "Simsek", 45,
		 * Person.Gender.MALE, "NZ",Member.role.Physio));
		 * 
		 * //Players details and members details are added for CSK TEAM List<Player>
		 * rcbPlayerList = new ArrayList<Player>(); rcbPlayerList.add(new
		 * Player("Virat", "Koli",
		 * 30,Person.Gender.MALE,"Delhi",Player.role.Batsman,true,false));
		 * rcbPlayerList.add(new Player("Ab", "de villers",
		 * 30,Person.Gender.MALE,"Bela-Bela",Player.role.Batsman,false,true));
		 * rcbPlayerList.add(new Player("DevDUtt", " Padikal",
		 * 25,Person.Gender.MALE,"Bangalore",Player.role.Batsman,false,false));
		 * rcbPlayerList.add(new Player("Yuzvendra", "Chahal",
		 * 32,Person.Gender.MALE,"Jind",Player.role.Bowler,false,false));
		 * 
		 * List<Member> rcbStaffList = new ArrayList<Member>(); rcbStaffList.add(new
		 * Member("Mike", "Hesson", 50, Person.Gender.MALE, "NZ",Member.role.Coach));
		 * rcbStaffList.add(new Member("Navnita", "Gautam", 30, Person.Gender.FEMALE,
		 * "Punjab", Member.role.Physio));
		

		
		
		List<Players> cskPlayers = new ArrayList<Players>();
		//cskPlayers.add(new Players("ROYAL CHALLENGERS BANGALORE", 266, 0.171, false,cskPlayerList, cskPlayerList));
		
		Players rcb = new Players(rcbPlayerList);
		Players csk = new Players(cskPlayerList);
        Staff rcbStaff = new Staff(rcbStaffList);
        Staff cskStaff = new Staff(cskStaffList);
        



		Teams teamRCB = new Teams(Frenchaices.RCB.Name , 0, 0.537, false, rcb.getPlayerList(),rcbStaff.getStaff());
		//display(teamRCB.toString());
		display(rcb.toString());
		Teams teamCSK = new Teams(Frenchaices.CSK.Name, 251, 0.181, false, csk.getPlayerList(),cskStaff.getStaff());

		//Teams teamRCB = new Teams("ROYAL CHALLENGERS BANGALORE", 266, 0.171, false,rcbPlayers.getPlayerList());
		//Teams teamCSK = new Teams("CHENNAI SUPER KINGS", 251, 0.181, false, cskPlayers.getPlayerList());
		teamRCB.printTeams();
		teamCSK.printTeams();
		
	    teamRCB.toString();
	    teamCSK.toString();
	     */
	    display("============================================================");
		//teamsObject.printTeams();
	}
	
	
	
	
	public static void display(String message)
	{
		System.out.println(message);
		
	}
	
	
	

}
