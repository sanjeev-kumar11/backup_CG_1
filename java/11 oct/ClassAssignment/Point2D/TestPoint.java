package point2d;

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);               //3.6
		System.out.println("Enter the x co-ordinate:");
		double x_u = sc.nextDouble();
		System.out.println("Enter the y co-ordinate:");
		double y_u = sc.nextDouble();
		
		System.out.println("Enter the x co-ordinate:");
		double x1_u = sc.nextDouble();
		System.out.println("Enter the y co-ordinate:");
		double y1_u = sc.nextDouble();
		
		sc.close();
		
		Point2D pt1 = new Point2D(x_u,y_u);           
		Point2D pt2 = new Point2D(x1_u,y1_u);
		
		String gdt = pt1.getDetails();                    //3.7
		System.out.println(gdt);
		String gdt1 = pt2.getDetails();
		System.out.println(gdt1);
		
		Boolean resTest = pt1.isEqual(x1_u, y1_u);       //3.8
		System.out.println(resTest);
		
		String npt = pt1.createNewPoint(2.0, -2.0);      //3.9
		System.out.println(npt);
		
		double dt = pt1.calcDistance(x1_u, y1_u);        //3.10
		System.out.println(dt);


	}

}