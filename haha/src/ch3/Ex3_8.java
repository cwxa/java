package ch3;
import java.util.Scanner;
public class Ex3_8{ 
	  public static void main(String args[]){
	      int n,start,end,middle;
	      int a[]={-2,1,4,5,8,12,17,23,45,56,90,100};
	      start=0;
	      end=a.length;
	      middle=(start+end)/2;
	      int count=0;
	      Scanner reader=new Scanner(System.in);
	      System.out.print("������һ������:");
	      n=reader.nextInt();
	      while(n!=a[middle]){
	          if(n>a[middle]){
	               start=middle;
	          }
	          else if(n<a[middle]){
	               end=middle;
	          }
	          middle=(start+end)/2;
	          count++;
	          if(count>a.length/2)
	            break;
	      }
	      if(count>a.length/2)
	         System.out.println(n+"����������");
	      else
	         System.out.println(n+"�������еĵ�"+middle+"��Ԫ��"); 
	    }
	}
