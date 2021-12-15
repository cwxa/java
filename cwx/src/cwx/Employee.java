package cwx;
import java.util.Calendar;
public class Employee {
	private String name;
	private int date;
	private int yuexin;
	boolean bir;
	
	Employee(){}
	Employee(String s,int i,int j)
	{name=s;
	date=i;
	Calendar ca=Calendar.getInstance();
	int m=ca.get(Calendar.MONTH)+1;
	if(date==m)
	{yuexin=j+100;
	bir=true;}
	else
		{yuexin=j;
		bir=false;
		}
	}
	
	public void setyuexin(int i)
	{yuexin=i;}
	int an(){
		if(bir)
		return (yuexin-100)*3;
		else
			return yuexin*3;
	}
	public String getname()
	{
		return name;
	}
	public int getdate()
	{
		return date;
	}
	public int getyuexin()
	{
		return yuexin;
	}
	public String toString()
	{return name+"ÔÂĞ½"+yuexin+"ÄêÖÕ½±"+an();}
		}
	
	
	

	
