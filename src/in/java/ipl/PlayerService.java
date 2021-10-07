package in.java.ipl;

import java.util.List;

public interface PlayerService 
{

	public List<Player> getPlayersByTeam(Frenchaices f);
	public void addPlayer(Player player);
	public void removePlayer(Player player);
	public void removePlayerBySecondName(String s);
	public List<Player> getBowlersByTeam(Player player);
	public List<Player> getBatsmanByTeam(Player player);
	public void updatePlayer(Player player);
	public Player getPlayerBySecondName(String s);
	
	
}
