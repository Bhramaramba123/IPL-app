package in.java.ipl;

import java.io.FileNotFoundException;

public class ReadPlayerThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DataInitializationImpl DI = new DataInitializationImpl() ;
		DI.readPlayerDataFromFile();
		
	}

}
