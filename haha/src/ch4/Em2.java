package ch4;


import java.util.Calendar;
public class Em2 {
	private String name;
	private  int birthmonth;
	private int salary;
	public Em2(String n,int m,int s){
        name=n;
        birthmonth=m;
        salary=s;
    }
	public String getName() {
		  return name;
		 }
    public String getbirthmonth() {
		  return name;
		 }    
    public void setsalary(int salary) {
		  this.salary = salary;
    }
    public double annualbonus() {
    	  return salary*3;
    	  }    
    public double getSalary(){
        Calendar ca=Calendar.getInstance();
        int m=ca.get(Calendar.MONTH)+1;
        if(birthmonth==m)
        	return salary+100;
        else return salary;
        } 
    public void SetSalary(int salary) {
		  this.salary=salary;
		 }
	public static void main(String args[]){
		Em2 a=new Em2("张旭",6,8000);
		System.out.println("姓名："+a.getName()+"\n月薪:"+a.getSalary()+"\n年终奖："+a.annualbonus());
		Em2 b=new Em2("李四",11,8000);
		System.out.println("姓名："+b.getName()+"\n月薪:"+b.getSalary()+"\n年终奖："+b.annualbonus());  	  
	}	
	}