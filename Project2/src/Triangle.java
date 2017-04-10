/**
 * Represents a triangle shape
 * @author Ankita Koratkar
 * @version Project 2
 * @version CPE102-01
 */
import java.awt.Color;
import java.awt.Point;

public class Triangle implements Shape {
	
	private Point a;
	private Point b;
	private Point c;
	private Color color;
	private boolean filled;
	
	/**
	 * Constructor
	 * @param a
	 * @param b
	 * @param c
	 * @param color
	 * @param filled
	 */
	public Triangle(Point a, Point b, Point c, Color color, boolean filled){
		this.a = a;
		this.b = b;
		this.c = c;
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * Returns the vertex a
	 * @return a  the first vertex
	 */
	public Point getVertexA(){
		return a;
	}
	
	/** 
	 * Sets the vertex a to a new point
	 * @param point  the point to set vertex a to
	 */
	public void setVertexA(Point point){
		this.a = point;
	}
	
	/**
	 * Returns the vertex b
	 * @return b  the second vertex
	 */
	public Point getVertexB(){
		return b;
	}
	
	/**
	 * Sets the vertex b to a new point
	 * @param point  the point to set vertex b to
	 */
	public void setVertexB(Point point){
		this.b = point;
	}
	
	/**
	 * Returns the vertex c
	 * @return c  the third vertex
	 */
	public Point getVertexC(){
		return c;
	}
	
	/**
	 * Sets the vertex c to a new point
	 * @param point  the point to set vertex c to
	 */
	public void setVertexC(Point point){
		this.c = point;
	}
	
	public double getArea(){
		double aX = a.getX();
		double aY = a.getY();
		double bX = b.getX();
		double bY = b.getY();
		double cX = c.getX();
		double cY = c.getY();
		double area = 0.5*(aX*(bY-cY)+bX*(cY-aY)+cX*(aY-bY));
		return Math.abs(area);
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
		a.setLocation(a.getX()+point.getX(),a.getY()+point.getY());
		b.setLocation(b.getX()+point.getX(),b.getY()+point.getY());
		c.setLocation(c.getX()+point.getX(),c.getY()+point.getY());
		
	}
	
	/**
	 * Overrides to the equals method
	 * @param other  object to be compared to
	 */
	public boolean equals(Object other){
		if(other instanceof Triangle){
			if(a.equals(((Triangle)other).getVertexA())&&b.equals(((Triangle)other).getVertexB())&&c.equals(((Triangle)other).getVertexC())&&color.equals(((Triangle)other).getColor())&&filled==((Triangle)other).getFilled()){
				return true;
			}
		}
		return false;
	}
	

}
