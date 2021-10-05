package in.java.ipl;

import java.io.FileNotFoundException;

public class ReadStaffThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DataInitializationImpl DI = new DataInitializationImpl() ;
		DI.readMemberDataFromFile();
		
	}

}
