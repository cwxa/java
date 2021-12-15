package cwx;

public class mt {
	private static boolean p,q,r;
	public int Biao(int i){
		
		int a[]={0,0,0};
		for(int j=0;j<3;j++)
		{a[2-j]=i%2;
		i=i/2;
		}
		for(int j=0;j<3;j++)
		{System.out.print(a[j]+" ");
		}
		if(a[2]==1)
			r=true;
		else
			r=false;
		if(a[1]==1)
			q=true;
		else
			q=false;	
		if(a[0]==1)
			p=true;
		else
			p=false;
	
		if(p&q|!p&r)
			{System.out.println(" T");
		return 1;}
		else
		{System.out.println(" F");
		return 0;}	}
	public void Fanshi(int m[])
		{System.out.println("主析取范式 ");
			for (int i=0;i<8;i++)
		{if(m[i]==1)
			System.out.print("m"+i);
		}
			System.out.println();
			System.out.println("主合取范式 ");
		{for (int i=0;i<8;i++)
		{if(m[i]==0)
			System.out.print("m"+i);
		}
		}
		}
}
