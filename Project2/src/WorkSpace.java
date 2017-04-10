/**
 * The workspace for all shapes
 * @author Ankita Koratkar
 * @version Project 2
 * @version CPE102-01
 */
import java.util.ArrayList;
import java.awt.Color;
public class WorkSpace {
	
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	/**
	 * Constructor
	 */
	public WorkSpace(){	
	}
	
	/**
	 * Adds objects to the end of the
	 * WorkSpace's ArrayList (shapes)
	 * @param shape  object implementing Shape interface
	 */
	public void add(Shape shape){
		shapes.add(shape);
	}
	
	/**
	 * Removes the shape at the specified
	 * index, returns a reference to it
	 * @param index  specified index
	 * @return reference to the shape
	 */
	public Shape remove(int index){
		if(index>=shapes.size()||index<0){
			return null;
		}
		
		Shape currentShape = shapes.get(index);
		shapes.remove(index);
		return currentShape;
	}
	
	/**
	 * Return the ith shape object
	 * from WorkSpace
	 * @param index  specified index
	 * @return shape in that index
	 */
	public Shape get(int index){
		return shapes.get(index);
	}
	
	/**
	 * Return the number of shapes
	 * contained by the WorkSpace
	 * @return shapes.size()
	 */
	public int size(){
		return shapes.size();
	}
	
	/**
	 * Returns an ArrayList of all
	 * the circle objects
	 * @return circles  ArrayList of circle
	 */
	public ArrayList<Circle> getCircles(){
		ArrayList<Circle> circles = new ArrayList<Circle>();
		for(int i = 0;i<shapes.size();i++){
			if(shapes.get(i) instanceof Circle){
				circles.add((Circle)shapes.get(i));
			}
		}
		return circles;
	}
	
	/**
	 * Returns an ArrayList of all
	 * the rectangle objects
	 * @return Rectangle  ArrayList of rectangles
	 */
	public ArrayList<Rectangle> getRectangles(){
		ArrayList<Rectangle> Rectangle = new ArrayList<Rectangle>();
		for(int i = 0;i<shapes.size();i++){
			if(shapes.get(i) instanceof Rectangle){
				Rectangle.add((Rectangle)shapes.get(i));
			}
		}
		return Rectangle;
	}
	
	/**
	 * Returns an ArrayList of all
	 * the triangle objects
	 * @return Triangle  ArrayList of triangles
	 */
	public ArrayList<Triangle> getTriangles(){
		ArrayList<Triangle> Triangle = new ArrayList<Triangle>();
		for(int i = 0;i<shapes.size();i++){
			if(shapes.get(i) instanceof Triangle){
				Triangle.add((Triangle)shapes.get(i));
			}
		}
		return Triangle;
	}
	/**
	 * Returns an ArrayList of all
	 * the convex polygon objects
	 * @return ConvexPolygon  ArrayList of convex polygons
	 */	
	public ArrayList<ConvexPolygon> getConvexPolygons(){
		ArrayList<ConvexPolygon> ConvexPolygon = new ArrayList<ConvexPolygon>();
		for(int i = 0;i<shapes.size();i++){
			if(shapes.get(i) instanceof ConvexPolygon){
				ConvexPolygon.add((ConvexPolygon)shapes.get(i));
			}
		}
		return ConvexPolygon;
	}
	
	/**
	 * Returns an ArrayList of all 
	 * shape objects
	 * @param color
	 * @return shape  ArrayList of shapes
	 */
	public ArrayList<Shape> getShapesByColor(Color color){
		ArrayList<Shape> shape = new ArrayList<Shape>();
		for(int i = 0;i<shapes.size();i++){
			if(shapes.get(i).getColor()==color){
				shape.add(shapes.get(i));
			}
		}
		return shape;
	}
	
	/**
	 * Returns the sum of the area of
	 * all Shape objects in WorkSpace
	 * @return total  sum of all areas
	 */
	public double getAreaOfAllShapes(){
		double total = 0.0;
		for(int i = 0;i<shapes.size();i++){
			total = total+shapes.get(i).getArea();
		}
		
		return total;
	}
}
