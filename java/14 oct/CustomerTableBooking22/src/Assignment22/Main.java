package Assignment22;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of customers:");
		int n=sc.nextInt();
		String[] custarr=new String[n];
		System.out.println("Enter all "+n+" customers deatils :");
		for(int i=0;i<n;i++) {
			custarr[i]=sc.next();
		}
		//System.out.println((custarr[0].split(","))[1]);
	
			System.out.println("Enter the search type:");
			System.out.println();
			System.out.println("1.By name");
			System.out.println();
			System.out.println("2.By birth date");
			System.out.println();
			System.out.println("3.By rating");	
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("Enter the name of the customer to be searched:");
				String s=sc.next();
				int count=0;
				for(int k=0;k<n;k++) {
					if(s.equals((custarr[k].split(","))[1])) {
						if(count==0) {
							System.out.println("Id Name MobileNumber DateofBirth AverageSpentAmount TotalAmount DateEnrolled Rating");
							System.out.println(custarr[k]);
							count++;
						}
						else {
							System.out.println(custarr[k]);
						}
					}
				}
				count=0;
				
			}
			if(ch==2) {
				System.out.println("Enter the birth date of the customer to be searched:");
				String s=sc.next();
				int count=0;
				for(int k=0;k<n;k++) {
					if(s.equals((custarr[k].split(","))[3])) {
						if(count==0) {
							System.out.println("Id Name Mobile Number DateofBirth Average spent amount Total amount DateEnrolled Rating");
							System.out.println(custarr[k]);
							count++;
						}
						else {
							System.out.println(custarr[k]);
						}
					}
				}
				count=0;
				
			}
			if(ch==3) {
				System.out.println("Enter the birth date of the customer to be searched:");
				String s=sc.next();
				int count=0;
				for(int k=0;k<n;k++) {
					if(s.equals((custarr[k].split(","))[7])) {
						if(count==0) {
							System.out.println("Id Name Mobile Number DateofBirth Average spent amount Total amount DateEnrolled Rating");
							System.out.println(custarr[k]);
							count++;
						}
						else {
							System.out.println(custarr[k]);
						}
					}
				}
				count=0;	
			}
		}
	
}
