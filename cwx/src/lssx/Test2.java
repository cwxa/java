package lssx;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("������Ԫ�ظ�����");
        int n = input.nextInt();

        System.out.println("�����뼯��Ԫ�أ�");
        int[] element = new int[n];
        for (int i = 0; i < n; i++) {
            element[i] = input.nextInt();
        }
        input.nextLine();

        int[][] R=new int[n*n][2];
        System.out.println("�����뼯�ϵĹ�ϵ:");
        String s=input.nextLine();
        char[] chars = s.toCharArray();
        int relationNum =0;
        for(int j = 0;j<chars.length;relationNum++){
            if(Character.isDigit(chars[j])){
                R[relationNum][0]=chars[j]-48;
                R[relationNum][1]=chars[j+2]-48;
                j=j+4;
            }
        }

        System.out.print("����Ԫ�صĹ�ϵΪ��{");
        for (int i = 0; i < relationNum; i++) {
            System.out.print("<"+R[i][0]+","+R[i][1]+">");
        }
        System.out.println("}");

        Matrix A = new Matrix(n,element,relationNum,R);
        //Matrix matrix=A;
        A.display();
        A.reflexive();
        A.irreflexive();
        A.symmetrical();
        A.dissymmetrical();
        A.transitive();
        System.out.println("�Է��հ�");
        A.reflexive_closure();
        A.display();
        A = new Matrix(n,element,relationNum,R);
        System.out.println("�ԳƱհ�");
        A.symmetric_closure();
        A.display();
        A = new Matrix(n,element,relationNum,R);
        System.out.println("���ݱհ�");
        A.Warshell();
        A.display();
        input.close();
    }
}



