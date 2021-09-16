package in.java.ipl;

import java.util.ArrayList;
import java.util.List;

public class Players 
{
public List<Player> playerList = new ArrayList<Player>();

public List<Player> getPlayerList()
{
	return playerList;
}

public void setPlayerList(List<Player> playerList)
{
	this.playerList = playerList;
}

public Players(List<Player> playerList)
{
	super();
	this.playerList = playerList;
}

private String getPrimaryRole() {
	// TODO Auto-generated method stub
	return null;
}

private String getName() {
	// TODO Auto-generated method stub
	return null;
}



}
