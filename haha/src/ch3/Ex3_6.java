package ch3;
/*一个数如果恰好等于它的因子之和，则称其为“完数”，如：6=1+2+3
 * 输出1000以内的所有完数并输出其因子*/
public class Ex3_6{
    public static void main (String args[ ]){
        int sum,i,j;
        for(i=1;i<=1000;i++){
           for(j=1,sum=0;j<=i/2;j++){
              if(i%j==0){
                 sum=sum+j;
              }
           } 
           if(sum==i){
              System.out.printf("%8d是一个完数，其因子为:",i);
              for(j=1;j<i/2+1;j++) {
            	  if(i%j==0) {//输出各个因子
            	  System.out.print(j+" ");
            	  }
              }
              System.out.println();
        }       
    }  
    }
}

