package basic;

public class Match {
	private String date;
	private String teamOne;
	private String teamTwo;
	private String venue;
	Outcome outcome;
	
public Match(String date, String teamOne, String teamTwo, String venue, Outcome outcome)
{
		super();
		this.date = date;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.venue = venue;
		this.outcome = outcome;
}
public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getTeamOne() {
	return teamOne;
}

public void setTeamOne(String teamOne) {
	this.teamOne = teamOne;
}

public String getTeamTwo() {
	return teamTwo;
}

public void setTeamTwo(String teamTwo) {
	this.teamTwo = teamTwo;
}

public String getVenue() {
	return venue;
}

public void setVenue(String venue) {
	this.venue = venue;
}
@Override
public String toString() {
	String.format(date,teamOne,teamTwo,venue,outcome);
	return super.toString();
}
}
