package in.java.ipl;

import java.util.ArrayList;
import java.util.List;

public class Staff
{
List<Member> staff = new ArrayList<Member>();

public List<Member> getStaff() {
	return staff;
}

public void setStaff(List<Member> staff) {
	this.staff = staff;
}

public Staff(List<Member> staff) {
	super();
	this.staff = staff;
}



}
