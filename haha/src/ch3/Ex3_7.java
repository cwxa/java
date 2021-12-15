package ch3;

public class Ex3_7 {
    public static void main(String args[]){ 
       int sum=0,i=0,max=8888,number=7;
       while(true){
         i++;   
         sum=sum+i;
         if(sum>=max)
            break;
       }
       System.out.println("1+2+...n<"+max+"的最大整数n是:"+(i-1)); 
       for(i=1,max=200,sum=0;i<=max;i++){      
          if(i%number!=0){ 
             continue;  
          } 
          sum=sum+i;
       }
       System.out.println(max+"内能被"+number+"整除的数字之和:"+sum);
    }
}
