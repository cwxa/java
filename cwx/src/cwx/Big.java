package cwx;

import java.math.BigInteger;
import java.util.Scanner;

public class Big {
	public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        while(reader.hasNextBigInteger())//�ж�n��û�ж�ȡ�������û���Ǳ����ֵ
        {
            BigInteger a=reader.nextBigInteger();//��Ϊ�����漰���ϴ����ֵ����ѡ����biginteger���͵�����
            BigInteger b=a.add(BigInteger.ONE);
            BigInteger c=new BigInteger("2");
            BigInteger d;
            d=a.multiply(b).divide(c);//ͨ���Ȳ����е���͹�ʽ�ó�����Ӧ����������ֵ
            System.out.println("���Ϊ"+d);//�����Ӧ��ֵ
        }
reader.close();
}
}
