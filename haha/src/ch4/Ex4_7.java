package ch4;


class Tom{
    void f(int x,double y){
        x=x+1;
        y=y+1;
        System.out.printf("参数x和y的值分别是:%d,%3.2f\n",x,y);
    } 
}
public class Ex4_7{
    public static void main(String args[]){
        int x=10;
        double y=12.58; 
        Tom cat=new Tom();
        cat.f(x,y);
        System.out.printf("main方法中x和y的值仍然分别是:%d,%3.2f\n",x,y);
    }
}
