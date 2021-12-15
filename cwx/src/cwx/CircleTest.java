package cwx;

public class CircleTest {
	public static void main(String agrs[]){
	Circle c=new Circle();
	c.setX(3);
	c.setY(4);
	c.setR(3);
	System.out.println("圆心坐标及半径为："+c.getX()+","+c.getY()+","+c.getR());
	System.out.println("圆的周长为："+c.getP());
	System.out.println("圆的面积为："+c.getA());
	System.out.println(c.toString());
	}
}
