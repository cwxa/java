package ch4;

public class Ex4_15{
    private int money;
    Ex4_15(){
       money=2000;
    } 
    private int getMoney(){
       return money;
    }
    public static void main(String args[ ]){
       Ex4_15 exa=new Ex4_15(); //对象exa在Ex4_15类中 
       exa.money=3000;
       int m=exa.getMoney();
       System.out.println("money="+m);
    }
}
