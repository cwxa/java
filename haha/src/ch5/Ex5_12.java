package ch5;

interface ShowMessage{
    void showTradeMark();
}
class TV implements ShowMessage{
    public void showTradeMark(){
         System.out.println("���ǵ��ӻ�");
    }
}
class PC implements ShowMessage{
     public void showTradeMark(){
         System.out.println("���ǵ���");
    }
}
public class Ex5_12{
    public static void main(String args[]){
         ShowMessage sm;                 //�����ӿڱ���sm
         sm=new TV();                    //�ӿڱ���sm�д�Ŷ��������
         sm.showTradeMark();              //�ӿ�sm�ص�showTradeMark()����
         sm=new PC();                    //�ӿڱ���sm�д�Ŷ��������
         sm.showTradeMark();              //�ӿڻص�
    } 
}
