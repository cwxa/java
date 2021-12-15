package shiyan2;

public class Rectangle extends Geometry {
	private double length,width;

	public Rectangle() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		// TODO 自动生成的方法存根
		return  width*length;
	}

}
