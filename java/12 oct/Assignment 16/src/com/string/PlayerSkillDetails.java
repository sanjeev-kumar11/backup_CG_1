package com.string;

import java.util.Scanner;

public class PlayerSkillDetails{
	
	private String name,country,skill;
	
	public void Player(String name,String country,String skill){
		this.name=name;
		this.country=country;
		this.skill=skill;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Number of players:");
		String []playerName=new String[sc.nextInt()];
		
		String[]country=new String[playerName.length];
		
		String []skill=new String[playerName.length];
		
		
		for(int i=0;i<playerName.length;i++)
		{
			System.out.println("Enter the name of " + (i+1) + " player: ");
			playerName[i]=sc.next();
			System.out.println("Enter Country name: ");
			country[i]=sc.next();
			System.out.println("Enter Skill: ");
			skill[i]=sc.next();			
		}
		
		int choice;//for choice
		String skillCheck;
		
		
			 System.out.println("Menu:"
					+ "1-View Details   "
					+ "2-Filter Player By Skill   "
					+ "3-Exit");
				choice= sc.nextInt();
		 
				
		switch (choice)
		{
			case 1 :for(int i=0; i<playerName.length;i++) {
						System.out.println("Player" + (i+1));
						System.out.println(playerName[i]);
						System.out.println("Country");
						System.out.println(country[i]);
						System.out.println("Skill");
						System.out.println(skill[i]);
					}
					break;
			case 2: System.out.println("Enter Skill: ");
					skillCheck= sc.next();
					for(int i=0;i<playerName.length;i++) {
						if(skillCheck.equals(skill[i])) {
							for(int j=0; i<playerName.length;j++) {
								System.out.println("Player");
								System.out.println(playerName[j]);
								System.out.println("Country");
								System.out.println(country[j]);
								System.out.println("Skill");
								System.out.println(skill[j]);
							}
						}
						else System.out.println("Please enter a valid skill");
						break;
					}
			case 3: System.out.println("file cosed.");
					System.exit(0);
					
			}
	}

}