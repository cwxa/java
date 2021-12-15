import java.math.BigInteger;
public class Test {
    public static void main(String[] args) {
    	BigInteger a =BigInteger.valueOf(1);
    	BigInteger sum =BigInteger.valueOf(0); 
    	BigInteger i =BigInteger.valueOf(1);
    	BigInteger i1 =BigInteger.valueOf(100);
    	BigInteger i2 =BigInteger.valueOf(1);
    	/*do{
    		sum=sum.add(a);
    	    a=a.multiply(i);
    		i=i.add(i2);
    	}while(i.compareTo(i1)<=0);
    	*/
		for(int k=-1;k<=0; i=i.add(i2))
		{
			a=a.multiply(i);
			sum=sum.add(a);
			k = i.compareTo(i1);
		}
    	
		System.out.print("1!+2!+...+100!的总和为："+sum);
    }
}