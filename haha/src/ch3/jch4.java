package ch3;

public class jch4 {
	public static void main(String [] args){
	 double a=1;                                //定义一个变量a   
	 double sum=0;                              //定义一个变量sum，把和存放在sum里 
	 for(int i=1;i<=100;i++){                  //做1-3循环  
	 a=1;                                   //每次a都从1开始    
	 for(int j=1;j<=i;j++){                 //求每个数的阶乘    
	 a=a*j;                                    
	 }   
	 sum=a+sum;                             //每个数的阶乘求好后都加入sum 
	 }  
	 System.out.println(sum);                //输出和sum 
	 }
	 }
