import java.util.Scanner;
public class MoneyManagement{

     public static void main(String []args){
         //enter an amount you earn in this month
		 Scanner sc= new Scanner(System.in);
		System.out.print("Enter your salary :");
         int num = sc.nextInt();
         System.out.println("NEC: "+55*num/100);
         System.out.println("FFA: "+10*num/100);
         System.out.println("EDU: "+10*num/100);
         System.out.println("LTSS: "+10*num/100);
         System.out.println("PLAY: "+10*num/100);
         System.out.println("GIVE: "+5*num/100);
     }
}