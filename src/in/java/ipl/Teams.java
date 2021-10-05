package in.java.ipl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Teams 
{
	
    public List<Team> TeamList = new ArrayList<Team>();

	public List<Team> getTeamList() {
		return TeamList;
	}

	public void setTeamList(List<Team> TeamList) {
		this.TeamList = TeamList;
	}

	public Teams(List<Team> TeamList) {
		super();
		this.TeamList = TeamList;
	}

	public Teams()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		String TeamDetails="";
		
		
		
		
		
		for(Team Team: TeamList)
		{
		TeamDetails = TeamDetails.concat(Team.toString());
		TeamDetails = TeamDetails.concat(System.lineSeparator());
		}
		return TeamDetails;
	}
	
	
	

}
