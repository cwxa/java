package cwx;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
	public static void main(String agrs[]){
		int array[];
		int n;
		Scanner r=new Scanner(System.in);
		array= new int [10];
		inputArray(array,10);
		sortArray(array,10);		
		outputArray(array,10);
		n=r.nextInt();
		findArray(array,10,n);
		r.close();
		
	}
	static void inputArray(int array[],int length)
	{int i; Random r =new Random();
	for(i=0;i<length;i++)
	array[i]=r.nextInt(100);
	}
	static void sortArray(int array[],int length){
		int i,j,temp;
		for(i=1;i<array.length;i++) {
			temp=array[i];
			for(j=i-1;j>=0;j--) {
			   if (temp > array[j]) {
					break;
			   }else{
		    	   array[j+1] = array[j];
		       }
			}
			array[j+1]=temp;
		}
		}
	static int findArray(int array[],int length,int data){
		
		int left = 0;
	    int right = length - 1; //right是数组最大索引 这里是8
	    while(left <= right){
	        int mid = (right + left) / 2;
	        if(array[mid] == data){
	        	System.out.println("要查找的数在数组中的下标位置是："+mid);
	            return 1;
	        } else if(array[mid] < data){
	            left = mid + 1;
	        } else if(array[mid] > data){
	            right = mid - 1;
	        }
	    }
	    System.out.println("数组中未出现要找的数。");
		return 0;
		}
	static void outputArray(int array[],int length){
	int i;
	for(i=0;i<length;i++)
	{System.out.print(array[i]+" ");
	}
	}}
