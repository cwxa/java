package lssx;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入元素个数：");
        int n = input.nextInt();

        System.out.println("请输入集合元素：");
        int[] element = new int[n];
        for (int i = 0; i < n; i++) {
            element[i] = input.nextInt();
        }
        input.nextLine();

        int[][] R=new int[n*n][2];
        System.out.println("请输入集合的关系:");
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

        System.out.print("集合元素的关系为：{");
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
        System.out.println("自反闭包");
        A.reflexive_closure();
        A.display();
        A = new Matrix(n,element,relationNum,R);
        System.out.println("对称闭包");
        A.symmetric_closure();
        A.display();
        A = new Matrix(n,element,relationNum,R);
        System.out.println("传递闭包");
        A.Warshell();
        A.display();
        input.close();
    }
}



