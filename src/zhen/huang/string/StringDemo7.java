package zhen.huang.string;

// �Ƚ� String / StringBuffer / StringBuilder ������Ч������

public class StringDemo7
{
	public static void main(String[] args)
	{
		long startTime = 0L;
		long endTime = 0L;

		String textString = "";
		StringBuffer stringBuffer = new StringBuffer("");
		StringBuilder stringBuilder = new StringBuilder("");

		// ����String��ִ��ʱ��
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++)
		{
			textString = textString + i;
		}
		endTime = System.currentTimeMillis();
		
		System.out.println("ִ�� String ���õ�ʱ��Ϊ��" + (endTime - startTime));

		// ����stringbuffer��ʱ��
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++)
		{
			stringBuffer.append(i);
		}
		endTime = System.currentTimeMillis();

		System.out.println("ִ�� String ���õ�ʱ��Ϊ��" + (endTime - startTime));

		// ����StringBuilder��ʱ��
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++)
		{
			stringBuilder.append(i);
		}
		endTime = System.currentTimeMillis();
		
		System.out.println("ִ�� String ���õ�ʱ��Ϊ��" + (endTime - startTime));

	}

}
