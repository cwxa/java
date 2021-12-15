package ch3;

public class jch5 {
	public static void main (String args[ ]){
		double s1;
		double s2=0,i=100,j=100;
		while(j>1){
			s1=1;
			while(i>1){
				s1=s1*i;
				i--;
			}
			j=j-1;
			i=j;
			s2=s2+s1;
			}
		System.out.println(s2);
		}
}
