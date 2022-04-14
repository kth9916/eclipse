package chap19.EX08;

import java.io.InputStream;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {

	public static void main(String[] args) {
		
		// 1. �ܼ� �Է� (MS949) : default charset, byte��Ʈ��.
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			// InputStreamReader : byte ==> char�� ��ȯ
			// System.in : �ܼ� �Է�, byte
			
			//isr�� ��ȯ�� char
			
			
			
			System.out.println("�ѱ��� ���ϴ� ��� �Է��ϼ���>>>");

			int data;
			while((data = isr.read()) != '\r') { 		// �ܼ� �Է� ���
					System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
		
		System.out.println();
		System.out.println("=======================================");
		
		
		// 2. �ܼ� �Է�(UTF-8)
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			// InputStreamReader : byte ==> char�� ��ȯ
			// System.in : �ܼ� �Է�, byte
			
			//isr�� ��ȯ�� char
			
			
			
			System.out.println("�ѱ��� ���ϴ� ��� �Է��ϼ���2 >>>");

			int data;
			while((data = isr.read()) != '\r') { 		// �ܼ� �Է� ���
					System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
	}

}
