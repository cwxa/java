class A{
	static int s = 0;
	int a = 0;
	public A() {
		a++;
		s++;
		System.out.print("A");
	}
}
class B extends A{
	public B() {
		System.out.print("B");
	}
}
public class t1 {
	public static void main(String[ ] args) {
		B a1 = new B();
		A a2 = new A();
		System.out.print(a1.a);
		System.out.print(a1.s);
		System.out.print(a2.a);
		System.out.print(a2.s);
		}
	   }




