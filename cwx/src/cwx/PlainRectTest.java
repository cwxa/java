package cwx;

public class PlainRectTest {
	public static void main(String agrs[]){
		PlainRect p=new PlainRect(20,10,10,10);
		System.out.println(p.getArea());
		System.out.println(p.getPerimeter());
		System.out.println(p.isInside(25.5, 13));
	}
}
