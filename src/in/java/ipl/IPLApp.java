package in.java.ipl;

import java.util.ArrayList;
import java.util.List;

public class IPLApp {
	public static void main(String[] args)
	{
		System.out.println("IPL 2021");
		System.out.println("IPL 2021-TEAM MEMBERS DETAILS");
		// System.out.println(" >>IPL TEAM - ROYAL CHALLENGERS BANGALORE. \n >>CAPTAIN - Virat Koli. \n >>WICKET KEEPER - AB de villers. \n >>BATSMAN - DevDUtt Padikal \n >>BOWLER - Yuzvendra Chahal \n >>Total of 266 sixes \n >> Net run rate is 0.171 \n >> not been knock out yet");
		List<Player> cskPlayerList = new ArrayList<Player>();
		
		cskPlayerList.add(new Player("MS Dhoni", 35,"Ranchi",Player.role.Batsman,true,true));
		cskPlayerList.add(new Player("Ambatti Rayudu", 30,"Guntur",Player.role.Batsman,false,false));
		cskPlayerList.add(new Player("Ravindra Jadeja", 30,"Navagam",Player.role.AllRounder,false,false));
		cskPlayerList.add(new Player("Ravichandran Ashwin", 32,"Chenni",Player.role.Bowler,false,false));

		List<Player> rcbPlayerList = new ArrayList<Player>();
		rcbPlayerList.add(new Player("Virat Koli", 30,"Delhi",Player.role.Batsman,true,true));
		rcbPlayerList.add(new Player("Ab de villers", 30,"Bela-Bela",Player.role.Batsman,false,false));
		rcbPlayerList.add(new Player("DevDUtt Padikal", 25,"Bangalore",Player.role.AllRounder,false,false));
		rcbPlayerList.add(new Player("Yuzvendra Chahal", 32,"Jind",Player.role.Bowler,false,false));

		List<Players> cskPlayers = new ArrayList<Players>();
		//cskPlayers.add(new Players("ROYAL CHALLENGERS BANGALORE", 266, 0.171, false,cskPlayerList, cskPlayerList));
		
		Players rcb = new Players(rcbPlayerList);
		Players csk = new Players(cskPlayerList);




		Teams teamRCB = new Teams(Frenchaices.RCB.Name , 266, 0.171, false, rcb.getPlayerList());
		//display(teamRCB.toString());
		display(rcb.toString());
		Teams teamCSK = new Teams(Frenchaices.CSK.Name, 251, 0.181, false, csk.getPlayerList());

		//Teams teamRCB = new Teams("ROYAL CHALLENGERS BANGALORE", 266, 0.171, false,rcbPlayers.getPlayerList());
		//Teams teamCSK = new Teams("CHENNAI SUPER KINGS", 251, 0.181, false, cskPlayers.getPlayerList());
		teamRCB.printTeams();
		teamCSK.printTeams();
		
	
		
		
	}
	public static void display(String message)
	{
		System.out.println(message);
		
	}

}
