package cwx;

public class Cylinder extends Circle{
	private double height;
	public Cylinder(){}
	public Cylinder(double x,double y ,double z,double h)
	{super(x,y,z);
	height=h;
	}
	public void setHeight(double h){
		height=h;
	};
	public double getHeight(){
		return height;
	};
	
	public double getArea()
	{return 2*super.getA()+2*Math.PI*getR()*height;
	}
	
	public double getVolume()
	{return super.getA()*height;}
	
	public String toString()
	{return  "x="+getX()+" y="+getY()+" r="+getR()+" h="+getHeight();
	}
}
