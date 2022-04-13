package chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

// �ֿܼ��� �ѱ��� ��ǲ �ް� �� ���� input.txt�� ���� �� , charactorset : default
// input.txt ���Ͽ��� ���� �о �ֿܼ� ���. 100����Ʈ ����

// ��Ʈ : 
		// 1. System.in :�ֿܼ��� ��ǲ
		// 2. FileOutputStream : ��ǲ���� ���� ���Ͽ� ����
		// 3. FileInputStream : ����� ������ ������ �о�´�
		// 4. System.out :�ֿܼ� ���

public class EX06_ConsoleInputOutputObject_T {

	public static void main(String[] args){
		File outFile = new File("src/chap19/EX06/input.txt");
		
		// 1. �ֿܼ��� �ѱ��� ��ǲ �޴´�. (System.in) <== byte[] �迭�� �����ؼ� ó�� : �ѱ��� ó��
		
		InputStream is = System.in; 	// new�� �������� �ʰ� ���Ḹ ����, �ֿܼ��� ��ǲ���� �޴´�
		
		System.out.println("�ѱ۷� ������ �Է��ϼ���");
		
		OutputStream os1;
		
		byte[] byteArray1 = new byte[100];
		int count1;
		int data;
		try {
			
			while((count1 = is.read(byteArray1)) != '\r') {
			for(int i=0; i<count1; i++) {
				System.out.print((char)byteArray1[i]);
			}
			os1 = new FileOutputStream(outFile); // ���� ����.
			os1.write(byteArray1); 	// ����(RAM)���� �������� �ִ�.
			os1.flush(); 	// ���ۿ� ���� ������ ���Ͽ� ����.
			
			os1.close();
			is.close();
			}
//			while((count2 = is2.read(byteArray2)) != -1) {
//			System.out.println(new String(byteArray2, Charset.defaultCharset()));
//		}
			
			// 2. ��ǲ ���� �ѱ��� ���Ͽ� �����Ѵ�. (FileOutputStream)
			

			

		} catch (FileNotFoundException e1) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}	catch (IOException e) {
			System.out.println("���� ����� �� ���ܹ߻�");
		}
		
		System.out.println();
		System.out.println("�Է� �Ϸ�");
		
		System.out.println("===================================");
		
		
		
		
		
		
		// 3. ����� ���Ͽ��� ���� �о� �´�. (FileInputStream)
		InputStream is2;
		int count2;
		try {
			is2 = new FileInputStream(outFile); // read() : �ѱ��� ó�� ���Ѵ�. read(byte[]) : �ѱ� ó��
			byte[] byteArray2 = new byte[100];
			
			count2 = is2.read(byteArray2);
			
			// 4. �о�� �迭�� �ֿܼ� ��� �Ѵ�.
			
			OutputStream os = System.out;
			os.write(byteArray2);
			os.flush();
			
			
//			while((count2 = is2.read(byteArray2)) != -1) {
//				System.out.println(new String(byteArray2, Charset.defaultCharset()));
//			}
			// ������
			is2.close();
			os.close();
		}catch (FileNotFoundException e1) {
			System.out.println("������ �ҷ��� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("�ҷ����� �� ���� �߻�");
		}
		
		
	}

}
