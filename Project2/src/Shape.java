/**
 * Represents a shape
 * @author Ankita Koratkar
 * @version Project 2
 * @version CPE102-01
 */
import java.awt.Color;
import java.awt.Point;
public interface Shape {
	
	/**
	 * Returns area of the shape
	 * @return area 
	 */
	double getArea();
	
	/**
	 * Returns color of the shape
	 * @return color
	 */
	Color getColor();
	
	/**
	 * Sets color of the shape
	 * @param color
	 */
	void setColor(Color color);
	
	/**
	 * Returns the filled state of the shape
	 * @return filled
	 */
	boolean getFilled();
	
	/**
	 * Sets the filled state of the shape
	 * @param filled
	 */
	void setFilled(boolean filled);
	
	/**
	 * Moves the shape by the x and
	 * y amounts specified in the Point
	 * @param point  the specified point  
	 */
	void move(Point point);
		
}
