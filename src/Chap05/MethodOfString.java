package chap05;

import java.util.Arrays;

public class MethodOfString {
	public static void main(String[] args) {
		// 1. 문자열 길이 ( length() ) : int 타입으로 반환
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
			// str1 : 참조변수, 객체, 인스턴스
		
		System.out.println(str1.length()); 	//11
		System.out.println(str2.length()); 	//13
				//자바에서 length는 글자수를 뜻함. (한글)
		System.out.println(str1.length()+str2.length()); 	//정수로 변환이 되었기 때문에 연산 가능
		System.out.println();
		
		// 2. 문자열 검색 (charAt(), indexOf(), lastIndexOf())
		System.out.println(str1.charAt(1));  	// 1번 방의 문자를 출력 // e
		System.out.println(str2.charAt(1));  	// 1번 방의 문자를 출력 // 녕
		System.out.println();
		
		//indexOf() : 0번째 방에서 부터 마지막 방까지 글자의 방번호(index)를 출력
		//lastIndexOf() : 마지막 방부터 0번째 방으로 글자의 방번호를 출력
		
		System.out.println(str1.indexOf('a')); //7
		System.out.println(str1.lastIndexOf('a'));//9
		System.out.println(str1.indexOf('a', 8)); // 8번방에서부터 오른쪽으로 검색 시작
		System.out.println(str1.lastIndexOf('a', 8)); // 8번방에서 부터 왼쪽으로 검색 시작
		System.out.println(str1.indexOf("Java")); //6번방부터 Java 문자열이 시작
		System.out.println(str1.lastIndexOf("Java")); // 6번
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		System.out.println(str1.lastIndexOf("bye"));    	//<<중요>> : -1 (값이 존재하지 않는 경우)
		System.out.println();
		
		// 3. 문자열 변환 및 연결 (String.valueof(), concat())
		// String.valueof(기본자료형) : 기본자료형 ==> String으로 변환
		String str3 = String.valueOf(2.3); // 실수 2.3을 String형으로 변환
		String str4 = String.valueOf(false); 	// boolean 타입 false를 String으로 변환해라
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		//concat() : 문자열과 문자열을 연결 : +연산자와 같음
		String str5 = str3.concat(str4);
		System.out.println(str5);
		System.out.println();
		
		// concat() 메소드에서 String.valueof 사용 =====> + (자동으로 타입변환)
		String str6 = "안녕" + 3; 	// 안녕3, + : 연산자를 사용할 때 자동 변화
		String str7 = "안녕".concat(String.valueOf(3)); 	// concat을 사용할 때 String 타입으로 변환 필요
		System.out.println(str6);
		System.out.println(str7);
		System.out.println();
		
		//4. 문자열 ==> byte[] 타입으로 변환, 입출력 값을 처리할 때 사용.
			// (getBytes(),
			// 문자열 ====> char[] (toCharArray())
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		
		// getBytes() : 문자열 ==> byte[] 변환
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		
		System.out.println(Arrays.toString(array1)); 	//아스키 코드가 출력 (11)
		System.out.println(Arrays.toString(array2));
		
		//toCharArray() 문자열 => char[] 로 변환
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
		
		
		
		
		
		
		
	}

}
