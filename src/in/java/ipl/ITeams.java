package in.java.ipl;

public interface ITeams {
	String getTotalMatchs();
	String getTotalWins();
	String getTotalSix() throws ZeroSixException;
	double getNetRunRate() throws RunRateException;

}
