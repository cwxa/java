
import java.util.*;
public class Ex1{
    public static void main(String args[]){
        Scanner reader=new Scanner(System.in);
        int a=1;
        while (reader.hasNextInt()){
            int x=reader.nextInt();
            a*=x;
        }
        System.out.println("��Щ�����ĳ˻���"+a);
    }
}
