package ch3;

import java.util.*;
public class Ex3_3{
    public static void main (String args[ ]){
        Scanner reader=new Scanner(System.in);
        double a=0,b=0,c=0;
        System.out.print("�����a:");
        a=reader.nextDouble();
        System.out.print("�����b:");
        b=reader.nextDouble();
        System.out.print("�����c:");
        c=reader.nextDouble();
        if(a+b>c&&a+c>b&&b+c>a){
            if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b){
               System.out.printf("%-8.3f%-8.3f%-8.3f����ֱ��������",a,b,c);
            }
            else if(a*a<b*b+c*c&&b*b<a*a+c*c&&c*c<a*a+b*b){
               System.out.printf("%-8.3f%-8.3f%-8.3f�������������",a,b,c);
            }
            else{
               System.out.printf("%-8.3f%-8.3f%-8.3f���ɶ۽�������",a,b,c);
            }
        } 
        else{
            System.out.printf("%f,%f,%f���ܹ���������",a,b,c); 
        }    
    }
}
