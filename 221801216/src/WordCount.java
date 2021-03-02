import java.io.IOException;
import java.util.*;

public class WordCount
{

	public static void main(String[] args) throws IOException 
	{
		//������
		System.out.println("�������ļ�����");
		
		//�����������ݽṹ
		Scanner sc = new Scanner(System.in);
		String file = sc.next();
		FileDeal fd = new FileDeal();
		String[] wFreq;
		List wordFreq;
		
		String content = fd.ReadFile(file);
		WordDeal wd = new WordDeal(content);
		
		// �������еķ�����ȡ��Ӧ����ֵ
	    int charNum = wd.getCharCount();
		int wordCount = wd.getWordCount();
		int validLine = wd.getLineCount();
		wordFreq = wd.getWordFreq();
		
		wFreq = wd.ListToArray(wordFreq);
		String w = "characters:"+charNum+ "\n" +"words:"+ wordCount + "\n" + "lines:"+validLine + "\n";
		for (int i = 0; i < wFreq.length; i++) 
		{
			w = w + wFreq[i] + "\n";
		}
		System.out.println(w);
		fd.WriteToFile(w);
	}
}