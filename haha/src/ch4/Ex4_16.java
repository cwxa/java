package ch4;

class Employee{
    private double salary=1800;           //˽�г�Ա����
    public void setSalary(double salary)  //���з���
    {
      if(salary>1800&&salary<=6000){
          this.salary=salary;
      }
    }
    public double getSalary()     //���з���
    { 
      return salary;
    }
}
public class Ex4_16{
    public static void main(String args[]){
      Employee zhang=new Employee(); 
      Employee wang=new Employee();  
      zhang.setSalary(100); 
      System.out.println("zhang��нˮ��"+zhang.getSalary()); 
      wang.setSalary(3888);     //wang.salary=88888;�ǷǷ��ģ���Ϊ����wang�Ѿ�����Employee���� 
      System.out.println("wang��нˮ��"+wang.getSalary()); 
    }
}
