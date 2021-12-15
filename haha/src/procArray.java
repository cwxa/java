import java.util.Random;
import java.util.Scanner;
public class procArray {
	public static void main(String[] args) {
		int find,index;
		int[] arr = new int[10];
		inputArray(arr,10);
		System.out.println("排序前: ");
		outputArray(arr,10);
		sortArray(arr,10);
		System.out.println("排序后: ");
		outputArray(arr,10);
		System.out.print("请输入一个要查找的整数:");
		Scanner reader=new Scanner(System.in);
	    find=reader.nextInt();
		index=findArray(arr,10,find);
		if(index==-1)
			System.out.print("数组中未出现要找的数。");
		else
			System.out.print("要查找的数在数组中的下标位置是："+index);    
}
	static void inputArray(int array[],int length)
	{
		Random r = new Random();
	    for(int i=0; i < length ; ++i){
	      array[i]=r.nextInt(100)+1;
	    }
	}
	static void sortArray(int array[],int length)
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
	      //System.out.print("第" + i + "趟排序：\n"); 
	      //outputArray(array,length);
	    }
	}
	static int findArray(int array[],int length,int data)
	{
		int low = 0;
        int high = length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            //如果要查找的元素findElem小于中间位置的元素mid，指向数组的较大端的high索引重新指向中间索引mid的左边（mid-1）
            if (data< array[mid]) {
                high = mid - 1;
            }
            //如果要查找的元素findElem大于中间位置的元素mid，指向数组的较小端的low索引重新指向中间索引mid的右边（mid+1）
            if (data> array[mid]) {
                low = mid + 1;
            }
            if (array[mid] == data) {
                return mid;
            }
        }
		return -1;
	}
	static void outputArray(int array[],int length)
	{
		for(int i=0; i < length ; ++i){
		      System.out.print(array[i]+" ");
	}
		System.out.print("\n");
}
}