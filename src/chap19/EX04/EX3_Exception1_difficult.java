package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
	1. is1 		<== InputStream ��ü (�����η� ���� : exception-ms949.txt), ����ó��
	2. is2 		<== InputStream ��ü	(����η� ���� : exception-utf8.txt), ����ó��(try ~ with resource�� ����ó��)
					close()�޼ҵ带 �ڵ����� ó��
*/

public class EX3_Exception1_difficult {

	public static void main(String[] args) {
		
		// 1. is1 : (�����η� ���� : -ms949.txt), ����ó��
		File inFile = new File("E:\\kth\\kosmo_kth\\src\\chap19\\EX04\\exception-ms949.txt");
		
		InputStream is1 = null; 			// ���������� ����. finally ������� is1.close
		byte[] arr = new byte[100];
		// �ѱ� ó�� #1 : byte[] �迭 ����
		try {
			is1 = new FileInputStream(inFile); 		// ��ü����. FileUnputStream�� FileNotFoundException
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		int data = 0;
		try {
			while((data = is1.read(arr)) != -1) {
				// �ѱ� ó�� #2 : read(byte �迭)
				String str = new String(arr,0,data, Charset.forName("MS949"));
				// �ѱ� ó�� #3 : Setring(byte �迭, offset, length, "encoding")
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻��߽��ϴ�.");
		} finally {
			
		}

		System.out.println("==================================");
		
		File inFile2 = new File("src\\chap19\\EX04\\exception-utf8.txt");
					
		byte[] arr2 = new byte[100];
				// �ѱ�ó�� #1 ;
		int data2 = 0;
		try (InputStream is2 = new FileInputStream(inFile2)){
			// try(with resource : ��ü ����, RAM�� ���) <== close() �ڵ����� ó���ȴ�. AutoClosable�� close() ������ Ŭ�������� �Ѵ�.
			while((data2 = is2.read(arr2)) != -1) {
				// �ѱ�ó�� #2 : is.read(byte�迭);
				String str2 = new String(arr2,Charset.forName("UTF-8"));
					// �ѱ�ó�� #3 : new String(byte �迭, offset(���� ����), length(���� ����), "encoding")
				System.out.println(str2);
			}
		}  catch (IOException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		} 

	}
}
