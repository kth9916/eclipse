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

public class EX06_ConsoleInputOutputObject {

	public static void main(String[] args){
		File outFile = new File("src/chap19/EX06/input.txt");
		
		InputStream is = System.in;
		
		System.out.println("한글로 내용을 입력하세요");
		
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
			System.out.println("파일을 찾을 수 없습니다.");
		}	catch (IOException e) {
			System.out.println("파일 만드는 중 예외발생");
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
			System.out.println("파일을 불러올 수 없습니다.");
		} catch (IOException e) {
			System.out.println("불러오는 중 예외 발생");
		}

	}

}
