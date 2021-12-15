package cwx;

public class PlainRect extends Rectangle {
	private double startX,startY;
	PlainRect(){
		startX=0;
		startY=0;
	}
	PlainRect(double a,double b,double x1,double y1)
	{super(a,b);
	startX=x1;
	startY=y1;
	}
	
	void setX(double x1)
	{startX=x1;
	
	}
	void setY(double y1)
	{startY=y1;
	
	}
	double getX()
	{return startX;
	
	}
	double getY()
	{return startY;
	
	}
	String isInside(double x,double y)
	{if(x>startX&x<startX+getW()&y>startY&y<startY+getH())
		return "Yes";
	return "No";
	}
	public String toString()
	{return "×óÉÏ½Ç×ø±ê"+getX()+","+getY()+""+getW()+""+getH();
	
	}
	
	

}
