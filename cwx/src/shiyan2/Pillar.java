package shiyan2;

public class Pillar {
	Geometry bottom;
	double height;
	public Pillar(Geometry bottom, double height) {
		super();
		this.bottom = bottom;
		this.height = height;
	}
	public Geometry getBottom() {
		return bottom;
	}
	public void setBottom(Geometry bottom) {
		this.bottom = bottom;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return bottom.getArea()*height;
		
	}

}
