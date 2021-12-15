package lssx;

import java.security.PublicKey;
import java.util.Arrays;

public class Matrix extends Set {
	
	    private int row;//行
	    private int col;//列
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
	        System.out.println("矩阵：");
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
	     * 自反性
	     */
	    public void reflexive(){
	        boolean flag = true;
	        for(int i = 0; i < n; ++i){
	            if(matrix[i][i] != 1){  //只要有一个对角线元素为 0：即不满足
	                flag = false;
	                break;
	            }
	        }
	        System.out.println(flag?"有自反性":"无自反性");
	    }
	    
	    public void reflexive_closure() {
	    	 
		        for(int i = 0; i < n; ++i){
		            if(matrix[i][i] != 1){  //只要有一个对角线元素为 0：即不满足
		                matrix[i][i]=1;
		                
		            }
		        }
		}
	    

	   

		/**
	     * 反自反性
	     */
	    public void irreflexive(){
	        boolean flag = true;
	        for(int i = 0; i < n; ++i){
	            if(matrix[i][i] == 1){  //只要有一个对角线元素为 1：即不满足
	                flag = false;
	                break;
	            }
	        }
	        System.out.println(flag?"有反自反性":"无反自反性");
	    }


	    /**
	     * 对称性
	     */
	    public void symmetrical(){
	        boolean flag = true;
	        for(int row = 0 ; row < n; row++){
	            for(int col = 0; col < n; col++){
	                if(matrix[row][col] != matrix[col][row]){  //只要有一对对称元素不相等：即不满足对称性
	                    flag = false;
	                    break;
	                }
	            }
	        }
	        System.out.println(flag?"有对称性":"无对称性");
	    }


	    /**
	     * 反对称性
	     */
	    public void dissymmetrical(){
	        boolean flag = true;
	        for(int row = 0 ; row < n; row++){
	            for(int col = 0; col < n; col++){
	                if( (row!=col) && (matrix[row][col] == 1)&&(matrix[row][col] == matrix[col][row]) ){  //只要有一对对称元素相等：即不满足反对称性
	                    flag = false;
	                    break;
	                }
	            }
	        }
	        System.out.println(flag?"有反对称性":"无反对称性");
	    }


	    /**
	     * 传递性
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
	        System.out.println(flag?"有传递性":"无传递性");
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



