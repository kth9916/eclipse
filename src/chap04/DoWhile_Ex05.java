package chap04;
public class DoWhile_Ex05 {
	public static void main(String[] args) {
		
		//1. While 문과 Do While 문의 비교 : 실행이 0인 경우
		
		int a = 0;
		while (a < 0) {
			System.out.print(a + " ");	//조건이 true일때만 실행됨.
			a++;
		}
		
		System.out.println("==============");
		
		a = 0;
		do {
			System.out.println(a + " ");	//do while에서 무조건 1번 실행됨.
			a++;
		} while (a < 0); 	//조건이 false
		
		
		System.out.println("=====반복 횟수가 1인 경우======");
		
		//2. 반복 횟수가 1인 경우
		
		a = 0;
		while (a < 1) {
			System.out.println(a + " ");
			a++;
		}
		
		
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		} while ( a<0);
		
		System.out.println();
		System.out.println("====반복 횟수가 10인 경우=====");
		
		// 반복 횟수가 10인 경우
		a=0;
		while(a<10) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while(a<10);
		
		
		
		
		
		
		
	}
	

}
