package ch3;
/*һ�������ǡ�õ�����������֮�ͣ������Ϊ�����������磺6=1+2+3
 * ���1000���ڵ��������������������*/
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
              System.out.printf("%8d��һ��������������Ϊ:",i);
              for(j=1;j<i/2+1;j++) {
            	  if(i%j==0) {//�����������
            	  System.out.print(j+" ");
            	  }
              }
              System.out.println();
        }       
    }  
    }
}

