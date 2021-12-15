package ch3;

public class jch6 {
	public static void main(String[] args) {
		double a=0,b=1;
		for (int i = 1; i <= 100; ++i) {
			b=1;
			for(int c=1;c<=i;c++){
			b*=c;
			}
		a+=b;
		}
		System.out.println(a);
	}
}
