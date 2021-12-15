package cwx;

public class Rectangle {
	private double width;
	private double height;
	
	Rectangle(){
		width=0;
		height=0;
	};
	Rectangle(double w,double h)
	{width=w;
	height=h;
	}
	
	
	public double getW(){
		return width;}
	public double getH(){
		return height;}
	
	public void setW(double x1){
		width=x1;
	}
	public void setH(double y1){
		height=y1;
	}
	
	public double getPerimeter(){
		return 2*(width+height);}
	public double getArea(){
		return width*height;}
	
	public String toString()
	{return  "¿í"+getW()+"¸ß"+getH()+""+getPerimeter();}

}
