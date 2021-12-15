package ch5;

public class CylinderTest {
   public static void main( String[] args ){
      Cylinder cylinder = new Cylinder( 12, 23, 2.5, 5.7 );
      System.out.println("X coordinate is " + cylinder.getX() + "\nY coordinate is " + cylinder.getY() + "\nRadius is " + cylinder.getRadius() + "\nHeight is " + cylinder.getHeight());
      cylinder.setX( 35 );   		//���ü̳���Point3�е�setX����       
      cylinder.setY( 20 );         	//���ü̳���Point3�е�setY���� 
      cylinder.setRadius( 4.25 );   //���ü̳���Circle3�е�setRadius����
      cylinder.setHeight( 10.75 );  
      System.out.println("The new location, radius and height of cylinder are\n" + cylinder.toString());
      System.out.println(cylinder.getArea());
      System.out.println(cylinder.getVolume());
         } 
} 