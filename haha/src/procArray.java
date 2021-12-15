import java.util.Random;
import java.util.Scanner;
public class procArray {
	public static void main(String[] args) {
		int find,index;
		int[] arr = new int[10];
		inputArray(arr,10);
		System.out.println("����ǰ: ");
		outputArray(arr,10);
		sortArray(arr,10);
		System.out.println("�����: ");
		outputArray(arr,10);
		System.out.print("������һ��Ҫ���ҵ�����:");
		Scanner reader=new Scanner(System.in);
	    find=reader.nextInt();
		index=findArray(arr,10,find);
		if(index==-1)
			System.out.print("������δ����Ҫ�ҵ�����");
		else
			System.out.print("Ҫ���ҵ����������е��±�λ���ǣ�"+index);    
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
	      //System.out.print("��" + i + "������\n"); 
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
            //���Ҫ���ҵ�Ԫ��findElemС���м�λ�õ�Ԫ��mid��ָ������Ľϴ�˵�high��������ָ���м�����mid����ߣ�mid-1��
            if (data< array[mid]) {
                high = mid - 1;
            }
            //���Ҫ���ҵ�Ԫ��findElem�����м�λ�õ�Ԫ��mid��ָ������Ľ�С�˵�low��������ָ���м�����mid���ұߣ�mid+1��
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