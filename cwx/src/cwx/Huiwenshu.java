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
	}//նβ��ת����������������
	if(n==i)//�ж���������ԭ�����Ƿ����
		{geshu=geshu+1;//������1
		System.out.print(i+" ");//�����ӡ����
		if(geshu%10==0)//���ƻ���
		System.out.println();}
	}
System.out.println("������"+geshu+"��");}

}

