public class showMessage{
    static void nPrint(String msg,int n){
        while(n>0){System.out.println(msg+n);
        n--;
    }
}
public static void main(String [] args){
        int k=3;
        nPrint("A message",k);
        System.out.println(k);
}
}