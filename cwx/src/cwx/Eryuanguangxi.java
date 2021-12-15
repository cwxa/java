package cwx;

public class Eryuanguangxi {
	int m[][]=new int[10][10];
	int n;
	boolean flag;
	
	Eryuanguangxi(){};
	
	void setm(int [][]a)
	{m=a;}
	
	boolean zifangxin()
	{flag = true;
	for(int i = 0; i < n; ++i){
		if(m[i][i] != 1){  //只要有一个对角线元素为 0：即不满足
			flag = false;
			break;
		}
		}
	return flag;
	}
	boolean fangzifangxin(){
		flag = true;
	for(int i = 0; i < n; ++i){
		if(m[i][i] == 1){  //只要有一个对角线元素为 1：即不满足
			flag = false;
			break;
		}
	}
	return flag;
	}
	boolean duichengxin(){
		flag= true;
	for(int i = 0 ; i < n; ++i){
		for(int j = 0; j < n; ++j){
			if(m[i][j] != m[j][i]){  //只要有一对对称元素不相等：即不满足对称性
				flag= false;
				break;
			}
		}
	}
	return flag;}

	boolean chuangdixin(){
		flag = true;
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < n; ++j){
				for(int k = 0; k < n; ++k){
					if(m[i][j]==1 & m[j][k]==1 & m[i][k]==0){  //前两个为 1，第三个为 0
						flag = false;
						break;
					}
				}
			}
		}
		return flag;
	}
	
	
	
	
	

}
