package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
public static void main(String[] arg) throws IOException {
	
	double runRate;
	
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the total runs scored:");
    double runScored = Double.parseDouble(reader.readLine());
	System.out.println("Enter the total over faced");
    double totalOverPlayed= Double.parseDouble(reader.readLine());
    
    try{
    	if (0<totalOverPlayed&&totalOverPlayed<=20)
    	{
		runRate=runScored/totalOverPlayed;
		System.out.println("Run Rate: "+ runRate);
	}	else {
	System.out.println("OverRangeException: Over is not in the specified range");
	}
    }
    
	catch( Exception e) {
		System.out.println("java.lang.ArithmeticException");
	}

    }
	
}