
import java.util.Random;
public class suiji 
{
	static void inputArray(int array[],int length)//随机生成的10个整数并存入数组
	{
		Random random = new Random();
		//int arr[]=new int[10];
		for (int i=0;i<array.length;i++) 
		{ 
            array[i]=random.nextInt(100);
        }
		
	}
	static void sortArray(int array[],int length)//采用插入排序算法将数组元素升序排列
	{
		int i, j; 
	    int insertNode;// 要插入的数据 
	    // 从数组的第二个元素开始循环将数组中的元素插入 
	    for (i = 1; i < length; i++) { 
	      // 设置数组中的第2个元素为第一次循环要插入的数据 
	      insertNode = array[i]; 
	      j = i - 1; 
	      // 如果要插入的元素小于第j个元素，就将第j个元素向后移 
	      while ((j >= 0) && insertNode < array[j]) { 
	        array[j + 1] = array[j]; 
	        j--;  
	      } 
	      // 直到要插入的元素不小于第j个元素,将insertNote插入到数组中 
	      array[j + 1] = insertNode; 
	    }
	}
	/*
	static int findArray(int array[],int length,int data)//对排序后的数组使用折半查找算法，查找输入的某整数是否在数组内
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
			System.out.printf("数组中未出现要找的数。");
			System.out.println("\n");
		}
		else
		{
			if(array[mid]==data)
			{
				System.out.printf("要查找的数在数组中的下标位置是：%d\n",mid);
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
	static void outputArray(int array[],int length)//输出数组数据
	{
		System.out.printf("数组为：");
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