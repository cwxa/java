package ch3;

import java.math.BigDecimal;                 //BigDecimal类在math中
public class jch1 {
    public static void main(String[] args){
        BigDecimal num1 = new BigDecimal(2);
        BigDecimal num2 =new BigDecimal(1);
        BigDecimal num3 = new BigDecimal(1);
        BigDecimal result = new BigDecimal(0);
        BigDecimal n = new BigDecimal(101);   
        do{
            result = result.add(num3);    //result等于本身加上下一个阶乘值
            num3 = num3.multiply(num1);   //num3*num1等于下一个阶乘值
            num1 = num1.add(num2);        //num1每次循环加1
        }while(num1.compareTo(n)<=0);     //当num1大于100时跳出循环
        System.out.println("1!+2!+...+100!的总和为："+result);  //输出结果
    }
}
