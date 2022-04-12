package chap19.EX03;

import java.io.UnsupportedEncodingException;

// UTF-16 ���� ���� : �ѱ�, ���� ��� 2byte�� ǥ��
		// ���� ó�� 2byte BOM�ĺ� �ڵ尡 �߰���.

// UTF-8 ���� ���� : ���� : 1byte, �ѱ� : 3byte

public class UTF16_VS_UTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		byte[] b1 = "abc".getBytes("UTF-16"); 		// ���ڿ��� ==> byte[]
				// BOM �ĺ� �ڵ� 2byte
				// abc : 6byte
		
		byte[] b2 = "abc".getBytes("UTF-8"); 		
		
		System.out.println(b1.length); 			// 8 : 2(BOM) + 6(abc)
		System.out.println(b2.length);
		
		System.out.println(new String(b1, "UTF-16"));
		System.out.println(new String(b2, "UTF-8"));
		
		
		for(byte b : b1) {
			System.out.printf("%02X ",b); 	// 16������ ���
		}
		System.out.println();
		System.out.println("=========================================");
		
		
		for(byte b : b2) {
			System.out.printf("%02X ", b);
		}
		System.out.println();
		System.out.println("=========================");
		
		byte[] b3 = "�����ٶ�".getBytes("UTF-16");
		byte[] b4 = "�����ٶ�".getBytes("UTF-8");
		
		System.out.println(b3.length); 		// BOM(2byte) + �����ٶ�(8byte)
		System.out.println(b4.length);
		
		System.out.println("============================");
		
		for(byte b : b3) {
			System.out.printf("%02X ", b);
		}
		
		System.out.println();
		
		for(byte b : b4) {
			System.out.printf("%02X ", b);
		}
		
		System.out.println();
		System.out.println("==============================");
		
		System.out.println(new String(b3, "UTF-16"));
		System.out.println(new String(b4, "UTF-8"));
		
		
		
		
 	}

}
