package ch3;
import java.math.BigInteger;
public class jch2 {
    public static void main(String[] args) {  
       	BigInteger sum = new BigInteger("0");
		BigInteger sum1 = null;
		for(int i = 1;i<=100;i++){
			sum1 = new BigInteger(String.valueOf("1"));
			for(int k = 1;k <= i;k++){
				sum1 = sum1.multiply(new BigInteger(String.valueOf(k)));
			}
			sum = sum.add(sum1);
		}
		System.out.println(sum);
}
}