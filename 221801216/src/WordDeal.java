import java.util.*;
import java.util.Map.Entry;

public class WordDeal // �������ڽ����ļ��еĵ��ʵȴ���
{
	
	private int charNum; //ͳ���ַ���
	String content;//�����ļ�
	private int wordCount; // ��������
	private int validLine;//��Ч����

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
	
	//ͳ�Ƶ�������
	public int getWordCount() 
	{
		String s= content;
		//��"\\"�����ִ�
		String[] sp = s.split("\\s"); 
		for (int i = 0; i < sp.length; i++) 
		{
			// �жϳ����Ƿ���ڵ���4,��Ϊֻ�д���4�Ĳų�Ϊ����
			if (sp[i].length() < 4) 
			{ 
				continue;
			} 
			else 
			{
				// �ж��ַ�����ǰ��λ�Ƿ���Ӣ����ĸ
				int flag = 1; 
				char c;
				for (int j = 0; j < 4; j++) 
				{
					c = sp[i].charAt(j);
					if (!(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) 
					{
						flag = 0;
					}
				}
				if (flag == 1) 
				{
					wordCount++;
				}
			}
		}
		return wordCount;
	}
	
	
	// ͳ����Ч����
	public int getLineCount() 
	{ 
		//��ÿһ�зֿ�����һ���ַ�������
		String[] line = content.split("\n"); 
		// �ҳ���Ч�У�ͳ����Ч��
		for (int i = 0; i < line.length; i++) 
		{ 

			if (line[i].trim().length() == 0)
				continue;
			validLine = validLine + 1;
		}
		return validLine;
	}
}