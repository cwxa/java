import java.util.Random;
import java.util.Scanner;

public class yhx05{
	public static void main(String args[]){
		int array[]=new int[10];
		inputArray(array);
		outputArray(array);
		System.out.println("");
		sortArray(array);
		System.out.println("排序后：");
		outputArray(array);
		System.out.println("\n请输入要查找的数：");
		Scanner reader=new Scanner(System.in);
		int find=reader.nextInt();
		int index=findArray(array,find);
		if(index==-1)
			System.out.println("数组中未出现该数");
		else
			System.out.println("查找数数组中下标为："+index);		
	}	
	static void inputArray(int array[]){	
	Random r=new Random();
	for(int i=0;i<array.length;i++){
		array[i]=r.nextInt(101);
		}
	}
	static void sortArray(int array[]){
    	for (int i = 1; i < array.length; i++) {
            int b = array[i];
            int c = i;
            for (int j = i-1; j >= 0 ; j--) {
                if(b < array[j]){
                    array[j+1] = array[j];
                    c = j;
                }else {
                    break;
                }
            }           
            array[c]=b;            
        }
	}

	static int findArray(int array[],int data){
			
		 int min = 0;
         int max = array.length - 1;
         int mid = (min + max) / 2;
         while (array[mid] != data) {
             if (array[mid] > data)
                 max = mid - 1;
             else if (array[mid] < data)
                 min = mid + 1;
             mid = (min + max) / 2;
             if (array[mid] == data)
                 return mid;
          }
         	return -1;
 }
	
	static void outputArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"    ");
					}						
	}
}