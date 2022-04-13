package chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex06_ConsoleInputOutputObjectteacher {
	public static void main(String[] args) throws IOException {
		
		//1. 콘솔에서 한글을 인풋 받는다.(System.in)	<== byte[] 배열을 생성해서 처리 : 한글을 처리
		InputStream is = System.in;		//new로 생성하지 않고 연결만 설정
		
		System.out.println("한글을 입력하세요 >>>");
		
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);		//byteArray1 에 byte로 \r\n 을 포함하여 , count1은 배열에 값이 들어 온 갯수
		//int data = is.read();		//한글을 처리하지 못한다. data에는 1byte read한 값이 저장
		
		//2. 인풋받은 한글을 파일에 저장한다.(FileOutputStream)
		File f1 = new File("src\\chap19\\Ex06\\input.txt");
		OutputStream fos = new FileOutputStream(f1);	//덮어 쓰기
		
		fos.write(byteArray1);		//버퍼 (RAM)에만 쓰여짐.
		fos.flush();				//버퍼에 쓰인 내용을 파일에 쓰기.
		
		//3. 저장된 파일에서 값을 읽어 온다.(FileInputStream)
		InputStream fis = new FileInputStream(f1);	//read() : 한글을 처리 못한다(한글은 2byte read()는1byte씩). read(byte[]) : 한글처리
		byte[] byteArray2 = new byte[100];
		
		int count2 = fis.read(byteArray2);	//read(byte[]) : 한글처리
		//int data2 = fis.read()			//read() : 1byte씩 읽어온다.
		
		System.out.println();
		System.out.println("파일에서 읽은 내용을 콘솔에 출력합니다. >>>");
		System.out.println();
		
		//4. 읽어온 배열을 콘솔에 출력한다.(System.out)
		OutputStream os = System.out;		//콘솔에 출력 : byte[]
		os.write(byteArray2);
		os.flush();
		
		is.close();
		fos.close();
		fis.close();
		os.close();
		
		
		
		
		
		
	}

}
