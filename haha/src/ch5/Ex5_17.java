package ch5;

interface Show1{
    public void show();
}
class A3{
    void f(Show s){
        s.show();        //s调用匿名类体中实现的接口方法（接口回调）
    } 
}
public class Ex5_17{
    public static void main(String args[]){
        A3 a=new A3();
        a.f(new Show(){                       
               public void show(){
                     System.out.println("这是实现了接口的匿名类");
               }
           });
    } 
}
