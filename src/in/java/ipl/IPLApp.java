package in.java.ipl;




public class IPLApp {
	 private static String [] RCBplayers = {" >> CAPTAIN - Virat Koli",
			">> WICKET KEEPER - AB de villers",
			">> BATSMAN - DevDUtt Padikal",
			">> BOWLER - Yuzvendra Chahal"};
	 
	 public static String [] CSKPlayers = {" >> CAPTAIN - MS Dhoni",
			 ">> WICKET KEEPER - MS Dhoni",
			 ">> BATSMAN - Ambatti Rayudu",
			 ">> BOWLER - Ravindra Jadeja"};

	public static void main(String[] args)
	{
	

	
		
		System.out.println("IPL 2021");
		
		System.out.println("IPL 2021-TEAM MEMBERS DETAILS");
		// System.out.println(" >>IPL TEAM - ROYAL CHALLENGERS BANGALORE. \n >>CAPTAIN - Virat Koli. \n >>WICKET KEEPER - AB de villers. \n >>BATSMAN - DevDUtt Padikal \n >>BOWLER - Yuzvendra Chahal \n >>Total of 266 sixes \n >> Net run rate is 0.171 \n >> not been knock out yet");
      
		Teams teamRCB = new Teams(">> IPL TEAM - ROYAL CHALLENGERS BANGALORE", 266, 0.171, false, RCBplayers);
		Teams teamCSK = new Teams(">> IPL TEAM - Channai Super kings", 263, 0.177, false, CSKPlayers);
		// teamRCB.printTeams();
		// teamCSK.printTeams();
		
		teamRCB.setTotalSix(344);
		display("display starts");
		display(teamRCB.getTeamName());
		display("Total No of Six is =" +teamRCB.getTotalSix());
		//display(String.valueOf(teamRCB.getTotalSix()) );
		teamRCB.getTeamName();
		teamRCB.getTotalSix();
		
		
	}
	public static void display(String message)
	{
		System.out.println(message);
	}

}
