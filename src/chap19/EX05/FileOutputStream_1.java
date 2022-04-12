package chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



// InputStream : 추상 클래스 <== FileInputStream 구현한 클래스	<== 읽어올 때
// OutputStream : 추상 클래스 <== FileOutputStream 구현한 클래스 <== 쓰기

// FileInputStream : byte() 단위 데이터 읽기.
// FileOutputStream : byte() 단위 데이터 쓰기

// windows 콘솔, 메모장 enter 넣으면 : \r\n
// MAC 		: \n

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException{
		
		// 1. 입력 파일 생성 (존재하지 않음)
		File outFile = new File ("src/chap19/EX05/FileOutput1.txt");
		
		// 2. 1-byte 읽기
		OutputStream os1 = new FileOutputStream(outFile);
				// FileOutputStream에 존재하지 않는 파일을 넣으면 실행시 생성됨.
				// FileInputStream 경로에 파일이 존재해야됨. 예외발생
		
		
		os1.write('J'); 			// write : IOException
		os1.write('A'); 
		os1.write('V'); 
		os1.write('A'); 
		os1.write('\r');  		// 13 엔터 <== 생략 가능
		os1.write('\n'); 		// 10 엔터 
			
			// 중요 : write() 메서드는 버퍼(RAM)에 쓰기, 버퍼가 꽉차면 파일에 쓰기
			// 		: flush() : 버퍼에 저장된 내용을 파일에 강제로 쓰기 할 때 사용
		
		os1.flush();  	// 버퍼가 꽉 차지 않더라도 강제로 파일에 쓰기를 한다 . <== 생략 가능 , write()를 사용하면 flush() 사용할 것을 권장.
		os1.close();	// close() 호출시 flush() 먼저 작동함
		
		// 2. n-byte 단위 쓰기 (byte[]의 offset
		
		OutputStream os2 = new FileOutputStream(outFile, true); 		// 덮어쓰기
					// FileOutputStream(File o , Boolean append) 	append = true : 이어쓰기, append = false : 덮어쓰기(기본)
		
		byte[] byteArray1 = "Hello!".getBytes(); 				// String ---> byte로 변환 :getBytes()
		
		os2.write(byteArray1);
		os2.write('\n'); 	// \r은 생략 가능, \n만 넣어도 됨.
		
		os2.flush();
		os2.close();
		
		// 3. n-byte 단위 쓰기 (byte[]의 offset 부터 length 객의 byte 데이터 쓰기.
		
		OutputStream os3 = new FileOutputStream(outFile, true); 	// 이어 쓰기
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		
		os3.write(byteArray2, 7, 8); 		// write일 때에는 7바이트 뒤에서부터 시작해서(offset) 8바이트를 읽어서 저장(length)
											// read일 때는 offset이 띄어쓰기로 생각, length는 동일
		
		os3.flush();
		os3.close();
	}

}
