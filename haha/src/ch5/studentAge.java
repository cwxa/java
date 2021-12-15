package ch5;


import java.util.Calendar;

public class studentAge {
	public static void main(String args[])
	{
		Calendar zhangsanBirth = Calendar.getInstance();
		zhangsanBirth.set(1999, 9, 9);
		Student1 s1 = new Student1("张三", "男", zhangsanBirth, "B17010101", "软件工程");
		System.out.println(s1);
	}
}

class People
{
	private String pName;
	private String pSex;
	private Calendar pBirth;
	People(String name, String sex, Calendar birth)
	{
		this.pName = name;
		this.pSex = sex;
		this.pBirth = birth;
	}
	String setName(String name)
	{
		this.pName = name;
		return this.pName;
	}
	String setSex(String sex)
	{
		this.pSex = sex;
		return this.pSex;
	}
	Calendar setBirth(Calendar birth)
	{
		this.pBirth = birth;
		return this.pBirth;
	}
	String getName()
	{
		return this.pName;
	}
	String getSex()
	{
		return this.pSex;
	}
	Calendar getBerth()
	{
		return this.pBirth;
	}
	public String toString()
	{
		String result = this.pName + "、" + this.pSex + "、";
		Calendar now = Calendar.getInstance();
		int nowYear = now.get(Calendar.YEAR);
		int birthYear = this.pBirth.get(Calendar.YEAR);
		int age = nowYear - birthYear;
		result += "年龄：" + age + "岁";
		return result;
	}
}

class Student1 extends People
{
	private String sNo;
	private String sMajor;
	Student1(String name, String sex, Calendar birth, String No, String major)
	{
		super(name, sex, birth);
		this.sNo = No;
		this.sMajor = major;
	}
	String setNo(String No)
	{
		this.sNo = No;
		return this.sNo;
	}
	String setMajor(String major)
	{
		this.sMajor = major;
		return this.sMajor;
	}
	String getNo()
	{
		return this.sNo;
	}
	String getMajor()
	{
		return this.sMajor;
	}
	public String toString()
	{
		String result = super.toString();
		result = this.sNo + "、" + result + "、" + this.sMajor;
		return result;
	}
}