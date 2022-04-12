package chap18.EX03;

import java.util.Scanner;

//1. 스캐너를 사용해서 double의 두 수를 인풋 받습니다.
//2. 방법 1. 람다식을 사용해서 인풋받은 두 값을 +,-,*,/ 사칙연산을 구현해서 출력.
//3. 방법 2. 인터페이스를 구현한 자식 객체 사용해서 인풋받은 두 값을 +,-,*,/ 사칙연산을 구현해서 출력.
//4. 방법 3. 익명 이너클래스를 사용해서 인풋받은 두 값을 +,-,*,/ 사칙연산을 구현해서 출력
//5. AritimeticException 처리 : 0으로 나누면 예외 발생이 되므로 예외 처리, int(0) , double <<== 해당 사항이 아님

// 선생님과 다른점 :방법 1에서 변수 설정을 제대로 못했다.



@FunctionalInterface
interface Arithmetic2{
	void arithmeticOpr(double a, double b);
}

// 2번째 방법
class ArithmeticImpl implements Arithmetic2{
	@Override
	public void arithmeticOpr(double a, double b) {
		System.out.println("a + b : " + (a + b) + " , " + "a - b :" + (a-b) + " , " + "a * b : " + 		(a*b) + " , " + "a / b" + (a /b)) ;
	}
}

public class ArithmeticOperation_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 실수를 공백을 구분해서 입력 하세요>>");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		// 1. 람다식 : 인터페이스의 추상메소드를 익명 클래스로 생성한 것의 약식표현이다.
		
		Arithmetic2 b1 = (x,y) -> {System.out.println("a + b : " + (x + y) + " , " + "a - b :" + (x-y) + " , " + "a * b : " + 		(x*y) + " , " + "a / b" + (x /y)) ;};
		
		b1.arithmeticOpr(a, b);
		
		// 2. 인터페이스를 구현한 클래스 생성 후 메소드 호출
		Arithmetic2 b2 = new ArithmeticImpl();
		b2.arithmeticOpr(a, b);
		
		// 3. 익명 이너 클래스로 출력
		Arithmetic2 b3 = new Arithmetic2() {
			@Override
			public void arithmeticOpr(double a, double b) {
				System.out.println("a + b : " + (a + b) + " , " + "a - b :" + (a-b) + " , " + "a * b : " + 		(a*b) + " , " + "a / b" + (a /b)) ;
			}
		};
		b3.arithmeticOpr(a, b);
		
		
	 }

}
