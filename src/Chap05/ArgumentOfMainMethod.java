package chap05;

public class ArgumentOfMainMethod {
	public static void main(String[] ar) {	// 메인 메소드[함수]
		// 메소드의 기본 구조
		/*
		 	void main(String[] args) {		// void : 리턴값이 없음을 뜻함.
		 		메소드를 호출시 실행할 코드;		// main : 메소드명
		 									// (인풋 매개변수)
		 	}
		 */
		
		String a = ar[0];		// "안녕하세요"		: 문자열 전송
		String b = ar[1];		// 3   	: 정수
		String c = ar[2];		// 3.8 	: 실수
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println();
		
		// main 메소드에 인자값으로 정수나 실수를 넘겨줄 때 String으로 변환
		System.out.println(b + 1);	// b가 String type이라 1과 연산이 아니라 그냥 붙음 : 31
		System.out.println(c + 1);	// c가 String type이라 1과 연산이 아니라 그냥 붙음 : 3.81
		System.out.println();
		
		// String을 정수나 더블 형으로 변환해서 연산
		
		int d = Integer.parseInt(b);	// b(String) ===> Integer 타입으로 변환
		double e = Double.parseDouble(c); 	// c(String) ===> Double 형으로 변환
		
		System.out.println(d + 1);	// 4
		System.out.println(e + 1);	// 4.8
	}
}
