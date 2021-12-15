
public class Ex2_1_1 {
	public static void main (String args[ ]){
        char c=1072;
        System.out.println("字母"+c+"在unicode表中的顺序位置:"+(int)c);
        System.out.println("俄文字母表：");
        for(int i=(int)c;i<c+34;i++){  
           System.out.print(" "+(char)i);
       }
    }
}
