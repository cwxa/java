public class Ex2_5{
  public static void main(String args[ ]){
       int [] a={1,2,3};
       int [] b={10,11};
       System.out.println("����a��������:"+a);
       System.out.println("����b��������:"+b);
       System.out.printf("b[0]=%-3db[1]=%-3d\n",b[0],b[1]);
       b=a;
       System.out.println("����a��������:"+a);
       System.out.println("����b��������:"+b);
       b[1]=888;
       b[2]=999;  
       System.out.printf("a[0]=%-5da[1]=%-5da[2]=%-5d\n",a[0],a[1],a[2]);
       System.out.printf("b[0]=%-5db[1]=%-5db[2]=%-5d\n",b[0],b[1],b[2]);
    }
}   
