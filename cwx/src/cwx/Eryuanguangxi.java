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
		if(m[i][i] != 1){  //ֻҪ��һ���Խ���Ԫ��Ϊ 0����������
			flag = false;
			break;
		}
		}
	return flag;
	}
	boolean fangzifangxin(){
		flag = true;
	for(int i = 0; i < n; ++i){
		if(m[i][i] == 1){  //ֻҪ��һ���Խ���Ԫ��Ϊ 1����������
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
			if(m[i][j] != m[j][i]){  //ֻҪ��һ�ԶԳ�Ԫ�ز���ȣ���������Գ���
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
					if(m[i][j]==1 & m[j][k]==1 & m[i][k]==0){  //ǰ����Ϊ 1��������Ϊ 0
						flag = false;
						break;
					}
				}
			}
		}
		return flag;
	}
	
	
	
	
	

}
