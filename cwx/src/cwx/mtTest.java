package cwx;

public class mtTest {
	public static void main(String agrs[]){
		mt m=new mt();
		int c[]={0,0,0,0,0,0,0,0};
		System.out.print("p q r ");
		System.out.println(" p^q|!p^r");
		for(int j=0;j<8;j++)
		{c[j]=m.Biao(j);
		}
		m.Fanshi(c);
		
	}
}
