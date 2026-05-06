package ArthAndNumException27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArthematicAndNumberException{
public static void main(String[] arg) throws IOException {
	
	int runRate;
	
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the total runs scored:");
    int runScored =Integer.parseInt(reader.readLine());
	System.out.println("Enter the total over faced");
    int totalOverPlayed= Integer.parseInt(reader.readLine());
    
    try{
		runRate=runScored/totalOverPlayed;
		System.out.println("Run Rate: "+ runRate);
	}
    
	catch( Exception e) {
		//if (runScored/totalOverPlayed==0)
		{
		System.out.println("java.lang.ArithmeticException");
	}
}
    }
	
}

