package chap03;
public class OperatorEx02 {
	public static void main(String[] args) {
		//# 크기 비교 ( <, >, <=, >= ) ====> true, false
		System.out.println(5 < 2); 		//false
		System.out.println(-5 < 5 );    //true
		System.out.println(5<=5);       //true
		System.out.println();
		
		//등가 비교 ( == (같다), != (같지 않다) ===> true, false
		// * =은 대입 연산자 : 오른쪽을 왼쪽에 넣어라
		
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println(a == b);		//false
		System.out.println(a != b);		//true
		System.out.println(a == c);		//true
		System.out.println(a != c);		//false
		
		//참조 자료형 등가 비교(객체의 메모리의 번지를 비교)
		String str1 = new String ("안녕");
		String str2 = new String ("안녕");
		
		System.out.println(str1 == str2);		//객체의 메모리의 번지를 비교하기 때문에 다르다. false
		
	}

}
