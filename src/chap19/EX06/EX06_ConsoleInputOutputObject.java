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

public class EX06_ConsoleInputOutputObject {

	public static void main(String[] args){
		File outFile = new File("src/chap19/EX06/input.txt");
		
		InputStream is = System.in;
		
		System.out.println("�ѱ۷� ������ �Է��ϼ���");
		
		OutputStream os1;
		
		byte[] byteArray1 = new byte[100];
		int count1;
		try {
			os1 = new FileOutputStream(outFile);
			count1 = is.read(byteArray1);
			
			
			os1.write(byteArray1);
			os1.flush();
			os1.close();

		} catch (FileNotFoundException e1) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}	catch (IOException e) {
			System.out.println("���� ����� �� ���ܹ߻�");
		}

		
		
		File infile = new File("src/chap19/EX06/input.txt");
		InputStream is2;
		
		
		
		try {
			is2 = new FileInputStream(infile);
			byte[] byteArray2 = new byte[100];
			int count2;
			while((count2 = is2.read(byteArray2)) != -1) {
					System.out.print(new String(byteArray2, Charset.defaultCharset()));
			}
			is2.close();
		}catch (FileNotFoundException e1) {
			System.out.println("������ �ҷ��� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("�ҷ����� �� ���� �߻�");
		}

	}

}
