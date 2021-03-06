/**
 * Point interface 
 * @author Ankita Koratkar
 * @version Project 1
 * @version CPE102-01
 */
public interface Point {
	
	double xCoordinate();
	double yCoordinate();
	double radius();
	double angle();
	double distanceFrom(Point other);
	Point rotate90();

}
