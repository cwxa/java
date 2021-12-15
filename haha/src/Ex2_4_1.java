
import java.util.Scanner;
public class Ex2_4_1{
    public static void main (String args[ ]){
       Scanner reader=new Scanner(System.in);
       long mul=1;
       int m=0;
       while(reader.hasNextLong()){
    	   long x=reader.nextLong();
           m=m+1;
           mul=mul*x;
       }
       System.out.printf("%d个数的积为%d\n",m,mul);
          }
}
