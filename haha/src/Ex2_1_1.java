
public class Ex2_1_1 {
	public static void main (String args[ ]){
        char c=1072;
        System.out.println("��ĸ"+c+"��unicode���е�˳��λ��:"+(int)c);
        System.out.println("������ĸ��");
        for(int i=(int)c;i<c+34;i++){  
           System.out.print(" "+(char)i);
       }
    }
}
