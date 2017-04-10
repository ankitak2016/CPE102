/**
 * Represents a circle shape
 * @author Ankita Koratkar
 * @version Project 2
 * @version CPE102-01
 */
import java.awt.Point;
import java.awt.Color;
public class Circle implements Shape{
	
	private double radius;
	private Point position;
	private Color color;
	private boolean filled;
	
	/**
	 * Constructor
	 * @param radius
	 * @param position
	 * @param color
	 * @param filled
	 */
	public Circle(double radius, Point position, Color color, boolean filled){
		this.radius = radius;
		this.position = position;
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * Returns the radius of the circle object
	 * @return radius
	 */
	public double getRadius(){
		return radius;
	}
	
	/**
	 * Sets the radius of the circle object
	 * @param radius
	 */
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	/**
	 * Returns the position of the Circle object
	 * @return position
	 */
	public Point getPosition(){
		return position;
	}
	
	/**
	 * Overrides to the equals method
	 * @param other  object to be compared to
	 */
	public boolean equals(Object other){
		if(other instanceof Circle) {
			if(radius == ((Circle)other).getRadius()&&position.equals(((Circle)other).getPosition())&&color.equals(((Circle)other).getColor())&&filled==((Circle)other).getFilled()){
				return true;
			}
		}
		return false;
	}
	
	public double getArea(){
		return Math.PI*Math.pow(radius,2);
	}
	
	public Color getColor(){
		return color;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public boolean getFilled(){
		return filled;
	}
	
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	public void move(Point point){
		position.setLocation(position.getX()+point.getX(),position.getY()+point.getY());
		
	}

}
