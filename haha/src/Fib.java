import java.util.Scanner;
public class Fib {
    public static int f(int n) {
        if(n == 0){
            return 0;
        }else if(n <= 2){
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for(int i=3; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = f(a);
        System.out.println(b);
    }
}