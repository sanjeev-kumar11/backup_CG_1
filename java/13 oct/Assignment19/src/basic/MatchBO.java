package basic;

public class MatchBO {

	public void printAllMatchDetails(String[] matchList) {
		for (int i = 0; i < matchList.length; i++)
		{
            System.out.println(matchList[i] + " ");
        }
	}
	void printMatchDetailsWithOutcomeStatus(String[] matchlist, String outcomeStatus)
		{
			int count=0;
			 for (int i = 0; i <matchlist.length; i++)
			 {
			      String dp = matchlist[i];
			      boolean check = dp.contains(outcomeStatus); 
			      if(check)
			      {
			        System.out.println("Match Details "+matchlist[i]);
			        count++;
			      }}
			if(count==0) //To check if there is no outcomeStatus found
			{
			 System.out.println("Outcome Status not Found");
			}}
	void printMatchDetailsWithOutcomeWinnerTeam(String[] matchlist, String outcomeWinnerTeam)
		{
			 for (int i = 0; i <matchlist.length; i++)
			 {
			      String dp = matchlist[i];
			      boolean check = dp.contains(outcomeWinnerTeam); 
			      if(check)
			      {
			        System.out.println("Match Details "+matchlist[i]);
			        count++;
			      }}
			if(count==0) //To check if there is no outcomeWinnerTeam found
			{
			 System.out.println("outcome Winner Team not Found");
			}}
	}

