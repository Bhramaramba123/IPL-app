package in.java.ipl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlayerServiceImpl implements PlayerService
{
	
    public List<Player> playerList = new ArrayList<Player>();

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	public PlayerServiceImpl(List<Player> playerList) {
		super();
		this.playerList = playerList;
	}

	public PlayerServiceImpl()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		String PlayerDetails="";
		/*
		 * for(int i=0;i<playerList.size();i++) { try {
		 * System.out.println(playerList.get(i)); } catch ( IndexOutOfBoundsException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); } }
		 */
		
		
		
		for(Player player: playerList)
		{
		PlayerDetails = PlayerDetails.concat(player.toString());
		PlayerDetails = PlayerDetails.concat(System.lineSeparator());
		}
		return PlayerDetails;
	}

	public List<Player> getPlayersByTeam(Frenchaices f) {
		// TODO Auto-generated method stub
		List<Player> subPlayersList = new ArrayList<Player>();
		//PlayerServiceImpl subPlayers = new PlayerServiceImpl();
		for (Player p: getPlayerList()) 
		{	
		if(p.getFranchaices() == f)
		{
			subPlayersList.add(p);
		}
			
			
		}
		//subPlayers.setPlayerList(subPlayersList);
		
		return subPlayersList;
	}

	public void addPlayer(Player player) {
		// TODO Auto-generated method stub
		playerList.add(player);
		
	}

	@Override
	public void removePlayer(Player player) {
		// TODO Auto-generated method stub
		
		playerList.remove(player);
		System.out.println(toString());
	}

	@Override
	public void removePlayerBySecondName(String s) {
		// TODO Auto-generated method stub
		Player deletePlayer = getPlayerBySecondName(s);
		System.out.println("delete player " + deletePlayer.toString());
		removePlayer(deletePlayer);
		
		
	}

	@Override
	public List<Player> getBowlersByTeam(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getBatsmanByTeam(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePlayer(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player getPlayerBySecondName(String s) {
		// TODO Auto-generated method stub
   // Player deletePlayer = new Player();
		
		//int index = 0;
		//System.out.println("" + players.getPlayerList().size());
		
		for(Player p1 : getPlayerList())
		{
	         
			
		 if(p1.getSecondName().trim().equals(s.trim()))
	      {
				 return p1;
	      }
	         
		}
		return null;
		
	}
	
	
	

}
