package ch3;

public class jch3 {
	public static void main(String[] args) {
		double num = 1;
		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			num = num * i;
			sum = sum + num;
		}
		System.out.println(sum);
	}
}