package shiyan2;

public class Lader extends Geometry {
	double a,b,h;
	

	public Lader(double a, double b, double h) {
		super();
		this.a = a;
		this.b = b;
		this.h = h;
	}


	public double getArea() {
		// TODO �Զ����ɵķ������
		return ((1/2.0)*(a+b)*h);
	}

}
