package zhen.huang.string;

public class StringDemo2
{
	 public static void main(String[] args) { 
		    // ����������䴴����1������"��ɽ"�洢���ַ����������� 
		    String str1 = "��ɽ"; 
		    String str2 = "��ɽ"; 
		    System.out.println(str1==str2);//true 
		     
		    //����������䴴����3������"���"���洢���ַ����������У�����new String()����洢�ڶ��ڴ��� 
		    String str3 = new String("���"); 
		    String str4 = new String("���"); 
		    System.out.println(str3==str4);//false 
		     
		    //����������䴴����1������9�Ǵ洢��ջ�ڴ��� 
		    int i = 9; 
		    int j = 9; 
		    System.out.println(i==j);//true 
		     
		    //����û����װ�䣬����������䴴����2����������1����洢�ڶ��ڴ��� 
		    Integer l1 = new Integer(1); 
		    Integer k1 = new Integer(1); 
		    System.out.println(l1==k1);
		    //����������䴴����1������
		    //����洢��ջ�ڴ��С��Զ�װ��ʱ����ֵ��127֮���ֵ��ʹ��һ��ʵ����
		    Integer l = 20;//װ�� 
		    Integer k = 20;//װ�� 
		    System.out.println(l==k);//true 
		//����������䴴����2������i1,i2�����洢��ջ�ڴ��У�����256����洢�ڶ��ڴ��� 
		    Integer i1 = 256; 
		    Integer i2 = 256; 
		    System.out.println(i1==i2);//false 
		  } 

}
