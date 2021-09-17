package in.java.ipl;

import java.util.ArrayList;
import java.util.List;

public class Players 
{
	
    public List<Player> playerList = new ArrayList<Player>();

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	public Players(List<Player> playerList) {
		super();
		this.playerList = playerList;
	}

	@Override
	public String toString() 
	{
		String PlayerDetails="";
		for(Player player: playerList)
		{
		PlayerDetails = PlayerDetails.concat(player.toString());
		PlayerDetails = PlayerDetails.concat(System.lineSeparator());
		}
		return PlayerDetails;
	}
	
	
	

}
