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
        System.out.println("��ִ�з���fʱ,����mouse�޸����Լ���leg��ֵ");
        System.out.println("��ǰ����mouse�ĳ�Աleg��ֵ:"+mouse.getLeg());
        mouse=null;        //mouse����ӵ��ʵ��
        //mouse.setLeg(12);  //������NullPointerExcetion�쳣
    } 
}
public class Ex4_8{
    public static void main(String args[]){
        Tom1 cat=new Tom1();
        Jerry jerry=new Jerry(2);
        System.out.println("�ڵ��÷���f֮ǰ,jerry�ĳ�Աleg��ֵ:"+jerry.getLeg());
        cat.f(jerry);
        System.out.println("�ڵ��÷���f֮��,jerry�ĳ�Աleg��ֵ:"+jerry.getLeg());
    }
}
