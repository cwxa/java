package ch3;

public class Exam {

	public static void main(String[] args) {
	double r1=1,r2=1;
	double p1=1.01,p2=0.99;
	int day;
	for(day=1;day<=365;day++){
		r1*=p1;
		r2*=p2;
		}
System.out.printf("ÿ�����һ���~~~%.2f\n",r1);
System.out.printf("ÿ���˲�һ���~~~%.2f\n",r2);
System.out.printf("���Ͳ�����ǧ�������������Ԩ��\n");
	}

}
