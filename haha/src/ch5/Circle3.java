package ch5;
public class Circle3 extends Point3 {
   private double radius; 
   public Circle3(){
   } 
   public Circle3( int xValue, int yValue, double radiusValue ){
      super( xValue, yValue );  	//��ʽ���ó���Ĺ��췽��
      setRadius( radiusValue );
   } 
   public void setRadius( double radiusValue ){
      radius = ( radiusValue < 0.0 ? 0.0 : radiusValue );
   } 
   public double getRadius(){
      return radius;
   } 
   public double getDiameter(){
      return 2 * getRadius();
   } 
   public double getCircumference(){
      return Math.PI * getDiameter();
   } 
   private double getArea(){
      return Math.PI * getRadius() * getRadius();
   } 
   public String toString(){
   	  //���ó����toString����
      return "Center = " + super.toString() + "; Radius = " + getRadius();
   } 
} 