package cwx;

import java.util.Calendar;

public class People {
	String pName;
	String pSex;
	
	Calendar pBirth= Calendar.getInstance();
	
	People(String name,String sex,int year,int month ,int date)
	{pName=name;
	pSex=sex;
	pBirth.set(year,month ,date);
	}
	People()
	{}
	
	void setName(String name)
	{pName=name;
	}
	void setSex(String name)
	{pSex=name;
	}
	void setBirth(int y,int m,int d)
	{pBirth.set(y, m, d);	}
	
	String getName()
	{return pName;
	
	}
	
	String getSex()
	{
	return pSex;	
	}
	String getBirth()
	{return pBirth.get(Calendar.YEAR)+" "+pBirth.get(pBirth.MONTH)+" "+pBirth.get(pBirth.DATE);}
	
	int getYear()
	{//System.out.println(pBirth.get(Calendar.YEAR));
	//System.out.println(pBirth.get(Calendar.MONTH));
	//System.out.println(pBirth.get(Calendar.DATE));
	return pBirth.get(Calendar.YEAR);
	
	}
	
	
	public String toString()
	{
		Calendar c= Calendar.getInstance();
		int a=c.YEAR-pBirth.YEAR;
		return "姓名"+getName()+"性别"+getSex()+"年龄"+a+"岁";
	}
	
}
