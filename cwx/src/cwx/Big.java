package cwx;

import java.math.BigInteger;
import java.util.Scanner;

public class Big {
	public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        while(reader.hasNextBigInteger())//判断n有没有读取到，如果没有那便输出值
        {
            BigInteger a=reader.nextBigInteger();//因为这里涉及到较大的数值所以选择了biginteger类型的数字
            BigInteger b=a.add(BigInteger.ONE);
            BigInteger c=new BigInteger("2");
            BigInteger d;
            d=a.multiply(b).divide(c);//通过等差数列的求和公式得出所对应的三角形数值
            System.out.println("结果为"+d);//输出对应的值
        }
reader.close();
}
}
