package in.java.ipl;

import java.io.IOException;
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
		for(int i=0;i<playerList.size();i++) 
		{
			try  {
				System.out.println(playerList.get(i));
			} catch ( IndexOutOfBoundsException e)
					 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		for(Player player: playerList)
		{
		PlayerDetails = PlayerDetails.concat(player.toString());
		PlayerDetails = PlayerDetails.concat(System.lineSeparator());
		}
		return PlayerDetails;
	}
	
	
	

}
