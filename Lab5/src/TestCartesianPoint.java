/**
 * Tests cartesian point
 * @author Ankita Koratkar
 * @version Lab 5
 * 
 * Errors
 * Class 1 : angle()
 * Class 2 : no errors
 * Class 3 : rotate90()
 * Class 4 : constructor
 * Class 5 : radius()
 * Class 6 : rotate90()
 * Class 7 : distanceFrom()
 * 
 */
public class TestCartesianPoint
{
   public static void main(String[] args)
   {
      // test methods
      testConstructor();
      
      testRadius();

      testAngle();

      testDistanceFrom();

      testRotate90();

      // results
      System.out.println("\nTests: " + SUnit.testsRun());
      System.out.println("Failures: " + SUnit.testsFailed());

      if (SUnit.testsFailed() == 0)
         System.out.println("\nPASSED ALL TESTS!!!");
   }

   private static void testConstructor()
   {
      int fails = SUnit.testsFailed();

      System.out.println("Testing constructor...");
      CartesianPoint cp = new CartesianPoint(2.1,4.7);
      SUnit.assertEquals(2.1, cp.xCoordinate(), .000001);
      SUnit.assertEquals(4.7, cp.yCoordinate(), .000001);

      if (fails == SUnit.testsFailed())
          System.out.println("     PASS");
   }
   
   private static void testRadius()
   {
      int fails = SUnit.testsFailed();
      System.out.println("Testing radius...");
      CartesianPoint cp = new CartesianPoint(Math.sqrt(2.0),Math.sqrt(2.0));
      SUnit.assertEquals(2.0, cp.radius(), .00001);
      
      CartesianPoint cp1 = new CartesianPoint(1.0,1.0);
      SUnit.assertEquals(1.414, cp1.radius(),0.001);
      
      CartesianPoint cp2 = new CartesianPoint(-2.7,-4.0);
      SUnit.assertEquals(4.825, cp2.radius(),0.001);
      
      CartesianPoint cp3 = new CartesianPoint(-3.0,3.0);
      SUnit.assertEquals(4.242, cp3.radius(),0.001);
      
      CartesianPoint cp4 = new CartesianPoint(0.0,0.0);
      SUnit.assertEquals(0.0, cp4.radius(),0.00001);
      if (fails == SUnit.testsFailed())
          System.out.println("     PASS");
   
   }

   private static void testAngle(){

      int fails = SUnit.testsFailed();
      System.out.println("Testing angle...");
      
      CartesianPoint cp = new CartesianPoint(-1.0,1.0);
      SUnit.assertEquals(Math.atan2(1.0,-1.0), cp.angle(),0.01);
      
      CartesianPoint cp1 = new CartesianPoint(1.0,1.0);
      SUnit.assertEquals(Math.atan2(1.0,1.0), cp1.angle(),0.001);
      
      CartesianPoint cp2 = new CartesianPoint(-2.7,-4.0);
      SUnit.assertEquals(Math.atan2(-4.0,-2.7), cp2.angle(),0.01);
      
      CartesianPoint cp3 = new CartesianPoint(0.0,0.0);
      SUnit.assertEquals(Math.atan2(0.0,0.0),cp3.angle(),0.01);
      
      if(fails == SUnit.testsFailed()){
         System.out.println("       PASS");
      }
   }

   private static void testDistanceFrom(){

      int fails = SUnit.testsFailed();
      System.out.println("Testing distanceFrom...");
      CartesianPoint cp = new CartesianPoint(0.0,0.0);
      CartesianPoint cp1 = new CartesianPoint(1.0,0.0);
      CartesianPoint cp2 = new CartesianPoint(9.0,-3.0);
      CartesianPoint cp3 = new CartesianPoint(-2.0,-6.212);
      
      SUnit.assertEquals(1.0,cp.distanceFrom(cp1),0.1);
      
      SUnit.assertEquals(0.0,cp2.distanceFrom(cp2),0.1);
      
      SUnit.assertEquals(11.459,cp2.distanceFrom(cp3),0.001);
      
      if(fails == SUnit.testsFailed()){
         System.out.println("       PASS");
      }
 
   }

   private static void testRotate90(){
      int fails = SUnit.testsFailed();
      System.out.println("Testing testRotate90...");
      
      CartesianPoint cp = new CartesianPoint(-19.73,-0.00124);
      Point cp1 = cp.rotate90();
      SUnit.assertEquals(0.00124,((CartesianPoint)cp1).xCoordinate(),0.001);
      SUnit.assertEquals(-19.73,((CartesianPoint)cp1).yCoordinate(),0.01);
      
      CartesianPoint cp2 = new CartesianPoint(0.0,0.0);
      Point cp3 = cp2.rotate90();
      SUnit.assertEquals(0.0,((CartesianPoint)cp3).xCoordinate(),0.001);
      SUnit.assertEquals(0.0,((CartesianPoint)cp3).yCoordinate(),0.01);
      
      CartesianPoint cp4 = new CartesianPoint(1.0,0.0);
      Point cp5 = cp4.rotate90();
      SUnit.assertEquals(0.0,((CartesianPoint)cp5).xCoordinate(),0.001);
      SUnit.assertEquals(1.0,((CartesianPoint)cp5).yCoordinate(),0.01);
      
      CartesianPoint cp6 = new CartesianPoint(0.0,-1.0);
      Point cp7 = cp6.rotate90();
      SUnit.assertEquals(1.0,((CartesianPoint)cp7).xCoordinate(),0.001);
      SUnit.assertEquals(0.0,((CartesianPoint)cp7).yCoordinate(),0.01);
      
      cp1 = new CartesianPoint(0.0,3.0);
      cp2 = new CartesianPoint(0.0,0.0);
      cp2 = (CartesianPoint)cp1.rotate90();
      SUnit.assertEquals(cp1.yCoordinate()* -1,cp2.xCoordinate(),0.001);
      SUnit.assertEquals(cp1.xCoordinate(),cp2.yCoordinate(),0.001);
      
      if(fails == SUnit.testsFailed()){
          System.out.println("       PASS");
       }

      }

   
}
