import java.io.IOException;
import java.util.*;

public class WordCount{

	public static void main(String[] args) throws IOException {
		//������
		System.out.println("�������ļ�����");
		
		//�����������ݽṹ
		Scanner sc = new Scanner(System.in);
		String file = sc.next();
		FileDeal fd = new FileDeal();
		String[] wFreq;
		List wordFreq;
		
		String content = fd.ReadFile(file);
		
		
	}}