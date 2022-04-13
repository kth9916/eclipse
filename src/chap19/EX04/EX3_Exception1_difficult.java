package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
	1. is1 		<== InputStream 객체 (절대경로로 접근 : exception-ms949.txt), 예외처리
	2. is2 		<== InputStream 객체	(상대경로로 접근 : exception-utf8.txt), 예외처리(try ~ with resource로 예외처리)
					close()메소드를 자동으로 처리
*/

public class EX3_Exception1_difficult {

	public static void main(String[] args) {
		
		// 1. is1 : (절대경로로 접근 : -ms949.txt), 예외처리
		File inFile = new File("E:\\kth\\kosmo_kth\\src\\chap19\\EX04\\exception-ms949.txt");
		
		InputStream is1 = null; 			// 전역변수로 선언. finally 블락에서 is1.close
		byte[] arr = new byte[100];
		// 한글 처리 #1 : byte[] 배열 선언
		try {
			is1 = new FileInputStream(inFile); 		// 객체생성. FileUnputStream은 FileNotFoundException
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		int data = 0;
		try {
			while((data = is1.read(arr)) != -1) {
				// 한글 처리 #2 : read(byte 배열)
				String str = new String(arr,0,data, Charset.forName("MS949"));
				// 한글 처리 #3 : Setring(byte 배열, offset, length, "encoding")
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println("파일을 읽지 못하는 예외가 발생했습니다.");
		} finally {
			
		}

		System.out.println("==================================");
		
		File inFile2 = new File("src\\chap19\\EX04\\exception-utf8.txt");
					
		byte[] arr2 = new byte[100];
				// 한글처리 #1 ;
		int data2 = 0;
		try (InputStream is2 = new FileInputStream(inFile2)){
			// try(with resource : 객체 생성, RAM을 사용) <== close() 자동으로 처리된다. AutoClosable의 close() 구현한 클래스여야 한다.
			while((data2 = is2.read(arr2)) != -1) {
				// 한글처리 #2 : is.read(byte배열);
				String str2 = new String(arr2,Charset.forName("UTF-8"));
					// 한글처리 #3 : new String(byte 배열, offset(생략 가능), length(생략 가능), "encoding")
				System.out.println(str2);
			}
		}  catch (IOException e) {
			System.out.println("예외가 발생했습니다.");
		} 

	}
}
