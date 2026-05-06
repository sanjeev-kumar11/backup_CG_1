 //permutation

import java.util.*;    
public class Permutation
{    
public static void main(String args[])    
{    
//totalobjects=n, selectedobjects=r  
int totalobjects, selectedobject, permutation, factorial1, factorial2;    
//creating a constructor of the Scanner class  
Scanner sc = new Scanner(System.in);    
System.out.println("Enter the Value of n and r: ");    
//reading the value of n   
totalobjects = sc.nextInt();    
//reading the value of r  
selectedobject = sc.nextInt();    
factorial1 = totalobjects;    
for (int i = totalobjects - 1; i >= 1; i--)    
{    
factorial1 = factorial1 * i;    
}    
int number;    
number = totalobjects - selectedobject;    
factorial2 = number;    
for (int i = number - 1; i >= 1; i--)    
{    
//determining the factorial  
factorial2 = factorial2 * i;    
}    
permutation = factorial1 / factorial2;    
//prints the permutation  
System.out.println("The permutation of P(n, r) = "+permutation);    
}    
}    