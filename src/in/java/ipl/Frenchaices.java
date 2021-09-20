package in.java.ipl;

public enum Frenchaices 
{
	RCB("*ROYAL CHALLENGERS BANGALORE*","RCB", "Bangalore") ,
	CSK("*CHENNAI SUPER KINGS*","CSK","Chennai");
	
	String Name;
	String Shortname;
	String city;
	
	private Frenchaices(String name, String shortname, String city)
	{
		Name = name;
		Shortname = shortname;
		city = city;
	}
}
