package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

// windows = �ܼ�, �޸��忡�� Enter : \r\n , \r ������ �� �� �ִ�. 	\n�����ε� ó���� �����ϴ�. write('\n')

public class ConsoleInputObject_2 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in; 	// is �ܼ��� ���ؼ� ��ǲ�� �ްڴ�.
				// System.in�� �� ���������� �� ���� ���� �� �ִ�.
		
		
		System.out.println("������ �Է��ϼ���");
		
		// 1. 1-byte ���� �б�
		
		int data;
		while( (data = is.read()) != '\r') { 		// \r���� �� 	<== is.read() ȣ��� �� �ֿܼ��� ��ǲ�� ���
			System.out.print((char)data);
		}
		
		is.read(); 		//10 <== \n 		// ���ۿ� \n ��������. ���ۿ��� \n�� ó���� ��� �մϴ�. �׷��� ������ ���� read()���� \n �� ����.
		//	\n�� ���ۿ��� ������ ����.
		System.out.println();
		System.out.println();
		System.out.println("================================================");
		
		// 2. n-byte �б�(byte[]�� ó�� ��ġ���� ���� ������ ����)
		byte[] byteArray1 = new byte[100];		// �ֿܼ��� �迭�� ����� ��, \r\n���� ����.
		int count1 = is.read(byteArray1); 		// count1�� 100, 100, 30, -1
			// count1 �迭���� ���� ���� ������ ����.
		
		for(int i=0; i < count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println(" : count1 = " + count1);
		}
		
		
		int count2;
		
		count2 = is.read(byteArray1); 			// �迭 ���ο� \r\n ����.
		System.out.println(new String(byteArray1,0,count2));
		
		/*
		while((count2 = is.read(byteArray1)) != '\r') { 		// �ֿܼ����� -1�� ������� �ʰ� , \r�� ó��
			System.out.println(new String(byteArray1));
		}
		
		//is.read(); // \n�� ���ۿ��� ������ ���� ���� <<====���ۿ��� ���� �ʾƾ� �Ѵ�. 	// �迭 ���ο� \r�� \n�� ���� 
		
		System.out.println("==============================");
		*/
		
		// 3. n-byte ������ �а� (length ��ŭ �о� �ͼ� byte[] offset ��ġ���� ����.
		
		byte[] byteArray3 = new byte[8];
		int offset = 3;
		int length = 5;
		
		int count3 = is.read(byteArray3,offset, length);
		
		for(int i = 0; i < offset + length; i++) {
			System.out.print((char) byteArray3[i]);
		}
		
		is.close(); 		// ���� �������� ó������� �Ѵ�. �߰��� close()�ϸ� 
	}

}
