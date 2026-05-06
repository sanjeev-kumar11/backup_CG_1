package point2d;

public class Point2D {
	double x_cordi;
	double y_cordi;
	Point2D(double d,double e){                             //3.1
		x_cordi = d;
		y_cordi = e;
	}
	public String getDetails()                              //3.2
	{
	   return "Point ("+x_cordi+","+y_cordi+")";
	}
	
	public Boolean isEqual(double x,double y)               //3.3
	{
		if (x_cordi==x && y_cordi==y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String createNewPoint(double xoff,double yoff)   //3.4
	{
		double np_x = x_cordi+xoff;
		double np_y = y_cordi+yoff;
		return "New Point is ("+np_x+","+np_y+")";
	}
	
	double  calcDistance(double x1,double y1)               //3.5
	{
		double distance=Math.sqrt(Math.pow((x_cordi-x1), 2) + Math.pow((y_cordi-y1), 2));
		return distance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point2D p1 = new Point2D(5.0,3.0);
		
		String gd = p1.getDetails();
		System.out.println(gd);
		
		Boolean res = p1.isEqual(5.0, 1.0);
		System.out.println(res);
		
		double d = p1.calcDistance(3.0,5.0);
		System.out.println(d);
		
		String np = p1.createNewPoint(2.0, -2.0);
		System.out.println(np);
		
	}

}


