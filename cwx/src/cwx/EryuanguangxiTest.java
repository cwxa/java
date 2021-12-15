package cwx;

import java.util.Scanner;

public class EryuanguangxiTest {
	public static void main(String []args){
		Scanner r=new Scanner(System.in);
		Eryuanguangxi e=new Eryuanguangxi();
		int m[][]=new int[10][10];
		int n;
		n=r.nextInt();
	for(int i=0; i<n; i++) {
		for(int j=0;j<n;j++)
		m[i][j] = r.nextInt();
	}
	e.setm(m);
	System.out.println(e.zifangxin());
	System.out.println(e.fangzifangxin());
	System.out.println(e.duichengxin());
	
r.close();
}
}