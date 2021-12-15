package ch5;

interface Show{
    void show();
}
class A2 implements Show{
    public void show(){
        System.out.println("I love This Game");
    }
}
class B2 implements Show{
public void show(){
        System.out.println("我喜欢看NBA");
    }
}
class C{
    public void f(Show s){    //接口作为参数
        s.show();
    }
}
public class Ex5_13{
    public static void main(String args[]){
        C c=new C();
        c.f(new A2());
        c.f(new B2());         
    } 
}
