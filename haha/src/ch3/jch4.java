package ch3;

public class jch4 {
	public static void main(String [] args){
	 double a=1;                                //����һ������a   
	 double sum=0;                              //����һ������sum���Ѻʹ����sum�� 
	 for(int i=1;i<=100;i++){                  //��1-3ѭ��  
	 a=1;                                   //ÿ��a����1��ʼ    
	 for(int j=1;j<=i;j++){                 //��ÿ�����Ľ׳�    
	 a=a*j;                                    
	 }   
	 sum=a+sum;                             //ÿ�����Ľ׳���ú󶼼���sum 
	 }  
	 System.out.println(sum);                //�����sum 
	 }
	 }
