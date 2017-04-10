/**
 * Represents a point in terms
 * of x & y coordinate
 * @author Ankita Koratkar
 * @version Project 1
 * @version CPE102-01
 */
public class CartesianPoint implements Point {
	
	private double xCoord;
	private double yCoord;
	
	public CartesianPoint(double xCoord, double yCoord){
		
		this.xCoord = xCoord;
		this.yCoord = yCoord;		
	}
	
	public double xCoordinate(){
		return xCoord;
	}
	
	public double yCoordinate(){
		return yCoord;	
	}
	
	public double radius(){
		double radius;
		radius = Math.hypot(xCoord, yCoord);
		return radius;	
	}
	
	public double angle(){
		double angle;
		angle = Math.atan2(yCoord,xCoord);
		return angle;	
	}
	
	public double distanceFrom(Point other){
		double xCoord2 = other.xCoordinate();
		double yCoord2 = other.yCoordinate();
		double xCoorddiff = Math.pow(xCoord2 - xCoord,2);
		double yCoorddiff = Math.pow(yCoord2-yCoord, 2);
		double distance = Math.sqrt(yCoorddiff+xCoorddiff);
		return distance;	
	}
	
	public Point rotate90(){
		double newxCoord = 0-yCoord;
		double newyCoord = xCoord;
		return new CartesianPoint(newxCoord,newyCoord);	
	}
	
}
