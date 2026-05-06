import java.util.Scanner;
public class CaseChanger{
     public static void main(String []args){
		 Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Sentance");
      String a = sc.nextLine();
      
      //Upper Case
      System.out.println("Upper Case: "+a.toUpperCase() );
      
      //Lower Case
      System.out.println("Lower Case: "+a.toLowerCase() );
      
      //Capitalize
	  String words[]=a.split("\\s");
      String newString ="";
      for(String w: words){
          String first = w.substring(0,1);
          String rest = w.substring(1); 
          newString+=first.toUpperCase()+ rest+ " ";  
        }  
       System.out.println("Capitalize: "+newString.trim());
      
      
      //Sentence case:
      for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == ' ') {
                char c;
                char d;
                c = a.charAt((i + 1));
                d = Character.toUpperCase(c);
                a.replace(a.charAt((i + 1)),d);
            }
        }
        System.out.println("Sentence case: "+a);
        
        //Invert
        StringBuffer str= new StringBuffer(a);
        int ln = str.length();
        for (int i = 0; i < ln; i++) {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i + 1,
                            Character.toUpperCase(c) + "");
            else
                str.replace(i, i + 1,
                            Character.toLowerCase(c) + "");
        }
        System.out.println("Invert: "+str);
   }
}