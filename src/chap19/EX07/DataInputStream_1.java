package chap19.EX07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// InputStream : 기반 스트림
		// int ==> 5555 (문자) ==> 5555(문자) ==> int 

// DataInputStream : 추가기능을 제공하는 스트림, 기반 스트림이 반드시 존재, 단독으로 사용할 수 없다.
		// 다양한 포맷의 데이터를 빠르게 전송할 때 사용.
		// int ===> int,   double => double

public class DataInputStream_1 {

	public static void main(String[] args) {
		
		// 파일 생성
		File dataFile = new File("src\\chap19\\EX07\\file1.data"); 	// 확장자 주의 : 바이너리 데이터로 저장됨.
		
		// 데이터 쓰기 (DataOutputStream)
		try (	OutputStream os = new FileOutputStream(dataFile);
				DataOutputStream dos = new DataOutputStream(os); ){ 	// 추가 기능을 제공 : 생성자 내부에 기반스트림 포함
			
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
			
			

			
		} catch (Exception e) { 	// 모든 예외의 최상위 클래스 Exception
			
		}
		
		// 데이터 읽기 (DataInputStream)
		
		try (	InputStream is = new FileInputStream(dataFile);
				DataInputStream dis = new DataInputStream(is);
				) {
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
			
		} catch (Exception e) {}
		
		
	}

}
