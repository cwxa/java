package ch4;

class Jerry{
    int leg;
    Jerry(int n){
       leg=n;
    }
    void setLeg(int n){
       leg=n;
    }
    int getLeg(){
       return leg;
    }
}
class Tom1{
    void f(Jerry mouse){
        mouse.setLeg(12); 
        System.out.println("在执行方法f时,参数mouse修改了自己的leg的值");
        System.out.println("当前参数mouse的成员leg的值:"+mouse.getLeg());
        mouse=null;        //mouse不在拥有实体
        //mouse.setLeg(12);  //将发生NullPointerExcetion异常
    } 
}
public class Ex4_8{
    public static void main(String args[]){
        Tom1 cat=new Tom1();
        Jerry jerry=new Jerry(2);
        System.out.println("在调用方法f之前,jerry的成员leg的值:"+jerry.getLeg());
        cat.f(jerry);
        System.out.println("在调用方法f之后,jerry的成员leg的值:"+jerry.getLeg());
    }
}
