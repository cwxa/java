package ch5;

public class Cylinder extends Circle3 {
   private double height;  			//Բ����ĸ�
   public Cylinder(){
   } 
   public Cylinder( int xValue, int yValue, double radiusValue,double heightValue ){
      super( xValue, yValue, radiusValue ); 	//��ʽ���ó���Circle3��Ĺ��캯��
      setHeight( heightValue );
   } 
   public void setHeight( double heightValue ){
      height = ( heightValue < 0.0 ? 0.0 : heightValue );
   } 
   public double getHeight(){
      return height;
   } 
   public double getArea(){			//��д����Circle3��getArea����
      return 2 * Math.PI * getRadius() * getRadius() + getCircumference() * getHeight();
   } 
   public double getVolume(){
      return Math.PI * getRadius() * getRadius() * getHeight();
   } 
   public String toString(){		//��д����Circle3��toString����
      return super.toString() + "; Height = " + getHeight();
   } 
} 