/**
 * Represents a point in terms 
 * of polar coordinates
 * (angle and radius)
 * @author Ankita Koratkar
 * @version Project 1
 * @version CPE102-01
 */
public class PolarPoint implements Point{
	
	private double radius;
	private double angle;
	
	public PolarPoint(double radius, double angle){
		this.radius = radius;
		this.angle = angle;	
	}
	
	public double xCoordinate(){
		return Math.cos(angle)*radius;
	}
	
	public double yCoordinate(){
		return Math.sin(angle)*radius;	
	}
	
	public double radius(){
		return radius;	
	}
	
	public double angle(){
		return angle;	
	}
	
	public double distanceFrom(Point other){
		double radius1 = other.radius();
		double cosinediff = Math.cos(other.angle()-angle);
		double underSqrt = Math.pow(radius1, 2) + Math.pow(radius, 2) - 2*radius1*radius*cosinediff;
		return Math.sqrt(underSqrt);		
	}
	
	public Point rotate90(){
		double angledegrees = Math.toDegrees(angle);
		double angle2 = angledegrees + 90.0;
		PolarPoint pp = new PolarPoint(radius, Math.toRadians(angle2));
		return pp;	
	}

}
