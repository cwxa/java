package ch4;

public class Ex4_2 {
	public static void main(String args[]){
	       Circle circle;           //��������
	       circle = new Circle();   //��������
	       circle.radius=163.16;
	       double area=circle.getArea();
	       System.out.printf("�뾶��%5.3f��Բ�����:\n%5.3f\n",circle.radius,area);
	   }
}
