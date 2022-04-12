package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

// windows = 콘솔, 메모장에서 Enter : \r\n , \r 생략이 될 수 있다. 	\n만으로도 처리가 가능하다. write('\n')

public class ConsoleInputObject_2 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in; 	// is 콘솔을 통해서 인풋을 받겠다.
				// System.in은 한 페이지에서 한 번만 만들 수 있다.
		
		
		System.out.println("영문만 입력하세요");
		
		// 1. 1-byte 단위 읽기
		
		int data;
		while( (data = is.read()) != '\r') { 		// \r까지 들어감 	<== is.read() 호출될 때 콘솔에서 인풋을 대기
			System.out.print((char)data);
		}
		
		is.read(); 		//10 <== \n 		// 버퍼에 \n 남아있음. 버퍼에서 \n을 처리해 줘야 합니다. 그렇지 않으면 다음 read()에서 \n 들어가 버림.
		//	\n을 버퍼에서 끄집어 낸다.
		System.out.println();
		System.out.println();
		System.out.println("================================================");
		
		// 2. n-byte 읽기(byte[]의 처음 위치에서 읽은 데이터 저장)
		byte[] byteArray1 = new byte[100];		// 콘솔에서 배열에 저장될 때, \r\n까지 들어간다.
		int count1 = is.read(byteArray1); 		// count1은 100, 100, 30, -1
			// count1 배열에서 읽은 값의 갯수를 저장.
		
		for(int i=0; i < count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println(" : count1 = " + count1);
		}
		
		
		int count2;
		
		count2 = is.read(byteArray1); 			// 배열 내부에 \r\n 들어간다.
		System.out.println(new String(byteArray1,0,count2));
		
		/*
		while((count2 = is.read(byteArray1)) != '\r') { 		// 콘솔에서는 -1을 사용하지 않고 , \r로 처리
			System.out.println(new String(byteArray1));
		}
		
		//is.read(); // \n을 버퍼에서 끄집어 내는 역할 <<====버퍼에서 빼지 않아야 한다. 	// 배열 내부에 \r과 \n이 들어가서 
		
		System.out.println("==============================");
		*/
		
		// 3. n-byte 단위로 읽고 (length 만큼 읽어 와서 byte[] offset 위치에서 저장.
		
		byte[] byteArray3 = new byte[8];
		int offset = 3;
		int length = 5;
		
		int count3 = is.read(byteArray3,offset, length);
		
		for(int i = 0; i < offset + length; i++) {
			System.out.print((char) byteArray3[i]);
		}
		
		is.close(); 		// 제일 마지막에 처리해줘야 한다. 중간에 close()하면 
	}

}
