package ch5;
public class Ex5_18{
    public static void main(String args[ ]){
        int n=0,m=0,t=0;
        try{
            t=9999;
            m=Integer.parseInt("8888");
            n=Integer.parseInt("12s3a");             //发生异常，转向catch
            System.out.println("我没有机会输出");
        }
        catch(Exception e){
            System.out.println("发生异常");
            n=123;
        }
        System.out.println("n="+n+",m="+m+",t="+t);
    }
}
