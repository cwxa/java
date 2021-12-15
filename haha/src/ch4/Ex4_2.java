package ch4;

public class Ex4_2 {
	public static void main(String args[]){
	       Circle circle;           //声明对象
	       circle = new Circle();   //创建对象
	       circle.radius=163.16;
	       double area=circle.getArea();
	       System.out.printf("半径是%5.3f的圆的面积:\n%5.3f\n",circle.radius,area);
	   }
}
