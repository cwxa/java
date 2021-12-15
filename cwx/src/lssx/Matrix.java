package lssx;

import java.security.PublicKey;
import java.util.Arrays;

public class Matrix extends Set {
	
	    private int row;//��
	    private int col;//��
	    private int[][] matrix;

	    public Matrix(int n, int[] element, int relationNum, int[][] map) {
	        super(n, element, relationNum, map);
	        matrix=new int[n][n];
	        for(int i=0;i<relationNum;i++){
	            row = map[i][0]-1;
	            col = map[i][1]-1;
	            matrix[row][col]=1;
	        }
	    }

	    public void display() {
	        System.out.println("����");
	        for(row=0;row<n;row++)
	        {
	            for(col=0;col<n;col++)
	            {
	                System.out.print(matrix[row][col]+" ");
	            }
	            System.out.println();
	        }
	    }

	    /**
	     * �Է���
	     */
	    public void reflexive(){
	        boolean flag = true;
	        for(int i = 0; i < n; ++i){
	            if(matrix[i][i] != 1){  //ֻҪ��һ���Խ���Ԫ��Ϊ 0����������
	                flag = false;
	                break;
	            }
	        }
	        System.out.println(flag?"���Է���":"���Է���");
	    }
	    
	    public void reflexive_closure() {
	    	 
		        for(int i = 0; i < n; ++i){
		            if(matrix[i][i] != 1){  //ֻҪ��һ���Խ���Ԫ��Ϊ 0����������
		                matrix[i][i]=1;
		                
		            }
		        }
		}
	    

	   

		/**
	     * ���Է���
	     */
	    public void irreflexive(){
	        boolean flag = true;
	        for(int i = 0; i < n; ++i){
	            if(matrix[i][i] == 1){  //ֻҪ��һ���Խ���Ԫ��Ϊ 1����������
	                flag = false;
	                break;
	            }
	        }
	        System.out.println(flag?"�з��Է���":"�޷��Է���");
	    }


	    /**
	     * �Գ���
	     */
	    public void symmetrical(){
	        boolean flag = true;
	        for(int row = 0 ; row < n; row++){
	            for(int col = 0; col < n; col++){
	                if(matrix[row][col] != matrix[col][row]){  //ֻҪ��һ�ԶԳ�Ԫ�ز���ȣ���������Գ���
	                    flag = false;
	                    break;
	                }
	            }
	        }
	        System.out.println(flag?"�жԳ���":"�޶Գ���");
	    }


	    /**
	     * ���Գ���
	     */
	    public void dissymmetrical(){
	        boolean flag = true;
	        for(int row = 0 ; row < n; row++){
	            for(int col = 0; col < n; col++){
	                if( (row!=col) && (matrix[row][col] == 1)&&(matrix[row][col] == matrix[col][row]) ){  //ֻҪ��һ�ԶԳ�Ԫ����ȣ��������㷴�Գ���
	                    flag = false;
	                    break;
	                }
	            }
	        }
	        System.out.println(flag?"�з��Գ���":"�޷��Գ���");
	    }


	    /**
	     * ������
	     */
	    public void transitive(){
	        boolean flag=true;
	        for(int row = 0 ; row < n ; row++)
	        {
	            for(int col = 0 ; col < n ; col++)
	            {
	                if( 1 == matrix[row][col] )
	                {
	                    for(int k = 0 ; k < n ; k++)
	                    {
	                        if( 1 == matrix[col][k] && 1 != matrix[row][k] )
	                        {
	                            flag = false;
	                            break;
	                        }
	                    }
	                }
	            }
	        }
	        System.out.println(flag?"�д�����":"�޴�����");
	    }


	    public void Warshell() {
	    	int k ,i,j ;
	        for(i = 0;i<n;i++)
	        {
	            for(j = 0;j<n;j++)
	            {
	                if(matrix[j][i]==1)
	                {
	                    for(k = 0;k<n;k++)
	                    {
	                        matrix[j][k] = matrix[j][k]+matrix[i][k];
	                        if(matrix[j][k]>=1)
	                            matrix[j][k] = 1;
	                    }
	                }
	            }
	        }
	    
			
		}
	    public void symmetric_closure() {
	    	for (int i = 0; i < n; i++) {
				for(int j=0;j<n;j++)
				{if(matrix[i][j]==1)
					matrix[j][i]=1;
				}
				
			}
			
		}
	}



