package ch3;

import java.math.BigDecimal;                 //BigDecimal����math��
public class jch1 {
    public static void main(String[] args){
        BigDecimal num1 = new BigDecimal(2);
        BigDecimal num2 =new BigDecimal(1);
        BigDecimal num3 = new BigDecimal(1);
        BigDecimal result = new BigDecimal(0);
        BigDecimal n = new BigDecimal(101);   
        do{
            result = result.add(num3);    //result���ڱ��������һ���׳�ֵ
            num3 = num3.multiply(num1);   //num3*num1������һ���׳�ֵ
            num1 = num1.add(num2);        //num1ÿ��ѭ����1
        }while(num1.compareTo(n)<=0);     //��num1����100ʱ����ѭ��
        System.out.println("1!+2!+...+100!���ܺ�Ϊ��"+result);  //������
    }
}
