package ch4;

public class Ex4_11{
    int leg;
    Ex4_11(int n){
       this.cry();   //����ʡ��this������this.cry();д��cry();
       leg=n;
       this.cry(); 
    }
    void cry(){
       System.out.println("������"+leg+"����");
    }
    public static void main(String args[]){
    	Ex4_11 cat=new Ex4_11(4);  //�����ù��췽��ʱ�����е�this���Ƕ���cat
    }
}
