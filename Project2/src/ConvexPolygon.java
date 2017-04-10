/**
 * Represents a convex polygon shape
 * @author Ankita Koratkar
 * @version Project 2
 * @version CPE102-01
 */
import java.awt.Color;
import java.awt.Point;

public class ConvexPolygon implements Shape {
	
	private Point[]vertices;
	private Color color;
	private boolean filled;
	
	/**
	 * Constructor
	 * @param vertices
	 * @param color
	 * @param filled
	 */
	public ConvexPolygon(Point[]vertices, Color color, boolean filled){
		this.vertices = vertices;
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * Returns the specified vertex
	 * @param index  the index of the vertex 
	 * @return vertices[index]
	 */
	public Point getVertex(int index){
		return vertices[index];
	}

	/**
	 * Sets the specified vertex of the polygon
	 * @param index  the index of the vertex
	 * @param point  the point to be set to
	 */
	public void setVertex(int index, Point point){
		vertices[index]=point;
	}
	
	public double getArea(){
		double firsthalf = 0.0;
		double secondhalf = 0.0;
		//Calculates first part of the equation
		for(int i = 0;i<vertices.length;i++){
			double x = vertices[i].getX();
			double y = 0.0;
			if(i==vertices.length-1){
				y = vertices[0].getY();
			}
			else{
				y = vertices[i+1].getY();
			}
			firsthalf = firsthalf + (x*y);
		}
		
		//Calculates second part of the equation
		for(int i = 0;i<vertices.length;i++){
			double y = vertices[i].getY();
			double x = 0.0;
			if(i==vertices.length-1){
				x = vertices[0].getX();
			}
			else{
				x = vertices[i+1].getX();
			}
			secondhalf = secondhalf + (x*y);
		}
		
		return 0.5*(firsthalf-secondhalf);
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
	
	/**
	 * Sets filled state of the convex polygon
	 * @param filled
	 */
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	public void move(Point point){
		for(int i = 0;i<vertices.length;i++){
			vertices[i].setLocation(vertices[i].getX()+point.getX(),vertices[i].getY()+point.getY());
		}
		
	}
	
	/**
	 * Overrides to the equals method
	 * @param other  object to be compared to
	 */
	public boolean equals(Object other){
		if(other instanceof ConvexPolygon){
			if(((ConvexPolygon)other).vertices.length!=vertices.length){
				return false;
			}
			if(color.equals(((ConvexPolygon)other).getColor())==false){
				return false;
			}
			if(filled!=((ConvexPolygon)other).getFilled()){
				return false;
			}
			for(int i = 0;i<vertices.length;i++){
				if(vertices[i].equals(((ConvexPolygon)other).getVertex(i))==false){
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
