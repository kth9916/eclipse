package chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// FileOutputStream�� ����ؼ� �ѱ� ó��

public class FileOutputStream_2 {

	public static void main(String[] args) throws IOException {
		
		// 1. ������ ���� ����.
		File outFile = new File ("src/chap19/EX05/FileOutput2.txt"); 		// �⺻������ ��Ŭ������ default charactorSet���� ����
		
		// 2. n-byte ���� ���� ó�� (byte[]�� ó������ ������ ����) <== �ѱ��� ó��
		OutputStream os2 = new FileOutputStream(outFile);
		byte[] byteArray1 = "�ȳ��ϼ���".getBytes(Charset.forName("MS949")); 		// string ==> byte[]�� ����. : getBytes(),
					// ���� 2byte�� ó����. �� 10byte
		
		os2.write(byteArray1);
		os2.write('\n'); 	// enter
		
		os2.flush();
		os2.close();
		
		// 3. n-byte ���� (byte[]�� offset���� length ���� ����Ʈ ������ ����)
		
		OutputStream os3 = new FileOutputStream(outFile, true); // �̾ ����
		byte [] byteArray2 = "�ݰ����ϴ�.".getBytes(Charset.forName("MS949"));
		// byte [] byteArray2 = "�ݰ����ϴ�.".getBytes(Charset.defaultCharset()); 	// �⺻ charset���� ��������
		
		os3.write(byteArray2, 2, 4); 	// 2byte ���� 4byte�� �д´�
				// write(byte�迭, offset, length)
		
		// ����, ����, Ư������ <== ASCII �ڵ�� 1byte ó��
		
		os3.flush();
		os3.close();
	}

}
