package basic;

import java.util.Scanner;

public abstract class OutcomeTest {
	
	public static MatchBO mat;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		MatchBO mat = new MatchBO();
		System.out.println("Enter number of Matches: ");
		int n = sc.nextInt();
		String[] matchlist = new String[n];
		for (i = 0;i<n;i++) {
			System.out.println("Enter Match "+(i+1)+" details");
			System.out.println();
			
			System.out.println("Enter Match Date: ");
			sc.nextLine();
			String date = sc.nextLine();
			System.out.println("Enter Team1 Name: ");
			String teamone = sc.next();
			System.out.println("Enter Team2 Name: ");
			String teamtwo = sc.next();
			System.out.println("Enter Venue: ");
			String venue = sc.next();
			System.out.println("Enter Status: ");
			String status = sc.next();
			System.out.println("Enter Winner Team: ");
			String winnerTeam = sc.next();
			
			String as = date+" "+teamone+" "+teamtwo+" "+venue+" "+status+" "+winnerTeam+" ";
			matchlist[i] = as;
		}
		
		for (int s=1;s>=1;s++) {
			
			System.out.println("Menu");
			System.out.println("1.View match details");
			System.out.println("2.Filter match details with outcome status");
			System.out.println("3.Filter match details with outcome winner team");
			System.out.println("4.Exit");
			System.out.println("Enter Your Choice: ");
			int choice = sc.nextInt();
			if (choice ==1 ) {
				mat.printAllMatchDetails(matchlist);
			}
			else if ( choice ==2) {
				System.out.println("Enter OutCome Status: ");
				String outcomeStatus = sc.next();
				mat.printMatchDetailsWithOutcomeStatus(matchlist, outcomeStatus);
			}
			else if(choice ==3) {
				System.out.println("Enter outcome winner team: ");
				String outcomeWinnerTeam = sc.next();
				mat.printMatchDetailsWithOutcomeWinnerTeam(matchlist, outcomeWinnerTeam);
			}
			else if(choice ==4){
				System.exit(0);
			}
		}
	}

}
