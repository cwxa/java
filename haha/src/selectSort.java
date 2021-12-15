import java.util.Random;
import java.util.Scanner;
public class selectSort {
    public static void main(String[] args) {
        int[] arr;
        arr= new int[10];
        inputArray(arr);
        outputArray(arr);
        sortArray(arr);
        System.out.println("排序后：");
        outputArray(arr);
        System.out.print("请输入想要查找的整数：");
        Scanner reader=new Scanner(System.in);
        int find=reader.nextInt();
        int index=findArray(arr,find);
        if(index==-1)
            System.out.print("数组中未出现该数");
        else
            System.out.print("查找数数组中下标为："+index);

    }
    public static void inputArray(int[] temp){
            Random a = new Random();
            for (int i = 0; i < temp.length; ++i) {
                temp[i] = a.nextInt(100) + 1;
            }
        }
    public static void outputArray(int[] temp) {
        for (int i = 0 ; i<temp.length ; i++) {
            System.out.print(temp[i]+"\t") ;
        }
        System.out.println();
      }
    public  static void sortArray(int[]arr) {
           for (int i = 0; i < arr.length - 1; i++) {// 通过冒泡排序为数组排序
               for (int j = 0; j < arr.length - 1 - i; j++) {
                   if (arr[j] > arr[j + 1]) {
                       int temp = arr[j + 1];
                       arr[j + 1] = arr[j];
                       arr[j] = temp;
                   }
               }
           }}
      public static int findArray( int[]arr,int data){
               int min = 0;
               int max = arr.length - 1;
               int mid = (min + max) / 2;
               while (arr[mid] != data) {
                   if (arr[mid] > data)
                       max = mid - 1;
                   else if (arr[mid] < data)
                       min = mid + 1;
                   mid = (min + max) / 2;
                   if (arr[mid] == data)
                       return mid;
                }
               	return -1;
       }
}