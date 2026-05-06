package basic;

public class Outcome {
	private String status;
	private String winnerTeam;
	
public Outcome() {
	status = "abc";
	winnerTeam = "CSK";
}
public Outcome(String status, String winnerTeam) {
	super();
	this.status = status;
	this.winnerTeam = winnerTeam;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getWinnerTeam() {
	return winnerTeam;
}
public void setWinnerTeam(String winnerTeam) {
	this.winnerTeam = winnerTeam;
}
@Override
public String toString() {
	String.format(status, winnerTeam);
	return super.toString();
}

}
