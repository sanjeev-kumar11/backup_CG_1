
import java.util.Scanner;
class FibonacciSequence
{
  public static void main(String[] args)
{
	Scanner sc=new Scanner (System.in);
	System.out.print("enter a no :");
	int n=sc.nextInt();
    int firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series  upto " + n);
    int nextTerm=1;
    //System.out.print(firstTerm + " ");
    while (nextTerm<n)
    {
	  System.out.print(nextTerm + "  ");
      nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
	  
    } 
	  
 }  
}