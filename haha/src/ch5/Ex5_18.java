package ch5;
public class Ex5_18{
    public static void main(String args[ ]){
        int n=0,m=0,t=0;
        try{
            t=9999;
            m=Integer.parseInt("8888");
            n=Integer.parseInt("12s3a");             //�����쳣��ת��catch
            System.out.println("��û�л������");
        }
        catch(Exception e){
            System.out.println("�����쳣");
            n=123;
        }
        System.out.println("n="+n+",m="+m+",t="+t);
    }
}
