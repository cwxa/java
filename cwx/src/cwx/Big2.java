package cwx;

import java.math.BigInteger;
import java.util.Scanner;

public class Big2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger A= input.nextBigInteger();//��������biginteger�͵����֣�Ȼ����ͨ��Scanner��ʵ�����ݵĶ���
		BigInteger B= input.nextBigInteger();
		System.out.println(A.add(B));//ͨ���ӷ���ʵ�����ݺ͵����
		input.close();

}
}