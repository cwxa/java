package ch5;
//Point3.java
public class Point3 {
   private int x;  	//�������еĳ�Ա����x����Ϊprivate
   private int y;  	//�������еĳ�Ա����x����Ϊprivate
   public Point3(){
   } 
   public Point3( int xValue, int yValue ){
      x = xValue;  
      y = yValue;  
   } 
   public void setX( int xValue ){
      x = xValue;  
   } 
   public int getX(){
      return x;
   } 
   public void setY( int yValue ){
      y = yValue;  
   } 
   public int getY(){
      return y;
   } 
   public String toString(){
      return "[" + getX() + ", " + getY() + "]";
   } 
} 