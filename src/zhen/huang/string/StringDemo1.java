package zhen.huang.string;

public class StringDemo1
{
	public static void main(String[] args)
	{
		/**
		 * �ַ����Ǵ洢���ַ�����������
		 * ���д String str1 = "JavaEE"; ��ѡ��ȥ�ַ�����������Ѱ��
		 * ��û�� JavaEE ����ַ���de���ڣ������ ��ջ�е� str ����ֱ��ָ�� JavaEE ����ַ�����Ӧ��
		 * ��ַ�����û���򴴽� JavaEE��Ȼ��ָ�� JavaEE �ĵ�ַ
		 * 
		 * new �����Ķ���ȫ���洢�� ���ѡ��ռ���
		 * 
		 * �ַ������ն��Ǵ���� ���ַ����������С�
		 * 
		 * hashcode ��������ַ��������� JVM �е�λ��
		 * 
		 * ��Ҫ��� String �е� + �������ײ����� StringBuilder �е�appendʵ�ֵ�
		 * 
		 * 
		 */
		// ����ڳ�������
		String str1 = "JavaEE"; 
		System.out.println( str1.hashCode() );
		
		// ���������Ѿ����ڣ����ٴ����µ� 
		String str2 = "JavaEE";
		
		//���������Ѿ����ڣ��ڶ��д���һ���µ�String����ֵΪ JavaEE
		String str3 = new String("JavaEE");
		System.out.println( str1.hashCode() );
		
		//�ַ���������ӣ�ֱ����
		String str4 = "JavaEE" + "Android"; //�ַ����� + ����ʱ��ν��е�
		
		String str5 = "Android";
		
		String str6 = str1 + str5 ;
		
		str5 = str5 + "Handoop";
		
		String str7 = str6.intern();
		String str8 = "JavaEEAndorid";
		
		
		// �ж�
		System.out.println( str1 == str2   ); //true
		System.out.println( str1 == str3   ); //false
		System.out.println( str1.equals(str3)  ); //true
		
		System.out.println( str4 == str6   ); //false
		System.out.println( str4.equals(str6)  ); //true
		System.out.println( str4 == str7   ); //false
		System.out.println( str4 == str8   ); //false
		
		Person person1 = new Person("���");
		Person person2 = new Person("���");
		System.out.println( person1.name == person2.name );
		
	}
}

class Person
{
	String name;
	Person(String name)
	{
		this.name = name ;
	}
}



