package ch5;

class NorthEast{
    String land="������";
}
class China{
    int x=10,y=10;
    LiaoNing dalian;             //�ڲ��������������Ϊ��Ƕ��ĳ�Ա
    China(){
        dalian=new LiaoNing();
    }
    void f(){
        System.out.println("�����й�");
        dalian.speak();
    } 
    class LiaoNing extends NorthEast{      //�ڲ��������
        int z;
        void speak(){
            System.out.println("���Ǵ���,z="+z+":"+land);
        }
        void g(){
            z=x+y;                    //ʹ����Ƕ���е�x,y
            f();                       //������Ƕ���еķ���f()
        }   
    }                                 //�ڲ������
}
public class Ex5_15{
    public static void main(String args[]){
        China china=new China();
        china.f();
        china.dalian.g();
    }   
}
