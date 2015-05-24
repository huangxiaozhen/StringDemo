package zhen.huang.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.net.ssl.SSLContext;

// ��Ҫ����������� ��������Ҫ�� 
// date simpledateformat calenda

public class DateDemo
{
	public static void main(String[] args) throws ParseException
	{
		//1. date �ĵ�һ�������� Date()
		Date date1 = new Date();
		
		//2. date �� tostring ����
		System.out.println(date1.toString());
		
		//3 date ��gettime����
		Long l = date1.getTime();
		System.out.println( l  );
		
		//4. date �ĵڶ��������� Date( long L)
		Date date2 =  new Date( l );
		System.out.println( date2 );
		
		//5.  ���� sql.Date û���޲εĹ��췽��
		java.sql.Date date = new java.sql.Date(2323233232L);
		System.out.println(date.toString());
		
		//6 .http://stackoverflow.com/questions/530012/how-to-convert-java-util-date-to-java-sql-date
		
		//7. ���� util.date �� sql.date �ıȽϽ���
		
		//8. simpleDateFormat ʱ���ʽ���ڹ��ʻ�
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date3 = sdf.format(new Date());
		System.out.println( "^^" + date3 ); //^^15-5-24 ����3:28
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		//����ת�����ַ���
		String date4 = sdf2.format(new Date());
		System.out.println("^^" + date4); //^^2015-05-24 03:28:54
		
		//�ַ���ת��������
		Date date5 = sdf.parse( "15-5-24 ����3:28" );
		System.out.println(date5);
		
		Date date6 = sdf2.parse( "2015-05-24 03:28:54"  );
		System.out.println(date6);
		
		// 1990 -01-01  �����������ɹ��
		// ��ʱ���ʽ���ַ���ת���� date ������ date �� getTime 
		// ������������date֮������������Ȼ�� % 5�����жϱȽ�
		String str1 = new String("1990-01-01 11:11:11");
		String str2 = new String("1990-02-01");
		getDays(str1, str2);
		
		
		
		//9. ��������ص�һ����
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		//��ȡ �� �� �� �շ���� get
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
			System.out.println("ɹ����");
		}else 
		{
			System.out.println("���㣡");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
