package ch4;

class Lader1{
	  double above,height;    //ʵ������
	    static double bottom;   //�����
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
	       System.out.println("��������Lader�����bottom����"+Lader1.bottom);    
	       laderOne=new Lader1();  
	       laderTwo=new Lader1();
	       System.out.println("laderOne��bottom:"+laderOne.getBottom());
	       System.out.println("laderTwo��bottom:"+laderTwo.getBottom());
	       laderOne.setAbove(11);
	       laderTwo.setAbove(22);
	       laderTwo.setBottom(100);
	       System.out.println("��������Lader�����bottom����"+Lader1.bottom);
	       System.out.println("laderOne��above:"+laderOne.getAbove());
	       System.out.println("laderTwo��above:"+laderTwo.getAbove());
	    } 
	}
