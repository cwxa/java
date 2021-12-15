package ch4;

public class Ex4_11{
    int leg;
    Ex4_11(int n){
       this.cry();   //可以省略this，即将this.cry();写成cry();
       leg=n;
       this.cry(); 
    }
    void cry(){
       System.out.println("现在有"+leg+"条腿");
    }
    public static void main(String args[]){
    	Ex4_11 cat=new Ex4_11(4);  //当调用构造方法时，其中的this就是对象cat
    }
}
