package chap19.EX03;

import java.nio.charset.Charset;	// Charset 클래스

public class CreateCharsetObject {

	public static void main(String[] args) {
		
		// 문자 엔코딩 설정을 적용하는 방법 1.
		// 1. Charset.defaultCharset(); 		<== 시스템의 기본 설정을 로드 (엔코딩 타입)
		
		Charset cs1 = Charset.defaultCharset(); 	// 정적 메소드, 시스템의 기본 설정된 charset을 로드
		
		System.out.println(cs1);	// MS949 --> x-windows 949 (MS949의 확장)
									// UTF-8
		
		// 2. Charset.forname("MS949"); <== 직접 할당해서 사용.
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);
		
		Charset cs3 = Charset.forName("UTF-8");
		System.out.println(cs3);
		
		Charset cs4 = Charset.forName("EUC-KR"); 		
		System.out.println(cs4);
		
		// <== 존재하지 않는 인코딩을 넣으면 예외가 발생.  그럴 때는 실행예외 처리
		
		System.out.println();
		
		System.out.println(Charset.isSupported("MS949"));
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("UTF-16"));
		System.out.println(Charset.isSupported("EUC-KR"));
		
		
		
		
	}

}
