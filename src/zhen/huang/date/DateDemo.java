package zhen.huang.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.net.ssl.SSLContext;

// 主要是与日期相关 有三个主要类 
// date simpledateformat calenda

// java 日期日期类的一些总结
//http://blog.csdn.net/shibenjie/article/details/4263912

public class DateDemo
{
	public static void main(String[] args) throws ParseException
	{
		//1. date 的第一个构造器 Date()
		Date date1 = new Date();
		
		//2. date 的 tostring 方法
		System.out.println(date1.toString());
		
		//3 date 的gettime方法
		Long l = date1.getTime();
		System.out.println( l  );
		
		//4. date 的第二个构造器 Date( long L)
		Date date2 =  new Date( l );
		System.out.println( date2 );
		
		//5.  关于 sql.Date 没有无参的构造方法
		java.sql.Date date = new java.sql.Date(2323233232L);
		System.out.println(date.toString());
		
		//6 .http://stackoverflow.com/questions/530012/how-to-convert-java-util-date-to-java-sql-date
		
		//7. 关于 util.date 与 sql.date 的比较介绍
		
		//8. simpleDateFormat 时间格式用于国际化
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date3 = sdf.format(new Date());
		System.out.println( "^^" + date3 ); //^^15-5-24 上午3:28
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		//日期转换成字符串
		String date4 = sdf2.format(new Date());
		System.out.println("^^" + date4); //^^2015-05-24 03:28:54
		
		//字符串转换成日期
		Date date5 = sdf.parse( "15-5-24 上午3:28" );
		System.out.println(date5);
		
		Date date6 = sdf2.parse( "2015-05-24 03:28:54"  );
		System.out.println(date6);
		
		// 1990 -01-01  三天打鱼两天晒网
		// 将时间格式的字符串转化成 date ，利用 date 的 getTime 
		// 方法计算两个date之间间隔的天数，然后 % 5进行判断比较
		String str1 = new String("1990-01-01 11:11:11");
		String str2 = new String("1990-02-01");
		getDays(str1, str2);
		
		
		
		//9. 与日历相关的一个类
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		//获取 日 月 天 日分秒等 get
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		// set 
		calendar.set(Calendar.DAY_OF_MONTH, 23);
		int day2 =  calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day2);
		
		// add
		calendar.add(Calendar.DAY_OF_MONTH, 2);
		int day3 =  calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day3);
		
		// date
	   calendar.setTime(new Date());
	   System.out.println(calendar.getTime());
	}
	
	public static void getDays(String str1,String str2) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(str1);
		Date d2 = sdf.parse(str2);
		
		Long l = d2.getTime()-d1.getTime();
		int day = (int)(l/1000/3600/24) + 1;
		
		System.out.println("day:" + day);
		
		if (day % 5 == 0 || day % 5 == 4)
		{
			System.out.println("晒网！");
		}else 
		{
			System.out.println("打鱼！");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
