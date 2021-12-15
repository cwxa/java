package cwx;

public class Huiwenshu {public static void main(String agrs[]){
int i=0,n,j,geshu = 10;

for(;i<1000;i++)
	{n=0;
	j=i;
	if(i<10)
		{System.out.print(i+" ");
		continue;}
	while(j>0){
		n=n*10+j%10;
		j/=10;
	}//斩尾法转换数字生成新数字
	if(n==i)//判断新数字与原数字是否相等
		{geshu=geshu+1;//个数加1
		System.out.print(i+" ");//输出打印数字
		if(geshu%10==0)//控制换行
		System.out.println();}
	}
System.out.println("回文数"+geshu+"个");}

}

