package ch4;

import java.util.*;
public class Em{
    private String name;
    private int birth;
    private double salary;
    Em(){    }
    Em(String n,int a,double b){
    	name=n;
    	birth=a;
    	salary=b;    }
    public void setSalary(int n){
        salary=n;    }
    public double getSalary(){
    	Calendar now = Calendar.getInstance();
    	int m=now.get(Calendar.MONTH) + 1;
    	if(m==birth){
            return salary+100;        }
        else{return salary; }}
    public String getName(){return name;}
    public int getBirth(){    return birth;}
    public String getReward(){    return "职员的年终奖为:"+salary*3;}
    public String toString(){return"职员的基本信息:名字:"+getName()+"，生日月份:"+getBirth()+"，工资:"+getSalary();}
public static void main(String args[]){
	Em e=new Em();
    Em employee=new Em("zhang",11,5000);
    System.out.println(e.toString());
    System.out.println(employee.toString());
    System.out.println(employee.getReward());}}