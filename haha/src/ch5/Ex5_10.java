package ch5;

abstract class Geometry{
	//interface Geometry{
    public abstract double getArea();
}

class Pillar{
    Geometry  bottom;        //将Geometry对象作为成员
    double height;
    Pillar (Geometry bottom,double height){
        this.bottom=bottom;
        this.height=height;
    }
    void changeBottom(Geometry bottom){
        this.bottom=bottom;
    }
    public double getVolume(){
        return bottom.getArea()*height; //bottom可以调用子类重写的getArea方法
    }
}

class Ladder extends Geometry{
	//class Ladder implements Geometry{
    double a,b,h;
    Ladder(double a,double b,double h){
        this.a=a; this.b=b; this.h=h;
    }
    public double getArea(){
        return((1/2.0)*(a+b)*h);
    }
}

class Circle extends Geometry{
	//class Circle implements Geometry{
    double r;
    Circle(double r){
        this.r=r;
    }
    public double getArea(){
        return(3.14*r*r);
    }
}

public class Ex5_10 {
	public static void main(String args[]){
        Pillar pillar;
        Geometry tuxing;
        tuxing=new Ladder(12,22,100);
        System.out.println("梯形的面积"+tuxing.getArea());
        pillar =new Pillar (tuxing,58);
        System.out.println("梯形底的柱体的体积"+ pillar.getVolume());
        tuxing=new Circle(10);
        System.out.println("半径是10的圆的面积"+tuxing.getArea());
        pillar.changeBottom(tuxing);
        System.out.println("圆形底的柱体的体积"+pillar.getVolume());
    }
}
