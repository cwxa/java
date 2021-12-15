package ch5;
interface Computable{
    final int MAX=100;
    int f(int x);
    public abstract int g(int x,int y);
}
class A1 implements Computable{
    public int f(int x){
         return x*x;
    } 
    public int g(int x,int y){
         return x+y;
    }
}
class B1 implements Computable{
    public int f(int x){
         return x*x*x;
    } 
    public int g(int x,int y){
         return x*y;
    }
}
public class Ex5_11{
    public static void main(String args[]){
       A1 a=new A1();
       B1 b=new B1();
       System.out.println(a.MAX);
       System.out.println(""+a.f(10)+" "+a.g(12,6));
       System.out.println(b.MAX);
       System.out.println(""+b.f(10)+" "+b.g(29,2));
    }
}
