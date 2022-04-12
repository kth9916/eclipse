package chap05;

public class PlusOperationOfString {

	public static void main(String[] args) {
		//1. 문자열 + 문자열
		String str1 = "안녕" + "하세요" + "!";
		System.out.println(str1);
		
		String str2 = "반갑";
		str2 += "습니다"; 		//str2 = str2 + "습니다"
		str2 += "!";			//str2 = str2 + "!"
		System.out.println(str2);
		
		//2. 문자열 + 기본자료형 // 기본 자료형이 문자열로 변환
		String str3 = "안녕" + 1;  	// 안녕1 	- 기본자료형이 jvm에 의해 string으로 바뀜
		String str4 = "안녕" + String.valueOf(1); // 안녕1
		String str5 = "안녕" + "1"; // 안녕1
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println();
		
		// 3. 문자열과 기본 자료형을 혼용해서 사용하는 경우
		System.out.println(1 + "안녕"); 	//1이 뒤의 string에 영향 받아서 string 됨
		System.out.println(1 + "안녕" + 2); 	// 1과 2는 가운데 string의 영향 받아 string됨
		System.out.println("안녕" + 1 + 2); // 1이 string의 영향을 받고 2는 앞의 string이 된 1의 영향을 받아 string이 됨
		System.out.println("안녕" + (1+2)); // 괄호가 우선순위가 높기 때문에 연산이 되어 3이 되고 앞 string의 영향 받아 string이 됨
		System.out.println(1+2 + "안녕"); 	// 1은 정수형으로 2와 연산이 되어 3이 되고 뒤의 string 영향 받아 string이 됨
		
		
		
	}

}
