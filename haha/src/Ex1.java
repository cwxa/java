
import java.util.*;
public class Ex1{
    public static void main(String args[]){
        Scanner reader=new Scanner(System.in);
        int a=1;
        while (reader.hasNextInt()){
            int x=reader.nextInt();
            a*=x;
        }
        System.out.println("这些整数的乘积是"+a);
    }
}
