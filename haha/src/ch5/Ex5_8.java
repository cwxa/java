package ch5;

class A{
    double n;
    int m;
    void f(){
        System.out.printf("����̳з���f(),n=%f,m=%d\n",n,m); 
    }
    void g(){
        System.out.printf("��ã�n=%f,m=%d\n",n,m);  
    }  
}
class B extends A{
    int n=12;
    void g(){
        System.out.printf("������д����g(),n=%d,m=%d\n",n,m); 
    }
    void cry(){
        System.out.printf("���������ķ���,n=%d,m=%d\n",n,m); 
    }
}
public class Ex5_8{
    public static void main(String args[ ]){
        A a;
        a=new B();            	//a������������ת�Ͷ���
        a.n=0.618;            	//�����������ص�double���ͳ�Աn
        a.m=200;             	//��������̳еĳ�Աm,�ȼ���b.m=200;
        a.f();                	//��������̳еķ���,�ȼ���b.f();
        a.g();                 	//����������д�ķ���,�ȼ���b.g();
        B b=(B)a;            	//��ת�Ͷ���ǿ��ת�����������
        b.n=555;           	     //��������������int���ͳ�Աn
        b.cry();               	// a.cry();  �ǷǷ���
    }
}
