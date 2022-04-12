package chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



// InputStream : �߻� Ŭ���� <== FileInputStream ������ Ŭ����	<== �о�� ��
// OutputStream : �߻� Ŭ���� <== FileOutputStream ������ Ŭ���� <== ����

// FileInputStream : byte() ���� ������ �б�.
// FileOutputStream : byte() ���� ������ ����

// windows �ܼ�, �޸��� enter ������ : \r\n
// MAC 		: \n

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException{
		
		// 1. �Է� ���� ���� (�������� ����)
		File outFile = new File ("src/chap19/EX05/FileOutput1.txt");
		
		// 2. 1-byte �б�
		OutputStream os1 = new FileOutputStream(outFile);
				// FileOutputStream�� �������� �ʴ� ������ ������ ����� ������.
				// FileInputStream ��ο� ������ �����ؾߵ�. ���ܹ߻�
		
		
		os1.write('J'); 			// write : IOException
		os1.write('A'); 
		os1.write('V'); 
		os1.write('A'); 
		os1.write('\r');  		// 13 ���� <== ���� ����
		os1.write('\n'); 		// 10 ���� 
			
			// �߿� : write() �޼���� ����(RAM)�� ����, ���۰� ������ ���Ͽ� ����
			// 		: flush() : ���ۿ� ����� ������ ���Ͽ� ������ ���� �� �� ���
		
		os1.flush();  	// ���۰� �� ���� �ʴ��� ������ ���Ͽ� ���⸦ �Ѵ� . <== ���� ���� , write()�� ����ϸ� flush() ����� ���� ����.
		os1.close();	// close() ȣ��� flush() ���� �۵���
		
		// 2. n-byte ���� ���� (byte[]�� offset
		
		OutputStream os2 = new FileOutputStream(outFile, true); 		// �����
					// FileOutputStream(File o , Boolean append) 	append = true : �̾��, append = false : �����(�⺻)
		
		byte[] byteArray1 = "Hello!".getBytes(); 				// String ---> byte�� ��ȯ :getBytes()
		
		os2.write(byteArray1);
		os2.write('\n'); 	// \r�� ���� ����, \n�� �־ ��.
		
		os2.flush();
		os2.close();
		
		// 3. n-byte ���� ���� (byte[]�� offset ���� length ���� byte ������ ����.
		
		OutputStream os3 = new FileOutputStream(outFile, true); 	// �̾� ����
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		
		os3.write(byteArray2, 7, 8); 		// write�� ������ 7����Ʈ �ڿ������� �����ؼ�(offset) 8����Ʈ�� �о ����(length)
											// read�� ���� offset�� ����� ����, length�� ����
		
		os3.flush();
		os3.close();
	}

}
