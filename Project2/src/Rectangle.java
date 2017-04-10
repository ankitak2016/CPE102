/**
 * Represents a rectangle shape
 * @author Ankita Koratkar
 * @version Project 2
 * @version CPE102-01
 */
import java.awt.Color;
import java.awt.Point;

public class Rectangle implements Shape {
	private double width;
	private double height;
	private Point position;
	private Color color;
	private boolean filled;
	
	/**
	 * Constructor
	 * @param width
	 * @param height
	 * @param position
	 * @param color
	 * @param filled
	 */
	public Rectangle(double width, double height, Point position, Color color, boolean filled){
		this.width = width;
		this.height = height;
		this.position = position;
		this.color = color;
		this.filled = filled;
	}
	/**
	 * Return the height of the Rectangle object
	 * @return height
	 */
	public double getHeight(){
		return height;
	}
	
	/**
	 * Sets the height of the rectangle object
	 * @param height
	 */
	public void setHeight(double height){
		this.height = height;
	}
	
	/**
	 * Sets the width of the rectangle object
	 * @param width
	 */
	public void setWidth(double width){
		this.width = width;
	}
	
	/**
	 * Returns the position of the rectangle object
	 * @return point  the point on the lower left corner
	 */
	public Point getPosition(){
		return position;
	}
	
	/**
	 * Returns the width of the rectangle object
	 * @return width
	 */
	public double getWidth(){
		return width;
	}

	public double getArea(){
		return width*height;
	}
	
	/**
	 * Overrides to the equals method
	 * @param other  object to be compared to
	 */
	public boolean equals(Object other){
		if(other instanceof Rectangle){
			if(width == ((Rectangle)other).getWidth()&&height ==((Rectangle)other).getHeight()&&position.equals(((Rectangle)other).getPosition())&&color.equals(((Rectangle)other).getColor())&&filled==((Rectangle)other).getFilled()){
				return true;
			}
		}
		return false;
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
