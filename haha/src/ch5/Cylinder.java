package ch5;

public class Cylinder extends Circle3 {
   private double height;  			//圆柱体的高
   public Cylinder(){
   } 
   public Cylinder( int xValue, int yValue, double radiusValue,double heightValue ){
      super( xValue, yValue, radiusValue ); 	//显式调用超类Circle3类的构造函数
      setHeight( heightValue );
   } 
   public void setHeight( double heightValue ){
      height = ( heightValue < 0.0 ? 0.0 : heightValue );
   } 
   public double getHeight(){
      return height;
   } 
   public double getArea(){			//重写超类Circle3的getArea方法
      return 2 * Math.PI * getRadius() * getRadius() + getCircumference() * getHeight();
   } 
   public double getVolume(){
      return Math.PI * getRadius() * getRadius() * getHeight();
   } 
   public String toString(){		//重写超类Circle3的toString方法
      return super.toString() + "; Height = " + getHeight();
   } 
} 