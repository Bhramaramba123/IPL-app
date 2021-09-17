package in.java.ipl;

public enum Frenchaices 
{
	//"ROYAL CHALLENGERS BANGALORE"
	//"CHENNAI SUPER KINGS"
	RCB("*ROYAL CHALLENGERS BANGALORE*","RCB", "Bangalore") ,
	CSK("*CHENNAI SUPER KINGS*","CSK","Chennai");
	
	String Name;
	String Shortname;
	String city;
	
	
	
	private Frenchaices(String name, String shortname, String city) {
		Name = name;
		Shortname = shortname;
		city = city;
	}
	
	
	
}
