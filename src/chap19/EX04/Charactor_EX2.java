package chap19.EX04;

/*
 * 힌트 : 배열 방 26개 생성해서 for문을 생성해서 출력
 A ~ Z 까지의 아스키 코드값 출력
 
 출력 결과
===========================
 A,65
 B, 66
 ...
 Z, 97
 
  a ~ z 까지의 아스키 코드값 출력
 
 출력 결과
===========================
 a,97
 b, 98
 ...
 z, 
 

 */

public class Charactor_EX2 {

	public static void main(String[] args) {
		System.out.println("1. 대문자 : A ~ Z까지의 아스키 코드값 출력");
		System.out.println();
		System.out.println("출력결과");
		System.out.println("================================");
		for(int i = 65; i < 91; i++) {
			System.out.println((char)i + " , " + i);
		}
		System.out.println();
		System.out.println("=========================================");
		System.out.println();
		
		System.out.println("2. 소문자 : a ~ z까지의 아스키 코드값 출력");
		System.out.println();
		System.out.println("출력결과");
		System.out.println("================================");
		for(int i = 97; i < 123; i++) {
			System.out.println((char)i + " , " + i);
		}
	}

}
