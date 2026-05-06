import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cname="";
		String counname="";
		String cskill="";
		System.out.println("Enter the number of players:");
		int n=sc.nextInt();
		System.out.println("Do you know the details of the captain? ");
		String ch=sc.next();
		String[] pname=new String[n];
		String[] couname=new String[n];
		String[] pskill=new String[n];
		 if  (ch.equals("yes")) {
			 System.out.println("Enter name of the captain");
			  cname=sc.next();
			 System.out.println("Enter country of the captain");
			 counname=sc.next();
			 System.out.println("Enter skillset of the captain");
			 cskill=sc.next();
			 for(int i=0;i<n;i++) {
				 System.out.println("Enter name of player "+(i+1));
				 pname[i]=sc.next();
				 System.out.println("Enter country of player "+(i+1));
				 couname[i]=sc.next();
				 System.out.println("Enter skillset of player "+(i+1));
				 pskill[i]=sc.next();			 
			 }
			 System.out.println(cname+", "+counname+", "+cskill);
			 System.out.println("Player Details");
			 for(int i=0;i<n;i++) {
				 System.out.println(pname[i]+", "+couname[i]+", "+pskill[i]);
			 }
		 }else 
			 {
			 for(int i=0;i<n;i++) {
				 System.out.println("Enter name of player "+(i+1));
				 pname[i]=sc.next();
				 System.out.println("Enter country of player "+(i+1));
				 couname[i]=sc.next();
				 System.out.println("Enter skillset of player "+(i+1));
				 pskill[i]=sc.next();			 
			 }
				 System.out.println("Exception Occured : java.lang.NullPointerException");
				 System.out.println("Captain details not available");
				 System.out.println("Player Details");
				 for(int i=0;i<n;i++) {
					 System.out.println(pname[i]+", "+couname[i]+", "+pskill[i]);
				 }
			 }

			 
			 
		 

	}

}
