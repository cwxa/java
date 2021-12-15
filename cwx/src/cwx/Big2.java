package cwx;

import java.math.BigInteger;
import java.util.Scanner;

public class Big2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger A= input.nextBigInteger();//定义两个biginteger型的数字，然后在通过Scanner来实现数据的读入
		BigInteger B= input.nextBigInteger();
		System.out.println(A.add(B));//通过加法来实现数据和的输出
		input.close();

}
}