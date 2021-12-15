package ch4;

class Employee{
    private double salary=1800;           //私有成员变量
    public void setSalary(double salary)  //公有方法
    {
      if(salary>1800&&salary<=6000){
          this.salary=salary;
      }
    }
    public double getSalary()     //公有方法
    { 
      return salary;
    }
}
public class Ex4_16{
    public static void main(String args[]){
      Employee zhang=new Employee(); 
      Employee wang=new Employee();  
      zhang.setSalary(100); 
      System.out.println("zhang的薪水："+zhang.getSalary()); 
      wang.setSalary(3888);     //wang.salary=88888;是非法的，因为对象wang已经不在Employee类中 
      System.out.println("wang的薪水："+wang.getSalary()); 
    }
}
