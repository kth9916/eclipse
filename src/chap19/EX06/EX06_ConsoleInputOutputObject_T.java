package chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

// 콘솔에서 한글을 인풋 받고 그 값을 input.txt에 저장 후 , charactorset : default
// input.txt 파일에서 값을 읽어서 콘솔에 출력. 100바이트 정도

// 힌트 : 
		// 1. System.in :콘솔에서 인풋
		// 2. FileOutputStream : 인풋받은 값을 파일에 저장
		// 3. FileInputStream : 저장된 파일의 내용을 읽어온다
		// 4. System.out :콘솔에 출력

public class EX06_ConsoleInputOutputObject_T {

	public static void main(String[] args){
		File outFile = new File("src/chap19/EX06/input.txt");
		
		// 1. 콘솔에서 한글을 인풋 받는다. (System.in) <== byte[] 배열을 생성해서 처리 : 한글을 처리
		
		InputStream is = System.in; 	// new로 생성하지 않고 연결만 설정, 콘솔에서 인풋값을 받는다
		
		System.out.println("한글로 내용을 입력하세요");
		
		OutputStream os1;
		
		byte[] byteArray1 = new byte[100];
		int count1;
		int data;
		try {
			
			while((count1 = is.read(byteArray1)) != '\r') {
			for(int i=0; i<count1; i++) {
				System.out.print((char)byteArray1[i]);
			}
			os1 = new FileOutputStream(outFile); // 덮어 쓰기.
			os1.write(byteArray1); 	// 버퍼(RAM)에만 쓰여지고 있다.
			os1.flush(); 	// 버퍼에 쓰인 내용을 파일에 쓴다.
			
			os1.close();
			is.close();
			}
//			while((count2 = is2.read(byteArray2)) != -1) {
//			System.out.println(new String(byteArray2, Charset.defaultCharset()));
//		}
			
			// 2. 인풋 받은 한글을 파일에 저장한다. (FileOutputStream)
			

			

		} catch (FileNotFoundException e1) {
			System.out.println("파일을 찾을 수 없습니다.");
		}	catch (IOException e) {
			System.out.println("파일 만드는 중 예외발생");
		}
		
		System.out.println();
		System.out.println("입력 완료");
		
		System.out.println("===================================");
		
		
		
		
		
		
		// 3. 저장된 파일에서 값을 읽어 온다. (FileInputStream)
		InputStream is2;
		int count2;
		try {
			is2 = new FileInputStream(outFile); // read() : 한글을 처리 못한다. read(byte[]) : 한글 처리
			byte[] byteArray2 = new byte[100];
			
			count2 = is2.read(byteArray2);
			
			// 4. 읽어온 배열을 콘솔에 출력 한다.
			
			OutputStream os = System.out;
			os.write(byteArray2);
			os.flush();
			
			
//			while((count2 = is2.read(byteArray2)) != -1) {
//				System.out.println(new String(byteArray2, Charset.defaultCharset()));
//			}
			// 마무리
			is2.close();
			os.close();
		}catch (FileNotFoundException e1) {
			System.out.println("파일을 불러올 수 없습니다.");
		} catch (IOException e) {
			System.out.println("불러오는 중 예외 발생");
		}
		
		
	}

}
