package ch4;

class Lader1{
	  double above,height;    //实例变量
	    static double bottom;   //类变量
	    void setAbove(double a){
	       above=a;
	    }
	    void setBottom(double b){
	       bottom=b;
	    }
	    double getAbove(){
	       return above;
	    }
	    double getBottom(){
	       return bottom;
	    }
	}
public class Ex4_4{
	    public static void main(String args[]){
	       Lader1.bottom=60;    
	       Lader1 laderOne,laderTwo;
	       System.out.println("现在所有Lader对象的bottom都是"+Lader1.bottom);    
	       laderOne=new Lader1();  
	       laderTwo=new Lader1();
	       System.out.println("laderOne的bottom:"+laderOne.getBottom());
	       System.out.println("laderTwo的bottom:"+laderTwo.getBottom());
	       laderOne.setAbove(11);
	       laderTwo.setAbove(22);
	       laderTwo.setBottom(100);
	       System.out.println("现在所有Lader对象的bottom都是"+Lader1.bottom);
	       System.out.println("laderOne的above:"+laderOne.getAbove());
	       System.out.println("laderTwo的above:"+laderTwo.getAbove());
	    } 
	}
