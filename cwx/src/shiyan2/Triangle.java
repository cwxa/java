package shiyan2;

public class Triangle extends Geometry {
	double d,h;

	public Triangle(double d, double h) {
		super();
		this.d = d;
		this.h = h;
	}

	public double getArea() {
		
		
		// TODO �Զ����ɵķ������
		return (1/2.0)*d*h;
	}

}
