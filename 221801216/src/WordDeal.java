import java.util.*;
import java.util.Map.Entry;

public class WordDeal // �������ڽ����ļ��еĵ��ʵȴ���
{
	
	private int charNum; //ͳ���ַ���
	String content;//�����ļ�

	//// ͳ���ļ��ַ���
	public int getCharCount() 
	{
		char c;
		int i=0;
		while (i<(content.length())) 
		{
			c = content.charAt(i);
			if (c >= 32 && c <= 126 || c == '\r' || c == '\n' || c == '\t') 
			{
				charNum++;
			}
			i++;
		}
		return charNum;
	}

}