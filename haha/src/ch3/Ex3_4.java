package ch3;
import java.util.*;
public class Ex3_4{
    public static void main (String args[ ]){
       Scanner reader=new Scanner(System.in);
       System.out.println("����һ���·�:");
       int n=reader.nextInt();
       switch(n){
          case 1 :
          case 2 :
          case 3 :System.out.printf("%d�����ڵ�һ����",n);   
                break;    
          case 4 :
          case 5 :
          case 6 :System.out.printf("%d�����ڵڶ�����",n);   
                break; 
          case 7 :
          case 8 :
          case 9 :System.out.printf("%d�����ڵ�������",n);   
                break; 
          case 10 :
          case 11 :
          case 12 :System.out.printf("%d�����ڵ��ļ���",n);   
                 break; 
          default: System.out.printf("%d�������·�",n);  
       }
    }
}