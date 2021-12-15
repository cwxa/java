package shiyan2;

public class Circle extends Geometry {
	private double radius ;
	
	
	public Circle() {
		super();
		// TODO 自动生成的构造函数存根
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
		// TODO 自动生成的方法存根
		return 3.14*radius*radius;
	}

}
