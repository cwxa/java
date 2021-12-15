package cwx;

import java.util.Calendar;

public class Student extends People{
	private String sNo;
	private String sMajor;
	
	
	Student(String name,String sex,int year,int month ,int date,String no,String major)
	{super( name, sex, year, month , date);
		sNo=no;
	sMajor=major;
	}
	void setNo(String no)
	{sNo=no;
	
	}
	
	void setMajor(String no)
	{sMajor=no;
	
	}
	
	String getNo()
	{
		return sNo;
	}
	
	String getMajor()
	{
		return sMajor;
	}
	
	public String toString()
	{Calendar c= Calendar.getInstance();
	//System.out.println(c.get(Calendar.YEAR));
	int a=c.get(Calendar.YEAR)-getYear()+1;
	return "学号 "+getNo()+" 姓名 "+getName()+" 性别 "+getSex()+" 年龄 "+a+" 岁 "+" 专业 "+getMajor();
	}

}
