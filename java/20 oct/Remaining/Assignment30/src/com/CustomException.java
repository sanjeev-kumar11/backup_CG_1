package com;


import java.util.Scanner;

public class CustomException {
	public static void main(String[] arg)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number team name:");
		String a=sc.next();
		System.out.println("Enter the number of players suggested");
		int n=sc.nextInt();
		int[]id=new int[n];
		String[] name= new String [n];
		int count=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter player "+(i+1)+" details");
			id[i] = sc.nextInt();
			name[i]=sc.next();	
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(id[i]==id[j]) {
					count++;
				}
			}
			
		}
		if(count>0) {
			System.out.println("DuplicateIdException: Player Id must be unique");
		}
		else 
	{
			for (int i=0;i<n;i++)
			{
				System.out.println(id[i] + " "+ name[i]);
			}
			
		}
		
		
		}
		
	
		

}
