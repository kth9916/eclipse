package chap18.EX03;

import java.util.Scanner;

// 1. 스캐너를 사용해서 double의 두 수를 인풋 받습니다.
// 2. 방법 1. 람다식을 사용해서 인풋받은 두 값을 +,-,*,/ 사칙연산을 구현해서 출력.
// 3. 방법 2. 인터페이스를 구현한 자식 객체 사용해서 인풋받은 두 값을 +,-,*,/ 사칙연산을 구현해서 출력.
// 4. 방법 3. 익명 이너클래스를 사용해서 인풋받은 두 값을 +,-,*,/ 사칙연산을 구현해서 출력
// 5. AritimeticException 처리 : 0으로 나누면 예외 발생이 되므로 예외 처리, int(0) , double <<== 해당 사항이 아님

@FunctionalInterface
interface Arithmetic{
	double arithmetic(double a, double b);
}

class Plus implements Arithmetic{

	@Override
	public double arithmetic(double a, double b) {
		return a + b;
	}
}

class Minus implements Arithmetic{
	public double arithmetic(double a, double b) {
		return a - b;
	};
}

class Multiple implements Arithmetic{
	@Override
	public double arithmetic(double a, double b) {
		return a * b;
	}
}

class Divide implements Arithmetic{
	public double arithmetic(double a, double b) {
		return a/b;
	};
}

public class ArithmeticOperation {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// 방법 1
		System.out.println("--------------------------");
		System.out.println("방법 1");
		System.out.println("--------------------------");
		System.out.println("첫 번째 double을 입력하세요");
		double sc1 = sc.nextDouble();
		System.out.println("두 번째 double을 입력하세요");
		double sc2 = sc.nextDouble();
		
		
		Arithmetic a1 = (a,b) -> {return a + b;};	
		System.out.println(a1.arithmetic(sc1, sc2));
		Arithmetic a2 = (a,b) -> {return a - b;};	
		System.out.println(a2.arithmetic(sc1, sc2));
		Arithmetic a3 = (a,b) -> {return a * b;};	
		System.out.println(a3.arithmetic(sc1, sc2));
		Arithmetic a4 = (a,b) -> {return a / b;};	
		System.out.println(a4.arithmetic(sc1, sc2));
		
			
		
		// 방법 2
		System.out.println("--------------------------");
		System.out.println("방법 2");
		System.out.println("--------------------------");
		
		System.out.println("첫 번째 double을 입력하세요");
		double sc3 = sc.nextDouble();
		System.out.println("두 번째 double을 입력하세요");
		double sc4 = sc.nextDouble();
		
		Arithmetic a5 = new Plus();
		System.out.println(a5.arithmetic(sc3, sc4));
		Arithmetic a6 = new Minus();
		System.out.println(a6.arithmetic(sc3, sc4));
		Arithmetic a7 = new Multiple();
		System.out.println(a7.arithmetic(sc3, sc4));
		Arithmetic a8 = new Divide();
		System.out.println(a8.arithmetic(sc3, sc4));
		
		// 방법 3
		System.out.println("--------------------------");
		System.out.println("방법 3");
		System.out.println("--------------------------");
		
		System.out.println("첫 번째 double을 입력하세요");
		double sc5 = sc.nextDouble();
		System.out.println("두 번째 double을 입력하세요");
		double sc6 = sc.nextDouble();
		
		Arithmetic a9 = new Arithmetic() {
			@Override
			public double arithmetic(double a, double b) {
				return a+b;
			}
		};
		Arithmetic a10 = new Arithmetic() {
			@Override
			public double arithmetic(double a, double b) {
				return a-b;
			}
		};
		Arithmetic a11 = new Arithmetic() {
			@Override
			public double arithmetic(double a, double b) {
				return a*b;
			}
		};
		Arithmetic a12 = new Arithmetic() {
			@Override
			public double arithmetic(double a, double b) {
				return a/b;
			}
		};
		
		System.out.println(a9.arithmetic(sc5, sc6));
		System.out.println(a10.arithmetic(sc5, sc6));
		System.out.println(a11.arithmetic(sc5, sc6));
		System.out.println(a12.arithmetic(sc5, sc6));
	}

}
