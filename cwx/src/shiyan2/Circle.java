package shiyan2;

public class Circle extends Geometry {
	private double radius ;
	
	
	public Circle() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}


	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double getArea() {
		// TODO �Զ����ɵķ������
		return 3.14*radius*radius;
	}

}
