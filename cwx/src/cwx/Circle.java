package cwx;

public class Circle {
	private double x;
	private double y;
	private double r;
	Circle (){};
	Circle (double x1,double y1,double r1)
	{x=x1;
	y=y1;
	r=r1;
	}
	public void setX(double x1){
		x=x1;
	}
	public void setY(double y1){
		y=y1;
	}
	public void setR(double r1){
		if(r1>0)
			r=r1;
		else
			r=0.0;
	}
	public double getX(){
		return x;}
	public double getY(){
		return y;}
	public double getR(){
		return r;}
	
	public double getP(){
		return 2*3.14*r;}
	public double getA(){
		return 3.14*r*r;}
	
	public String toString(){
		return "circle:center=["+getX()+","+getY()+"];Radius="+getR();}
}

