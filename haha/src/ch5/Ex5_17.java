package ch5;

interface Show1{
    public void show();
}
class A3{
    void f(Show s){
        s.show();        //s��������������ʵ�ֵĽӿڷ������ӿڻص���
    } 
}
public class Ex5_17{
    public static void main(String args[]){
        A3 a=new A3();
        a.f(new Show(){                       
               public void show(){
                     System.out.println("����ʵ���˽ӿڵ�������");
               }
           });
    } 
}
