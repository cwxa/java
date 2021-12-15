package ch5;

class MyException extends Exception{
    String message;
    MyException(int n){
       message=n+"��������";
    }
    public String getMessage(){
       return message;
    }
}
class A4{
    public void f(int n) throws MyException{
        if(n<0){
          MyException ex=new MyException(n);
          throw(ex);                          //�׳��쳣����������f��ִ��
        }
        double number=Math.sqrt(n);
        System.out.println(n+"��ƽ����:"+number);
    }
}
public class Ex5_19{
    public static void main(String args[]){
        A4 a=new A4();
        try{ 
 a.f(28);
             a.f(-8);
        }
        catch(MyException e){
             System.out.println(e.getMessage());
        }
    }
}
