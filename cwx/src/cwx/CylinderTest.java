package cwx;

public class CylinderTest {
	public static void main(String []args){
		Circle c=new Circle(1,2,4);
		Cylinder cy=new Cylinder(2,3,4,5);
		System.out.println(c.toString());
		System.out.println(c.getA());
		System.out.println(c.getP());
		System.out.println(cy.toString());
		System.out.println(cy.getArea());
		System.out.println(cy.getVolume());
}
}