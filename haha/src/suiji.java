
import java.util.Random;
public class suiji 
{
	static void inputArray(int array[],int length)//������ɵ�10����������������
	{
		Random random = new Random();
		//int arr[]=new int[10];
		for (int i=0;i<array.length;i++) 
		{ 
            array[i]=random.nextInt(100);
        }
		
	}
	static void sortArray(int array[],int length)//���ò��������㷨������Ԫ����������
	{
		int i, j; 
	    int insertNode;// Ҫ��������� 
	    // ������ĵڶ���Ԫ�ؿ�ʼѭ���������е�Ԫ�ز��� 
	    for (i = 1; i < length; i++) { 
	      // ���������еĵ�2��Ԫ��Ϊ��һ��ѭ��Ҫ��������� 
	      insertNode = array[i]; 
	      j = i - 1; 
	      // ���Ҫ�����Ԫ��С�ڵ�j��Ԫ�أ��ͽ���j��Ԫ������� 
	      while ((j >= 0) && insertNode < array[j]) { 
	        array[j + 1] = array[j]; 
	        j--;  
	      } 
	      // ֱ��Ҫ�����Ԫ�ز�С�ڵ�j��Ԫ��,��insertNote���뵽������ 
	      array[j + 1] = insertNode; 
	    }
	}
	/*
	static int findArray(int array[],int length,int data)//������������ʹ���۰�����㷨�����������ĳ�����Ƿ���������
	{
		int mid=length/2;
		int t=0;
		for(int i=0;i<length;i++){
			if(data!=array[i]){
				t++;
			}
		}
		if(t==10)
		{
			System.out.printf("������δ����Ҫ�ҵ�����");
			System.out.println("\n");
		}
		else
		{
			if(array[mid]==data)
			{
				System.out.printf("Ҫ���ҵ����������е��±�λ���ǣ�%d\n",mid);
				System.out.println("\n");
				return mid;
			}
			else if(array[mid]>data)
			{
				return findArray(array,length-1,data);
			}
			else
			{
				return findArray(array,length+1,data);
			}	   
		}
		return -1;
	}
	
	*/
	static void outputArray(int array[],int length)//�����������
	{
		System.out.printf("����Ϊ��");
		for(int i=0;i<array.length;i++)
		{
		   System.out.printf("%4d",array[i]);
		}
		   System.out.println("\n");
		  	}
	public static void main(String[] args)
	{
		int arr[]=new int[10];
		inputArray(arr,10);
		outputArray(arr,10);
		sortArray(arr,10);
		//findArray(array,10,10);
		outputArray(arr,10);
	}
}