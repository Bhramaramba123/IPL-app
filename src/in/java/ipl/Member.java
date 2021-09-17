package in.java.ipl;


public class Member extends Person
{
	enum role{Physio,Coach};

	private role Role;
	
	
	public role getRole() {
		return Role;
	}
	public void setRole(role role) {
		Role = role;
	}
	public Member(String Fname, String Lname, int age,Person.Gender gender, String place, role role) {
		super(Fname, Lname, age, place, gender);
		
		this.Role = role;
	}
	public String toString()
	{
		String MemberData = super.toString();
		MemberData = MemberData.concat(" Role: " + getRole());
		return MemberData ;
	}
	
	
}
